package br.com.alura.conversorDeMoedas.funcoes;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void mensagemDeBoasVindas(){
        System.out.println("*******************************************");
        System.out.println("Seja bem-vindo(a) ao Conversor de Moedas! \n");
    }

    public void menuDeOpcoes(){
        System.out.println("""
                1) Dólar Americano --> Real Brasileiro
                2) Real Brasileiro --> Dólar Americano
                3) Dólar Americano --> Peso Argentino
                4) Peso Argentino --> Dólar Americano
                5) Dólar Americano --> Peso Colombiano
                6) Peso Colombiano --> Dólar Americano
                7) Sair
                
                *******************************************
                
                Escolha uma opção válida: 
                """);
    }

    public String escolhaMoeda(int opcao){

        while (opcao != 7) {
            if (opcao == 1) {
                return "/USD/BRL";
            } else if (opcao == 2) {
                return "/BRL/USD";
            } else if (opcao == 3) {
                return "/USD/ARS";
            } else if (opcao == 4) {
                return "/ARS/USD";
            } else if (opcao == 5) {
                return "/USD/COP";
            } else if (opcao == 6) {
                return "/COP/USD";
            } else {
                System.out.println("Opção inválida. Tente novamente: ");
                opcao = scanner.nextInt();
                escolhaMoeda(opcao);
            }

        }

        return null;
    }
}
