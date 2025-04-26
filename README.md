# Conversor de Moedas - Projeto ONE Back-End Java

Este projeto é um **Conversor de Moedas** desenvolvido em Java como parte de um **desafio proposto por instrutores da Alura** no âmbito do programa **Oracle Next Education (ONE) - Back-End Java**.

## Descrição

O objetivo principal do projeto é permitir a conversão de valores monetários entre três moedas:
- Real (BRL)
- Dólar Americano (USD)
- Peso Argentino (ARS)

O programa acessa uma **API pública de taxas de câmbio** para obter os valores de conversão atualizados e realiza a conversão de acordo com a escolha do usuário.

### Funcionalidades
- Conversão de:
    - Real para Dólar
    - Real para Peso Argentino
    - Dólar para Real
    - Dólar para Peso Argentino
    - Peso Argentino para Real
    - Peso Argentino para Dólar
- Tratamento de erros para requisições falhas
- Requisição e consumo de API externa usando `HttpClient`
- Serialização e desserialização de JSON com `Gson`
- Menu interativo em loop para múltiplas operações
- Encerramento seguro da aplicação

## Tecnologias Utilizadas
- Java 17
- Biblioteca `java.net.http.HttpClient` para comunicação HTTP
- Biblioteca `Gson` para conversão de JSON em objetos Java
- API pública: [ExchangeRate-API](https://www.exchangerate-api.com/)


## Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/conversor-moedas.git

## Dependências

- **Java 17** ou superior
- **Gson** (`com.google.code.gson:gson:2.10.1`) - Para converter JSON em objetos Java
- **API pública ExchangeRate-API** - Para buscar as taxas de câmbio


## Autor

Desenvolvido por **Gabriel de Oliveira Cardoso**, como parte do Projeto ONE