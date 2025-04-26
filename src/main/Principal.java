package main;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorService conver = new ConversorService();
        String moedaOrigem = "";
        String moedaDestino = "";

        while (true) {
            System.out.println("""
                Escolha o tipo de conversão que deseja:
                1 - De Real para Dolar.
                2 - De Real para Peso Argentino.
                3 - De Dolar para Real.
                4 - De Dolar para Peso Argentino.
                5 - De Peso Argentino para Real.
                6 - De Peso Argentino para Dolar.
                7 - Sair da Aplicação.
                """);
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    moedaOrigem = "BRL";
                    moedaDestino = "USD";
                    break;
                case 2:
                    moedaOrigem = "BRL";
                    moedaDestino = "ARS";
                    break;
                case 3:
                    moedaOrigem = "USD";
                    moedaDestino = "BRL";
                    break;
                case 4:
                    moedaOrigem = "USD";
                    moedaDestino = "ARS";
                    break;
                case 5:
                    moedaOrigem = "ARS";
                    moedaDestino = "BRL";
                    break;
                case 6:
                    moedaOrigem = "ARS";
                    moedaDestino = "USD";
                    break;
                case 7:
                    System.out.println("Saindo da aplicação...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }

            System.out.println("Informe o valor em " + moedaOrigem);
            double valorMoedaOrigem = scanner.nextDouble();

            try {
                InfoMoeda infoMoeda = conver.moeda(moedaOrigem);
                double taxaDeConversao = 0.0;

                switch (moedaDestino) {
                    case "USD":
                        taxaDeConversao = infoMoeda.conversion_rates().USD();
                        break;
                    case "BRL":
                        taxaDeConversao = infoMoeda.conversion_rates().BRL();
                        break;
                    case "ARS":
                        taxaDeConversao = infoMoeda.conversion_rates().ARS();
                        break;
                    default:
                        throw new RuntimeException("Conversão para moeda desconhecida: " + moedaDestino);
                }

                double valorConvertido = valorMoedaOrigem * taxaDeConversao;
                System.out.println("O valor convertido é: " + valorConvertido);

            } catch (RuntimeException e) {
                System.out.println("Erro: " + e.getMessage());
            }

            System.out.println();
        }
    }
}
