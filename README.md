# MapaAcessibilidade - Back-End

## 🧠 Sobre

Este é o back-end do projeto **MapaAcessibilidade**, uma aplicação que permite o cadastro e consulta de locais acessíveis ou não acessíveis no município de Criciúma, Santa Catarina.

A API fornece suporte, cadastro de locais e consulta das informações via integração com o front-end em Angular.

## 🚀 Tecnologias utilizadas

- Java 21
- Spring Boot 3.x
- Spring Security
- Spring Data JPA
- PostgreSQL
- Maven


## 🧪 Como executar o projeto localmente

### Pré-requisitos

- Java 17 ou superior
- Maven
- PostgreSQL
- (Opcional) Docker

### Passos

1. Clone o repositório:

```
git clone https://github.com/seu-usuario/mapa-acessibilidade-backend.git
cd mapa-acessibilidade-backend
```

2. Configure o banco de dados no application-dev.properties:

``` 
spring.datasource.url=jdbc:postgresql://localhost:5432/mapa_acessibilidade
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```
3. Configure o banco de dados no application.properties:

```
spring.profiles.active=dev
spring.liquibase.change-log=classpath:db/changelog/changelog-master.xml
```

3. Configure o banco de dados no liquibase-dev.properties:

```
url=jdbc:postgresql://localhost:5432/mapa_acessibilidade
username=seu_usuario
password=sua_senha
driver=org.postgresql.Driver
changeLogFile=src/main/resources/db/changelog/changelog-master.xml
```

4. Execute o liquibase:

```
mvn liquibase:update -Pdev
```

5. Execute a aplicação:

```
mvn spring-boot:run
```
A API estará disponível em: http://localhost:8080/api/