package Lista_02;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        byte escolha;
        float num1, num2, media;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        num1 = input.nextFloat();

        System.out.print("\nDigite o segundo número inteiro: ");
        num2 = input.nextFloat();

        do {
            System.out.println("\nEscolha uma das opções abaixo\n");

            System.out.print("1. Verificar se um dos números lidos é ou não múltiplo do outro\n" +
                    "2. Verificar se os dois números lidos são pares\n" +
                    "3. Verificar se a média dos dois números é maior ou igual a 7.\n" +
                    "4. Sair\n\n");

            System.out.print("Digite a opção do menu: ");
            escolha = input.nextByte();

            switch (escolha){
                case 1:

                    if (num2 % num1 == 0){
                        System.out.printf("\n%.0f é multiplo de %.0f.", num2, num1);
                    } else if (num1 % num2 == 0) {
                        System.out.printf("\n%.0f é multiplo de %.0f.", num1, num2);
                    }

                    else {
                        System.out.println("\nOs números não são multiplos.");
                    }

                    break;

                case 2:

                    if (num1 % 2 == 0 && num2 % 2 == 0){
                        System.out.println("\nOs números são pares.");
                    }

                    else {
                        System.out.println("\nUm ou nenhum número é par.");
                    }
                    break;

                case 3:
                    media = (num1 + num2) / 2;

                    if (media >= 7){
                        System.out.printf("\nA média é: %.2f. A média é maior ou igual a 7.", media);
                    }

                    else {
                        System.out.printf("\nA média é: %.2f. A média é menor que 7.", media);
                    }
                    break;

                case 4:
                    System.out.println("\nSaindo...");
                    break;

                default:
                    System.out.println("\nDigite uma opção válida!");
                    break;
            }

        }while (escolha != 4);

        input.close();
    }
}
