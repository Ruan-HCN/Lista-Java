package Lista_01;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        double v, a, r, pi = 3.14F;
        Scanner input = new Scanner(System.in);

        System.out.println("Vamos fazer um programra para calcular o vlume de uma lata de óleo.");

        System.out.printf("Digite o valor do raio: ");
        r = input.nextDouble();

        System.out.printf("Digite o valor da altura: ");
        a = input.nextDouble();

        v = (float)  pi * (Math.pow(r, 2)) * a;

        System.out.printf("O volume da lata é: %.2f", v);
    }
}
