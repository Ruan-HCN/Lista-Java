package Lista_02;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        short num;
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite um número inteiro para saber o seu módulo: ");
        num = input.nextShort();

        System.out.println("O modulo de " + num + " é " + Math.abs(num) + ".");

        input.close();
    }
}
