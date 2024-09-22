package Lista_02;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args){
        float num1, num2;
        byte opcao;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        num1 = input.nextFloat();

        System.out.print("\nDigite outro numero inteiro: ");
        num2 = input.nextFloat();

        do {
            System.out.println("\n1.Multiplicar");
            System.out.println("2.Dividir");
            System.out.println("3.Somar");
            System.out.println("4.Subtrair");
            System.out.println("0.Sair");

            System.out.print("\nEscolha o numero referente a operação: ");
            opcao = input.nextByte();


            switch (opcao){
                case 1:
                    System.out.printf("%.2f x %.2f é igual a: %.2f.\n", num1, num2, num1 * num2);
                    break;

                case 2:
                    System.out.printf("%.2f ÷ %.2f é igual a: %.2f.\n", num1, num2, num1 / num2);
                    break;

                case 3:
                    System.out.printf("%.2f + %.2f é igual a: %.2f.\n", num1, num2, num1 + num2);
                    break;

                case 4:
                    System.out.printf("%.2f - %.2f é igual a: %.2f.\n", num1, num2, num1 - num2);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    System.out.printf("Os numeros digitados foram: %.2f e %.2f.\n", num1, num2);
                    break;

                default:
                    System.out.println("Digite um opção valida!");
                    break;
            }
        } while (opcao != 0);
    }
}
