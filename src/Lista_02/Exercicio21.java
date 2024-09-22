package Lista_02;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        int num, parar;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("\nDigite o primeiro número interio: ");
            num = input.nextInt();

            if (num > 0){
                System.out.println("\nO número é positvo!");
                System.out.print("\nDigite 0 para parar: ");
                parar = input.nextInt();
            } else if (num < 0) {
                System.out.println("\nO número é negativo!");
                System.out.print("\nDigite 0 para parar: ");
                parar = input.nextInt();
            }

            else {
                System.out.println("\n0 é neutro.");
                System.out.print("\nDigite 0 para parar: ");
                parar = input.nextInt();
            }
        }while (parar != 0);
    }
}
