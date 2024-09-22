package Lista_01;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        int a, b, c, d;
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite um valor inteiro para A: ");
        a = input.nextInt();

        System.out.printf("Digite um valor inteiro para B: ");
        b = input.nextInt();

        System.out.printf("Digite um valor inteiro para C: ");
        c = input.nextInt();

        System.out.printf("Digite um valor inteiro para D: ");
        d = input.nextInt();

        System.out.printf("\nA soma de A + B é: %d", a + b);
        System.out.printf("\nA soma de A + C é: %d", a + c);
        System.out.printf("\nA soma de A + D é: %d", a + d);

        System.out.printf("\nA soma de B + C é: %d", b + c);
        System.out.printf("\nA soma de B + D é: %d", b + d);

        System.out.printf("\nA soma de C + D é: %d", c + d);

        System.out.printf("\n\nA multiplicação de A x B é: %d", a * b);
        System.out.printf("\nA multiplicação de A x C é: %d", a * c);
        System.out.printf("\nA multiplicação de A x D é: %d", a * d);

        System.out.printf("\nA multiplicação de B x C é: %d", b * c);
        System.out.printf("\nA multiplicação de B x D é: %d", b * d);

        System.out.printf("\nA multiplicação de C x D é: %d", c * d);
    }
}
