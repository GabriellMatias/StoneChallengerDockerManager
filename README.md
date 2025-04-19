# 🐳 Docker Manager - Desafio Stone

Este projeto foi desenvolvido como parte do **Desafio da Stone** e tem como objetivo fornecer uma aplicação capaz de **gerenciar containers Docker** de forma simples e eficiente. Com ele, é possível **criar**, **listar**, **buscar**, **deletar** e **gerenciar containers** diretamente via interface de linha de comando.

## ✨ Funcionalidades

- 📦 Criar novos containers a partir de imagens Docker
- 🔍 Listar todos os containers (ativos, inativos, etc)
- 🔎 Buscar containers por nome ou ID
- ❌ Deletar containers
- ♻️ Reiniciar, parar e iniciar containers
- 📋 Exibir detalhes do container, como portas, volumes, status, etc

## ⚙️ Tecnologias utilizadas

- Java 21
- Maven
- Docker Java Client
- SLF4J / Logback (para logging)

## 🚀 Como executar o projeto

### Pré-requisitos

- Java 21+ instalado
- Maven instalado
- Docker instalado e em execução

### Clonando o projeto

```bash
git clone https://github.com/seu-usuario/docker-manager.git
cd docker-manager
mvn clean install
java -jar target/docker-manager-1.0-SNAPSHOT.jar
```

## 📌 Observações
### Este projeto é um protótipo proposto no desafio técnico da Stone. Futuras melhorias podem incluir:

- Interface web com Spring Boot ou React

- Integração com Docker Compose

- Autenticação e segurança

