# 🧠 SeniorInsight AI

**Transformando dados de smartwatches em tranquilidade e cuidado preventivo.**

O **SeniorInsight AI** é um módulo de inteligência médica e preventiva voltado para o cuidado compartilhado de idosos. Ele resolve o problema da fragmentação de dados de saúde ao centralizar métricas coletadas por smartwatches (batimentos, sono, movimento) e cruzá-las com registros manuais (ex: medicamentos), gerando uma **Timeline Inteligente** e **Alertas Preditivos**.

> Projeto desenvolvido para a disciplina de **Teste de Software (Universidade Católica de Brasília)**.

---

## 🎯 Funcionalidades (Escopo MVP)

Para garantir a excelência técnica e a alta cobertura de testes (**TDD**), o MVP foca em 4 pilares:

### 📊 Monitoramento e Alertas
Detecção de anomalias, como longos períodos de inatividade.

### 🕒 Timeline de Saúde
Dashboard com o histórico consolidado de batimentos, sono e atividade física.

### 💊 Gestão de Medicamentos
Registro manual de remédios e sua correlação direta com os dados biométricos.

### 🚨 SOS
Acionamento rápido de botão de emergência.

---

## 🛠️ Tecnologias e Arquitetura

O projeto foi construído seguindo os princípios de **DDD (Domain-Driven Design)** para garantir baixo acoplamento e facilitar os testes de software.

- **Linguagem:** Kotlin (JVM)
- **Gerenciador de Dependências:** Gradle
- **Testes (TDD):**
    - JUnit 5 (Testes Unitários)
    - Mockk (Mocking de dependências)
- **Arquitetura:**
    - Camadas isoladas:
        - `domain`
        - `data`
        - `presentation`

---

## 🚀 Como Executar o Projeto

Clone o repositório para a sua máquina:

```bash
git clone https://github.com/SEU-USUARIO/SeniorInsight.git
cd SeniorInsight
```
Abra a pasta do projeto no IntelliJ IDEA.

Aguarde o Gradle baixar as dependências automaticamente.

Para compilar e rodar a suíte de testes via terminal, utilize o Gradle Wrapper:

```bash
./gradlew build
./gradlew test
```

👥 Contribuidores

Este projeto foi construído colaborativamente pelos seguintes membros:

| Nome         |  GitHub |
|--------------|--------|
| Luan Ferreira |[@luandeferreira](https://github.com/luandeferreira) |
| Pedro Paulo  |[@PedroPSLago](https://github.com/PedroPSLago) |
| Raquel Souza |[@raquelpds](https://github.com/raquelpds) |
| Natália Cruzeiro |[@natcruzeiro](https://github.com/natcruzeiro) |
| Sara Cristina |[@SarinhaX4](https://github.com/SarinhaX4) |
| Tiago   |[@tiagoaschulz](https://github.com/tiagoaschulz) |
| Victor       |[@vctrdavidsom ](github.com/vctrdavidsom) |
| Adenilson    |[@eng-adenilson](https://github.com/eng-adenilson) |

Este projeto tem a licença MIT, permitindo uso, cópia, modificação e distribuição livre, desde que a atribuição seja mantida. Para mais detalhes, consulte o arquivo [LICENSE](/LICENSE).
