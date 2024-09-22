package Lista_02;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){
        float num1, num2, diferenca;
        Scanner input = new Scanner(System.in);

        System.out.print("Esse é um algoritmo para saber a diferença entre dois números!");

        System.out.print("\n\nDigite o primeiro número: ");
        num1 = input.nextFloat();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextFloat();

        if (num1 > num2){
            diferenca = num1 - num2;

            System.out.printf("O maior número digitado foi: %.2f. E o menor foi: %.2f. E a diferença do maior para o menor é: %.2f", num1, num2, diferenca);
        }
        else if (num1 < num2) {
            diferenca = num2 - num1;

            System.out.printf("O maior número digitado foi: %.2f. E o menor foi: %.2f. E a diferença do maior para o menor é: %.2f", num2, num1, diferenca);
        }
        else {
            System.out.println("Há algo errado!");
        }

        input.close();
    }
}