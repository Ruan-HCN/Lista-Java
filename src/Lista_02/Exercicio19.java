package Lista_02;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args){
        int l1, l2, l3;
        Scanner input = new Scanner(System.in);

        System.out.println("Identificador de triângulos.\n");
        // lados
        System.out.print("Digite o valor do primeiro lado do triângulo: ");
        l1 = input.nextInt();

        System.out.print("\nDigite o valor do segundo lado do triângulo: ");
        l2 = input.nextInt();

        System.out.print("\nDigite o valor do terceiro lado do triângulo: ");
        l3 = input.nextInt();

        if (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l2) {

            if (l1 != l2 && l1 != l3 && l2 != l3) {
                System.out.println("\nÉ um Triângulo Escaleno");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("\nÉ um Triângulo Isósceles.");
            } else if (l1 == l2 && l1 == l3) {
                System.out.println("\nÉ um Triângulo Equilátero.");
            }
        } else {
            System.out.println("\nOs lados fornecidos não formam um triângulo válido.");
        }
    }
}
