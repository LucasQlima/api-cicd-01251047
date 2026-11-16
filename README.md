# api-cicd-01251047

API REST em Java 21 + Spring Boot com pipeline de CI/CD usando GitHub Actions, Docker Hub e EC2 (AWS).

## Endpoints
- `GET /hello` - mensagem da versão atual
- `GET /actuator/health` - status da aplicação

## Fluxo
GitHub -> GitHub Actions (CI) -> Docker Hub -> CD (self-hosted runner) / Watchtower -> EC2

## Workflows
- `ci.yml`: build e testes em push/PR para `develop` e `main`; build e push da imagem para o Docker Hub em push na `main`.
- `cd.yml`: após o CI da `main` passar, roda no runner da EC2 (pull, stop, rm, run na porta 8080).

## Secrets necessários
- `DOCKERHUB_USERNAME`
- `DOCKERHUB_TOKEN`
