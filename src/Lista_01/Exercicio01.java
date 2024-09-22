package Lista_01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        int max, min, medio;
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite a quatindade mínima da peça no estoque: ");
        min = input.nextInt();

        System.out.printf("Digite a quatindade máxima da peça no estoque: ");
        max = input.nextInt();

        medio = (max + min)/2;

        System.out.println("\nO estoque médio dessa peça é: " +medio);
    }
}
