plugins {
    kotlin("jvm") version "1.9.23"
}

group = "br.com.seniorinsight"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

kotlin {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    // Kotlin stdlib (Essencial para projetos Kotlin)
    implementation(kotlin("stdlib"))

    // Biblioteca padrão de testes do Kotlin
    testImplementation(kotlin("test"))

    // JUnit 5 (Essencial para o TDD exigido pelo professor)
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")

    // Mockk (Para vocês mockarem o smartwatch e o banco de dados)
    testImplementation("io.mockk:mockk:1.13.10")
}

tasks.test {
    useJUnitPlatform()

    // Mostra os resultados dos testes no terminal
    testLogging {
        events("passed", "skipped", "failed")
    }
}

// ============================================
// CONFIGURAÇÕES DE DEPLOYMENT E EXECUTION
// ============================================

// Task para criar JAR executável
tasks.jar {
    manifest {
        attributes(
            "Main-Class" to "br.com.seniorinsight.presentation.MainKt",
            "Implementation-Title" to project.name,
            "Implementation-Version" to project.version
        )
    }
}

// Task para criar JAR fat (com todas as dependências)
tasks.register<Jar>("fatJar") {
    archiveClassifier.set("fat")
    manifest {
        attributes(
            "Main-Class" to "br.com.seniorinsight.presentation.MainKt",
            "Implementation-Title" to project.name,
            "Implementation-Version" to project.version
        )
    }
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    with(tasks.jar.get())
}

// Task customizada para rodar a aplicação
tasks.register<JavaExec>("run") {
    group = "application"
    description = "Executa a aplicação SeniorInsight"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("br.com.seniorinsight.presentation.MainKt")
}

// Task para build completo com relatórios
tasks.register("deploy") {
    group = "build"
    description = "Prepara o projeto para deployment"
    dependsOn("clean", "build", "fatJar", "test")

    doLast {
        println("\n" + "=".repeat(50))
        println("✓ Build completo finalizado com sucesso!")
        println("=".repeat(50))
        println("\nArtefatos gerados:")
        println("  → JAR Simples: build/libs/SeniorInsight-${version}.jar")
        println("  → JAR Fat (com deps): build/libs/SeniorInsight-${version}-fat.jar")
        println("  → Relatórios de teste: build/reports/tests/test/index.html")
        println("\nPara executar:")
        println("  → Terminal: ./gradlew run")
        println("  → JAR: java -jar build/libs/SeniorInsight-${version}-fat.jar")
        println("=".repeat(50) + "\n")
    }
}

// Tarefa obrigatória para o Heroku conseguir compilar e fazer o deploy
tasks.register("stage") {
    dependsOn("clean", "build")
}