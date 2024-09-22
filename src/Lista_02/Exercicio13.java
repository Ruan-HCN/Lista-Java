package Lista_02;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        /*short num1, num2, num3;
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o 1º número inteiro: ");
        num1 = input.nextShort();

        System.out.printf("Digite o 2º número inteiro: ");
        num2 = input.nextShort();

        System.out.printf("Digite o 1º número inteiro: ");
        num3 = input.nextShort();

        if (num1 < num2 && num1 < num3 && num2 < num3){
            System.out.printf("%d > %d > %d", num3, num2, num1);
        } else if (num1 < num2 && num1 < num3 && num2 > num3) {
            System.out.printf("%d > %d > %d", num2, num3, num1);
        } else if(num2 < num1 && num2 < num3 && num1 < num3){
            System.out.printf("%d > %d > %d", num3, num1, num2);
        } else if (num2 < num1 && num2 < num3 && num1 > num3) {
            System.out.printf("%d > %d > %d", num1, num3, num2);
        } else if (num3 < num1 && num3 < num2 && num2 < num1) {
            System.out.printf("%d > %d > %d", num1, num2, num3);
        } else if (num3 < num1 && num3 < num2 && num2 > num1) {
            System.out.printf("%d > %d > %d", num2,num1, num3);
        }

        else {
            System.out.println("Algum número é igual, ou tem algo errado.");
        }

        input.close();*/

        short[] numeros = new short[3];
        Scanner entrada = new Scanner(System.in);

        for (var i = 0; i < numeros.length; i++){
                System.out.printf("Digite o %dº número inteiro: ", i + 1);
                numeros[i] = entrada.nextShort();
        }

        Arrays.sort(numeros);

        System.out.println(numeros[2] + " > " + numeros[1] + " > " + numeros[0]);

        entrada.close();

        //Olá, Professor. Andei estudando Java, e sabia que daav para fazer desse segundo jeito, mas deixei a forma com os operadores de comparação acima comentada.
    }
}
