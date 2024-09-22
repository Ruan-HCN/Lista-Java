package Lista_03;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args){
        //declaração de variaveis
        int num, somaPares = 0, somaImpares = 0;
        Scanner input = new Scanner(System.in);

        //inicio do loop, o loop só para se o argumento for false, e o break que o loop se for menor que 0
        while (true) {
            System.out.print("\nDigite um número inteiro (negativo para encerrar): ");
            num = input.nextInt();

            if (num < 0){
                break;
            }
            if (num % 2 == 0){
                System.out.println(num + " é par.");
                somaPares += num;
            }
            else {
                System.out.println(num + " é ímpar.");
                somaImpares += num;
            }
        }

        //exibe a soma dos numeros pares e dos numeros impares digitados
        System.out.println("\nA soma dos números pares é: " + somaPares);
        System.out.println("\nA soma dos números ímpares é: " + somaImpares);
        input.close();
    }
}
