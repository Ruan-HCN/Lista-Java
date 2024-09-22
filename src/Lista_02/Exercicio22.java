package Lista_02;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        float a, b, aux;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        aux= input.nextFloat();

        if (aux > 0){
            a = aux;
            System.out.printf("\nO valor de A é: %.2f.", a);
        } else if (aux < 0) {
            b = aux;
            System.out.printf("\nO valor de B é: %.2f.", b);
        }

        else {
            System.out.println("\n0 é neutro.");
        }
    }
}
