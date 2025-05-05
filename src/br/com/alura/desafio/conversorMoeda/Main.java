package br.com.alura.desafio.conversorMoeda;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InputMismatchException {
        Conn conexao = new Conn();

        int opcao = 0;
        double valor;
        double conversao;
        String moeda1;
        String moeda2;

        Scanner leitura = new Scanner(System.in);
        try {
            while (opcao != 7) {
                System.out.println("\n*******************************************************");
                System.out.println("Seja bem vindo/a ao Conversor de Moeda =]");
                System.out.println("\n1) Dólar =>> Peso argentino");
                System.out.println("2) Peso argentino =>> Dólar");
                System.out.println("3) Dólar =>> Real brasileiro");
                System.out.println("4) Real brasileiro =>> Dólar");
                System.out.println("5) Dólar =>> Peso colombiano");
                System.out.println("6) Peso colombiano =>> Dólar");
                System.out.println("7) Sair");
                System.out.println("Escolha uma opção válida:");
                System.out.println("*******************************************************\n");

                opcao = leitura.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite o valor que deseja converter:");
                        valor = leitura.nextDouble();

                        moeda1 = "USD";
                        moeda2 = "ARS";

                        conversao = conexao.resquest(moeda1, moeda2) * valor;

                        System.out.println("Valor " + valor + " [" + moeda1 + "]" + " corresponde ao valor final de =>> " + conversao + " [" + moeda2 + "]");
                        break;

                    case 2:
                        System.out.println("Digite o valor que deseja converter:");
                        valor = leitura.nextDouble();

                        moeda1 = "ARS";
                        moeda2 = "USD";

                        conversao = conexao.resquest(moeda1, moeda2) * valor;

                        System.out.println("Valor " + valor + " [" + moeda1 + "]" + " corresponde ao valor final de =>> " + conversao + " [" + moeda2 + "]");
                        break;
                    case 3:
                        System.out.println("Digite o valor que deseja converter:");
                        valor = leitura.nextDouble();

                        moeda1 = "USD";
                        moeda2 = "BRL";

                        conversao = conexao.resquest(moeda1, moeda2) * valor;

                        System.out.println("Valor " + valor + " [" + moeda1 + "]" + " corresponde ao valor final de =>> " + conversao + " [" + moeda2 + "]");
                        break;
                    case 4:
                        System.out.println("Digite o valor que deseja converter:");
                        valor = leitura.nextDouble();

                        moeda1 = "BRL";
                        moeda2 = "USD";

                        conversao = conexao.resquest(moeda1, moeda2) * valor;

                        System.out.println("Valor " + valor + " [" + moeda1 + "]" + " corresponde ao valor final de =>> " + conversao + " [" + moeda2 + "]");
                        break;
                    case 5:
                        System.out.println("Digite o valor que deseja converter:");
                        valor = leitura.nextDouble();

                        moeda1 = "USD";
                        moeda2 = "COP";

                        conversao = conexao.resquest(moeda1, moeda2) * valor;

                        System.out.println("Valor " + valor + " [" + moeda1 + "]" + " corresponde ao valor final de =>> " + conversao + " [" + moeda2 + "]");
                        break;
                    case 6:
                        System.out.println("Digite o valor que deseja converter:");
                        valor = leitura.nextDouble();

                        moeda1 = "COP";
                        moeda2 = "USD";

                        conversao = conexao.resquest(moeda1, moeda2) * valor;

                        System.out.println("Valor " + valor + " [" + moeda1 + "]" + " corresponde ao valor final de =>> " + conversao + " [" + moeda2 + "]");
                        break;
                    case 7:
                        System.out.println("Saindo....");
                        break;
                    default:
                        System.out.println("\nOpção inválida!!");
                }
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro, opção inválida! " + e.getMessage());
        }
    }
}