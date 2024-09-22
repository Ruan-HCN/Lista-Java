package Lista_02;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args){
        float num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num1 = input.nextFloat();

        System.out.print("Digite outro Número: ");
        num2 = input.nextFloat();

        String terno = (num1 > num2) ? "\nO maior número digitado foi: " + num1 + ". E o menor número foi: " + num2 + "." :
                (num1 < num2) ? "\nO maior número digitado foi: " + num2 + ". E o menor número foi: " + num1 + "." :
                        "\nOs números são iguais!";

        System.out.println(terno);

        input.close();
    }
}
