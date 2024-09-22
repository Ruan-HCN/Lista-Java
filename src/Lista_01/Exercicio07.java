package Lista_01;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        float celsius, farenheit;
        Scanner input = new Scanner(System.in);

        System.out.printf("\nDigite a temperatura em Celsius(ºC): ");
        celsius = input.nextFloat();

        farenheit = (float) 1.8 * celsius + 32;

        System.out.printf("\n%.2fºC em graus Farenheit(ºF) é: %.2fºF.", celsius, farenheit);
    }
}
