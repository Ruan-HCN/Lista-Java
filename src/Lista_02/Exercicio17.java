package Lista_02;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        int num;
        String terno;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        num = input.nextInt();

        terno = (num >= 0 && num <= 9) ? "\nValor Válido!" : "\nValor Inválido!";

        System.out.println(terno);

        input.close();
    }
}
