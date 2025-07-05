# Projeto Web Services com Spring Boot e JPA / Hibernate

Este projeto foi desenvolvido como parte de um curso prático de Java com Spring Boot, com foco na construção de uma API RESTful moderna e bem estruturada. O objetivo principal foi aprofundar o conhecimento em desenvolvimento backend usando ferramentas amplamente utilizadas no mercado.

---

## 🔍 Objetivo do Projeto

O principal objetivo deste projeto foi construir um sistema de web services completo, aplicando os conceitos fundamentais do **Spring Boot** para gerenciar o backend de uma aplicação. Isso incluiu a criação de um **modelo de domínio robusto**, a **persistência de dados com JPA/Hibernate** e a implementação de **operações CRUD** com um **tratamento de exceções eficaz**.

---

## 🚀 Tecnologias Utilizadas

Este projeto foi construído com as seguintes tecnologias e ferramentas:

* **Java 17**: A linguagem de programação principal, utilizada com as últimas funcionalidades.
* **Spring Boot**: Framework essencial para o desenvolvimento rápido e eficiente de aplicações Java.
* **Spring Data JPA**: Simplifica o acesso a dados e a interação com bancos de dados relacionais.
* **Hibernate**: Implementação da JPA, responsável pelo mapeamento objeto-relacional.
* **Maven**: Ferramenta de gerenciamento de dependências e construção do projeto.
* **H2 Database**: Banco de dados em memória utilizado para testes e desenvolvimento local.
* **PostgreSQL**: Banco de dados relacional robusto, configurado para ambientes de desenvolvimento e produção.
* **Heroku (Opcional)**: Plataforma de nuvem para deploy e hospedagem da aplicação.

---

## ✨ Funcionalidades e Aprendizados

Durante o desenvolvimento deste projeto, explorei e implementei diversas funcionalidades e conceitos importantes:

### Estrutura do Projeto e Modelo de Domínio
* **Spring Initializr**: Inicialização rápida do projeto com as dependências necessárias.
* **Modelo de Domínio Completo**: Criação de entidades como `User`, `Order`, `Category`, `Product`, `OrderItem` e `Payment`, representando um cenário de e-commerce.
* **Associações Complexas**: Mapeamento de relacionamentos entre entidades, incluindo:
    * **Um-para-Um**: Exemplo com `Order` e `Payment`.
    * **Um-para-Muitos**: Exemplo com `User` e `Order`, `Order` e `OrderItem`, `Product` e `OrderItem`.
    * **Muitos-para-Muitos**: Com `Product` e `Category`, utilizando `JoinTable`.
    * **Muitos-para-Muitos com Atributos Extras**: Implementado via `OrderItem` para registrar quantidade e preço no momento da compra.
* **Encapsulamento**: Uso de construtores, getters e setters, e métodos para garantir a integridade dos dados.
* **`hashCode` e `equals`**: Sobrescrita para comparação correta de objetos.
* **Enumerações**: Utilização de `OrderStatus` para tipagem segura dos estados de um pedido.
* **`JsonIgnore` e Lazy Loading**: Gerenciamento de referências cíclicas e otimização de carregamento de dados em associações complexas para evitar sobrecarga de memória e melhorar a performance da API.

### Persistência de Dados e Banco de Dados
* **JPA & H2**: Configuração de um banco de dados H2 em memória para um ambiente de desenvolvimento e testes ágil.
* **JPA & PostgreSQL**: Configuração para um banco de dados PostgreSQL, ideal para ambientes de produção.
* **Spring Data JPA Repositories**: Criação de interfaces que estendem `JpaRepository`, permitindo operações de persistência e consulta de forma declarativa.
* **Database Seeding**: População inicial do banco de dados com dados de teste para facilitar o desenvolvimento e a demonstração.

### Camadas da Aplicação e Operações RESTful
* **Arquitetura em Camadas**: Organização do projeto em camadas claras:
    * **Resource**: Camada de controle REST, responsável por receber requisições HTTP e retornar respostas.
    * **Service**: Camada de lógica de negócio, onde as regras de negócio são aplicadas.
    * **Repository**: Camada de acesso a dados, interagindo diretamente com o banco de dados.
* **CRUD Completo**: Implementação das operações de **Criação (Create)**, **Leitura (Retrieve)**, **Atualização (Update)** e **Exclusão (Delete)** para as entidades principais.
* **Injeção de Dependência**: Uso extensivo do mecanismo de injeção de dependência do Spring para gerenciar o ciclo de vida dos componentes.

### Tratamento de Exceções
* **Exceções Personalizadas**: Criação de exceções customizadas (`ResourceNotFoundException`, `DatabaseException`) para cenários específicos da aplicação, tornando o tratamento de erros mais semântico.
* **`@ControllerAdvice` e `@ExceptionHandler`**: Implementação de um manipulador de exceções global para centralizar o tratamento de erros e retornar respostas padronizadas (`StandardError`) para o cliente da API.
* **Tratamento de Erros de Banco de Dados**: Captura e tratamento de exceções como `EmptyResultDataAccessException` e `DataIntegrityViolationException` para fornecer feedback mais amigável ao usuário.

### Deploy em Nuvem (Heroku)
* **Perfis de Aplicação**: Configuração de diferentes perfis (test, dev, prod) para gerenciar configurações específicas de ambiente, como conexão com banco de dados e variáveis de ambiente.
* **Heroku CLI**: Utilização da interface de linha de comando para autenticação, configuração e deploy contínuo da aplicação na plataforma Heroku.
* **Variáveis de Configuração**: Gerenciamento de variáveis de ambiente do Heroku (`DATABASE_URL`, `JWT_SECRET`, `JWT_EXPIRATION`) para dados sensíveis e configurações dinâmicas.

---

Este projeto não apenas solidificou meus conhecimentos em **desenvolvimento de web services com Spring Boot**, mas também me proporcionou uma compreensão aprofundada da **persistência de dados com JPA/Hibernate** e das **melhores práticas para lidar com erros e implantar aplicações em ambientes de nuvem**. É um passo fundamental para a construção de sistemas robustos e escaláveis.
