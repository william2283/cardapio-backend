
# 🍽️ Cardápio Digital - Backend

Este é o **backend** do projeto **Cardápio Digital**, feito em **Java com Spring Boot**.  
Ele é responsável por **receber informações do frontend**, **salvar no banco de dados MySQL** e **retornar os dados quando solicitados**.

---

## 🚀 Tecnologias

- Java 17  
- Spring Boot  
- MySQL (banco de dados)  
- Spring Data JPA  
- Lombok  
- Maven

---

## 🛠️ Ferramentas Utilizadas

- **IntelliJ IDEA** → IDE para desenvolvimento Java e Spring Boot  
- **Postman** → Teste de APIs e requisições HTTP  
- **Git & GitHub** → Controle de versão e repositório remoto  
- **MySQL Workbench** → Gerenciamento do banco de dados  
- **Maven** → Gerenciamento de dependências e build do projeto  

---

## ⚙️ Configuração do Banco de Dados (MySQL)

No arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/cardapio_digital
spring.datasource.username=root
spring.datasource.password=suasenha
spring.jpa.hibernate.ddl-auto=update

### Endpoints

GET /food → Lista todos os alimentos

POST /food → Adiciona um alimento
Request JSON:

{
  "title": "Pizza",
  "image": "pizza.jpg",
  "price": 35
}

