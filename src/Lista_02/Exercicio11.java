package Lista_02;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        short a, b, aux;
        Scanner input = new Scanner(System.in);

        System.out.printf("Digie um número inteiro para A: ");
        a = input.nextShort();

        System.out.printf("Digie um número inteiro para B: ");
        b = input.nextShort();

        aux = a;
        a = b;
        b = aux;

        System.out.println("Os valor de A é: " + a + ", e o valor de B é: " + b + ".");

        input.close();
    }
}
