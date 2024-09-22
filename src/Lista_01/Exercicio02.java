package Lista_01;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        float cota, dol, conversor;
        Scanner entrada = new Scanner(System.in);


        System.out.println("Conversor de Dólar para real.");
        System.out.printf("\nDigite o valor da cotação do Dólar Americano: ");
        cota = entrada.nextFloat();

        System.out.printf("Digite o valor do Dólar a ser convertido: ");
        dol = entrada.nextFloat();

        conversor = cota * dol;

        System.out.printf("\nO valor de %.2f em reais(BRL) é %.2f reais.", dol, conversor);
    }
}
