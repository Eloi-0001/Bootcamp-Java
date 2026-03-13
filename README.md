# 🎬 Amazing Movies - API de Catálogo de Filmes

API RESTful desenvolvida em Java com Spring Boot para gerenciamento de um catálogo de filmes. O projeto permite realizar operações de CRUD (Create, Read, Update, Delete) em uma base de dados de filmes.

## 📋 Sobre o Projeto

Este projeto foi desenvolvido como parte do Bootcamp de Java, com o objetivo de praticar conceitos de desenvolvimento de APIs REST, integração com banco de dados JPA/Hibernate e boas práticas de programação.

### Funcionalidades
- ✅ Cadastrar novos filmes
- ✅ Consultar filmes por ID
- ✅ Atualizar informações de filmes
- ✅ Remover filmes do catálogo

## 🚀 Tecnologias Utilizadas

| Tecnologia | Versão |
|------------|--------|
| Java | 17 |
| Spring Boot | 3.x |
| Spring Data JPA | - |
| H2 Database | - |
| Maven | - |
| Postman | - |

## 🔧 Configuração do Ambiente

### Pré-requisitos
- JDK 17 ou superior
- Maven 3.6 ou superior
- IDE de sua preferência (IntelliJ, Eclipse, VS Code)
- Postman ou Insomnia para testar os endpoints

### Passos para Execução

1. **Clone o repositório**
```bash
git clone https://github.com/Eloi-0001/Bootcamp-Java.git
```

2. **Acesse a branch do projeto**
```bash
cd Bootcamp-Java
git checkout API-Filmes
```

3. **Execute a aplicação com Maven**
```bash
./mvnw spring-boot:run
# ou no Windows:
mvnw.cmd spring-boot:run
```

4. **Acesse o console do H2 Database** (opcional)
```
URL: http://localhost:8080/banco-filme
JDBC URL: jdbc:h2:mem:filmes
Username: sa
Password: password
```

A aplicação estará disponível em `http://localhost:8080`

## 📊 Estrutura do Banco de Dados

```sql
CREATE TABLE filmes (
    id VARCHAR(50) NOT NULL PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    genero VARCHAR(100),
    classificacao VARCHAR(20),
    diretor VARCHAR(255),
    duracao DECIMAL(4,2),
    preco DECIMAL(4,2),
    ano_publicacao INTEGER,
    em_cartaz BOOLEAN DEFAULT false
);
```

## 📚 Documentação da API

### Endpoints

#### 1. Cadastrar Filme
`POST /filmes`

**Request Body:**
```json
{
    "titulo": "O Poderoso Chefão",
    "genero": "Drama",
    "classificacao": "18 anos",
    "diretor": "Francis Ford Coppola",
    "duracao": 175.0,
    "preco": 29.90,
    "anoPublicacao": 1972,
    "emCartaz": false
}
```

**Response:** 200 OK
```json
{
    "id": "550e8400-e29b-41d4-a716-446655440000",
    "titulo": "O Poderoso Chefão",
    "genero": "Drama",
    "classificacao": "18 anos",
    "diretor": "Francis Ford Coppola",
    "duracao": 175.0,
    "preco": 29.90,
    "anoPublicacao": 1972,
    "emCartaz": false
}
```

#### 2. Consultar Filme por ID
`GET /filmes/{id}`

**Exemplo:** `GET /filmes/550e8400-e29b-41d4-a716-446655440000`

**Response:** 200 OK
```json
{
    "id": "550e8400-e29b-41d4-a716-446655440000",
    "titulo": "O Poderoso Chefão",
    "genero": "Drama",
    "classificacao": "18 anos",
    "diretor": "Francis Ford Coppola",
    "duracao": 175.0,
    "preco": 29.90,
    "anoPublicacao": 1972,
    "emCartaz": false
}
```

#### 3. Atualizar Filme
`PUT /filmes/{id}`

**Exemplo:** `PUT /filmes/550e8400-e29b-41d4-a716-446655440000`

**Request Body:**
```json
{
    "titulo": "O Poderoso Chefão",
    "genero": "Drama/Crime",
    "classificacao": "18 anos",
    "diretor": "Francis Ford Coppola",
    "duracao": 175.0,
    "preco": 35.90,
    "anoPublicacao": 1972,
    "emCartaz": true
}
```

**Response:** 200 OK (sem corpo)

#### 4. Remover Filme
`DELETE /filmes/{id}`

**Exemplo:** `DELETE /filmes/550e8400-e29b-41d4-a716-446655440000`

**Response:** 200 OK (sem corpo)

## 📦 Exemplos com CURL

### Cadastrar um filme
```bash
curl -X POST http://localhost:8080/filmes \
  -H "Content-Type: application/json" \
  -d '{
    "titulo": "Interestelar",
    "genero": "Ficção Científica",
    "classificacao": "12 anos",
    "diretor": "Christopher Nolan",
    "duracao": 169.0,
    "preco": 34.90,
    "anoPublicacao": 2014,
    "emCartaz": true
  }'
```

### Consultar um filme
```bash
curl http://localhost:8080/filmes/550e8400-e29b-41d4-a716-446655440000
```

### Atualizar um filme
```bash
curl -X PUT http://localhost:8080/filmes/550e8400-e29b-41d4-a716-446655440000 \
  -H "Content-Type: application/json" \
  -d '{
    "titulo": "Interestelar",
    "genero": "Ficção Científica/Aventura",
    "classificacao": "12 anos",
    "diretor": "Christopher Nolan",
    "duracao": 169.0,
    "preco": 29.90,
    "anoPublicacao": 2014,
    "emCartaz": false
  }'
```

### Remover um filme
```bash
curl -X DELETE http://localhost:8080/filmes/550e8400-e29b-41d4-a716-446655440000
```

## 🗂️ Estrutura do Projeto

```
Bootcamp-Java/
└── API-Filmes/
    └── crudFilmes/
        ├── src/
        │   ├── main/
        │   │   ├── java/com/amzingMovies/crudFilmes/
        │   │   │   ├── controller/
        │   │   │   │   └── filmeController.java
        │   │   │   ├── model/
        │   │   │   │   └── Filme.java
        │   │   │   ├── repository/
        │   │   │   │   └── FilmesRepository.java
        │   │   │   └── CrudFilmesApplication.java
        │   │   └── resources/
        │   │       ├── application.yml
        │   │       └── data.sql
        │   └── test/
        └── pom.xml
```

## 📝 Configurações do Projeto

### application.yml
```yaml
spring:
  application:
    name: crudFilmes
  datasource:
    url: jdbc:h2:mem:filmes
    username: sa
    password: password
  jpa:
    database-platform: org.hibernate.dialect.H2Dialect
  h2:
    console:
      enabled: true
      path: /banco-filme
```


## ✨ Autor

Eloi-0001 - [GitHub Profile](https://github.com/Eloi-0001)

---
