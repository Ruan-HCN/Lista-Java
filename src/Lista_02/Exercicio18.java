package Lista_02;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        int CODIGO;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("\nDigite um número interio: ");
            CODIGO = input.nextInt();

            switch (CODIGO){
                case 1:
                    System.out.println("\nUm!");
                    break;

                case 2:
                    System.out.println("\nDois!");
                    break;

                case 3:
                    System.out.println("\nTrês!");
                    break;

                default:
                    System.out.println("\nValor Inválido!");
                    break;
            }
        }while (CODIGO == 1 || CODIGO == 2 || CODIGO == 3);

        input.close();
    }
}
