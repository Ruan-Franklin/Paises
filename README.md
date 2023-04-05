# Paises

Este é um projeto que utiliza Spring Boot no backend, React no frontend e Postgres como banco de dados. Ele também é executado em um contêiner Docker e usa Java 17.

## Configuração

Para executar o projeto, é necessário ter o Docker e o Docker Compose instalados. Depois de clonar o repositório, execute o seguinte comando na raiz do projeto:

```
docker-compose up
```

Isso irá construir as imagens necessárias, iniciar os contêineres e iniciar o aplicativo. O backend estará disponível em `http://localhost:8080` e o frontend em `http://localhost:3000`.

para acessar o banco de dados, use:
`docker exec -it paises_db psql -U postgres`
## Funcionalidades

O aplicativo permite realizar as seguintes operações:

- Adicionar um país
- Atualizar um país existente
- Obter um país específico por ID
- Obter todos os países cadastrados

## Tecnologias utilizadas

- Spring Boot
- React
- Postgres
- Docker
- Java 17
