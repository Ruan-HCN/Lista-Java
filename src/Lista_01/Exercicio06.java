package Lista_01;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        float celsius, farenheit;
        Scanner input = new Scanner(System.in);

        System.out.printf("\nDigite a temperatura em Farenheit(ºF): ");
        farenheit = input.nextFloat();

        celsius = (float) ((farenheit - 32) / 1.8);

        System.out.printf("\n%.2fºF em graus Celsius(ºC) é: %.2fºC.", farenheit, celsius);
    }
}
