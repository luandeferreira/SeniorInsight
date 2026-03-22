plugins {
    kotlin("jvm") version "1.9.23"
}

group = "br.com.seniorinsight"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
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
