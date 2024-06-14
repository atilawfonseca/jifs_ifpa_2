# JIFIS Plataforma

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **JPA (Jakarta Persistence API)**
- **H2 Database (para ambiente de desenvolvimento)**
- **Maven**

## Estrutura do Projeto

### Modelo (`model/Coordenador.java`)

A classe `Coordenador` representa a entidade coordenador com os seguintes atributos:

- `siape` (String): Identificador único do coordenador, com 7 dígitos.
- `nome` (String): Nome do coordenador, entre 3 e 50 caracteres.
- `email` (String): Email do coordenador, que deve ser válido e único.
- `senha` (String): Senha do coordenador, com no mínimo 8 caracteres.
- `telefone` (String): Telefone do coordenador, que deve ser único.

### Serviços (`services/CoordenadoresService.java`)

A classe `CoordenadoresService` fornece os seguintes métodos:

- `cadastrarNovoCoordenador(Coordenador coordenador)`: Cadastra um novo coordenador.
- `buscarCoordenadorPorSiape(String siape)`: Busca um coordenador pelo SIAPE.
- `listarTodosCoordenadores()`: Lista todos os coordenadores cadastrados.

### Aplicação Principal (`JifisPlataformaApplication.java`)

A classe `JifisPlataformaApplication` é a classe principal da aplicação, que contém o método `main` para iniciar o Spring Boot.

## Requisitos

- **Java 17** ou superior
- **Maven** para gerenciamento de dependências

## Como Rodar o Projeto

1. **Clone o Repositório:**

    ```bash
    git clone https://github.com/seu-usuario/jifis-plataforma.git
    cd jifis-plataforma
    ```

2. **Configuração do Banco de Dados:**

    O projeto está configurado para usar o H2 Database em memória, que não requer configuração adicional para desenvolvimento. 

3. **Compilar e Rodar a Aplicação:**

    Execute o seguinte comando para compilar e rodar a aplicação:

    ```bash
    mvn spring-boot:run
    ```

4. **Acessar a Aplicação:**

    A aplicação estará disponível em `http://localhost:8081`.

## Estrutura dos Endpoints

A aplicação pode ser extendida para fornecer endpoints RESTful utilizando Spring Web. Exemplo de possíveis endpoints:

- `POST /coordenadores`: Para cadastrar um novo coordenador.
- `GET /coordenadores/{siape}`: Para buscar um coordenador pelo SIAPE.
- `GET /coordenadores`: Para listar todos os coordenadores.
