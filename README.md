# Projeto de Ecommerce com Spring Boot, Spring Security e PostgreSQL

## Descrição do Projeto

Este é um projeto de ecommerce desenvolvido com Spring Boot, utilizando Spring Security para autenticação e autorização e PostgreSQL como banco de dados. O objetivo do projeto é criar uma plataforma segura e escalável para a compra e venda de produtos online.

## Tecnologias Utilizadas

- **Spring Boot**: Framework para a construção de aplicações Java de maneira rápida e eficiente.
- **Spring Security**: Módulo de segurança que fornece autenticação e controle de acesso.
- **PostgreSQL**: Sistema de gerenciamento de banco de dados relacional robusto e escalável.

## Arquitetura MVC

O projeto segue a arquitetura MVC (Model-View-Controller), que separa a aplicação em três componentes principais:

- **Model**: Representa os dados da aplicação. No nosso projeto, são as entidades e repositórios que interagem com o banco de dados PostgreSQL.
- **View**: A camada de visualização, responsável pela interface com o usuário. Utilizamos templates HTML para renderizar as páginas do ecommerce.
- **Controller**: Intermediário entre a View e o Model. Recebe as solicitações dos usuários, processa-as (possivelmente interagindo com o Model) e retorna a resposta adequada.

## Importância da Segurança

A segurança é um aspecto crucial em qualquer aplicação de ecommerce. Com o uso de Spring Security, garantimos que apenas usuários autenticados e autorizados possam acessar certas partes da aplicação. Isso inclui:

- **Autenticação**: Verificação da identidade do usuário antes de permitir o acesso.
- **Autorização**: Controle de acesso baseado em roles (perfis de usuário), assegurando que apenas usuários com permissões adequadas possam executar determinadas ações.
- **Proteção contra ataques comuns**: Implementação de práticas para evitar ataques como CSRF (Cross-Site Request Forgery) e XSS (Cross-Site Scripting).


## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

---

# Ecommerce Project with Spring Boot, Spring Security, and PostgreSQL

## Project Description

This is an ecommerce project developed with Spring Boot, using Spring Security for authentication and authorization, and PostgreSQL as the database. The project's goal is to create a secure and scalable platform for buying and selling products online.

## Technologies Used

- **Spring Boot**: Framework for building Java applications quickly and efficiently.
- **Spring Security**: Security module providing authentication and access control.
- **PostgreSQL**: Robust and scalable relational database management system.

## MVC Architecture

The project follows the MVC (Model-View-Controller) architecture, which divides the application into three main components:

- **Model**: Represents the application's data. In our project, these are the entities and repositories interacting with the PostgreSQL database.
- **View**: The presentation layer responsible for the user interface. We use HTML templates to render the ecommerce pages.
- **Controller**: Intermediary between the View and the Model. It handles user requests, processes them (possibly interacting with the Model), and returns the appropriate response.

## Importance of Security

Security is a crucial aspect of any ecommerce application. By using Spring Security, we ensure that only authenticated and authorized users can access certain parts of the application. This includes:

- **Authentication**: Verifying the user's identity before granting access.
- **Authorization**: Role-based access control, ensuring that only users with appropriate permissions can perform certain actions.
- **Protection against common attacks**: Implementing practices to prevent attacks such as CSRF (Cross-Site Request Forgery) and XSS (Cross-Site Scripting).

---

## Instalação e Configuração

### Pré-requisitos

- Java 11 ou superior
- Maven
- PostgreSQL

## Contributions
Contributions are welcome! Feel free to open issues or submit pull requests.
