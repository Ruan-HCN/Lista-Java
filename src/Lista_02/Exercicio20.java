package Lista_02;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Digite um valor inteiro maior que zero para A: ");
            a = input.nextInt();
        }while (a <= 0);

        do {
            System.out.print("Digite um valor inteiro maior que zero para B: ");
            b = input.nextInt();
        }while (b <= 0);

        do {
            System.out.print("Digite um valor inteiro maior que zero para C: ");
            c = input.nextInt();
        }while (c <= 0);

        if (a > b && a > c && b > c){
            System.out.println("o menor vezes o maior é igual: " + c * a + ". E o maior / pelo menor é igual: " + a / c);
        } else if (a > b && a > c && b < c) {
            System.out.println("o menor vezes o maior é igual: " + b * a + ". E o maior / pelo menor é igual: " + a / b);
        } else if(b > a && b > c && a > c){
            System.out.println("o menor vezes o maior é igual: " + c * b + ". E o maior / pelo menor é igual: " + b / c);
        } else if (b > a && b > c && a < c) {
            System.out.println("o menor vezes o maior é igual: " + a * b + ". E o maior / pelo menor é igual: " + b / a);
        } else if (c > a && c > b && b > a) {
            System.out.println("o menor vezes o maior é igual: " + a * c + ". E o maior / pelo menor é igual: " + c / a);
        } else if (c > a && c > b && b < a) {
            System.out.println("o menor vezes o maior é igual: " + b * c + ". E o maior / pelo menor é igual: " + c / b);
        }

        else {
            System.out.println("Algum número é igual, ou tem algo errado.");
        }
        input.close();
    }
}
