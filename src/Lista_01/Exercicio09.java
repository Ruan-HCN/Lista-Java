package Lista_01;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args){
        int anos, meses, dias, IdadeDias, continuar = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade (anos, meses e dias):");

        System.out.printf("\nAnos: ");
        anos = input.nextInt();

        do{
            System.out.printf("\nMeses: ");
            meses = input.nextInt();
            if(meses < 0 || meses > 12){
                System.out.println("Dados inválidos, os meses não podem ser negativos e nem maiores que doze!");
            }
        }while (meses < 0 || meses > 12);

        do {
            System.out.printf("\nDias: ");
            dias = input.nextInt();
            if (dias < 0 || dias > 30){
                System.out.println("Dados inválidos, os dias não podem ser negativos e nem maiores que trinta!");
            }
        }while (dias < 0 || dias > 30);

        IdadeDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("\n\nSua idade em dias é: " + IdadeDias + ".");
    }
}
