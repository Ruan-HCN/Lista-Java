package Lista_03;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args){
        //declaração de variaveis
        double num;
        boolean verifica;
        String continuar, negpo, imppar;
        Scanner input = new Scanner(System.in);

        //inicio do while
        do {
            //inicia um loop para verificar se o numero é inteiro ou float;
            do {
                System.out.print("\nDigite um número inteiro: ");
                num = input.nextDouble();

                verifica = (num == (int) num);

                if (verifica){
                    break;
                }

                else {
                    System.out.println("Digite um número inteiro!");
                }
            }while (true);

            //inicio dos operadores ternarios para saber s eo numero é impar ou par, e negativo ou positivo
            negpo = (num < 0) ? "negativo" : "positivo";
            imppar = (num % 2 == 0) ? "Par" : "ímpar";

            System.out.printf("\n%.0f é %s e %s.", num, negpo, imppar);

            //limpa o buffer e pergunta se quer continuar ou nao
            input.nextLine();
            System.out.print("\n\nVocê quer continuar (s | n): ");
            continuar = input.nextLine();

        }while (continuar.equals("s") || continuar.equals("S"));

        input.close();
    }
}