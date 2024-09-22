package Lista_03;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args){
        //declaração de variáveis
        short opcao;
        float num1, num2;
        String continuar;
        Scanner input = new Scanner(System.in);

        //inicio do loop
        do {
            //Menu e pede para escolher uma opção
            System.out.print("\nEsolha uma das opções aabixo:");
            System.out.print("\n\n1. Adição\n2. Subtração\n3. Multiplicação\n4. Divisão");
            System.out.print("\n\nDigite o número da opção: ");
            opcao = input.nextShort();

            //switch case de acordo com o menu, pede dois números e faz a operação
            switch (opcao){
                case 1:
                    System.out.print("\nDigite o 1º número: ");
                    num1 = input.nextFloat();

                    System.out.print("\nDigite o 2º número: ");
                    num2 = input.nextFloat();

                    System.out.printf("\n%.2f + %.2f = %.2f", num1, num2, num1 + num2);
                    break;

                case 2:
                    System.out.print("\nDigite o 1º número: ");
                    num1 = input.nextFloat();

                    System.out.print("\nDigite o 2º número: ");
                    num2 = input.nextFloat();

                    System.out.printf("\n%.2f - %.2f = %.2f", num1, num2, num1 - num2);
                    break;

                case 3:
                    System.out.print("\nDigite o 1º número: ");
                    num1 = input.nextFloat();

                    System.out.print("\nDigite o 2º número: ");
                    num2 = input.nextFloat();

                    System.out.printf("\n%.2f x %.2f = %.2f", num1, num2, num1 * num2);
                    break;

                case 4:
                    System.out.print("\nDigite o 1º número: ");
                    num1 = input.nextFloat();

                    System.out.print("\nDigite o 2º número: ");
                    num2 = input.nextFloat();

                    System.out.printf("\n%.2f / %.2f = %.2f", num1, num2, num1 / num2);
                    break;

                default:
                    System.out.println("\nDigite uma opção válida!");
                    break;
            }

            //limpa o buffer, e pergunta se quer voltar ao menu
            input.nextLine();
            System.out.print("\n\nVocê quer voltar ao menu (s | n): ");
            continuar = input.nextLine();
        }while (continuar.equals("s") || continuar.equals("S"));
        input.close();
    }
}
