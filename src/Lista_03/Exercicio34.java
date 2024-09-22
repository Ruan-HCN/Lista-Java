package Lista_03;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args){
        //declaração de variaveis
        int num, maior, menor;
        boolean primeironum = true;
        Scanner input = new Scanner(System.in);

        //inicia menor com o maior valor inteiro, e maior com o menor valor inteiro
        menor = Integer.MAX_VALUE;
        maior = Integer.MIN_VALUE;

        //inicio do loop, o loop só para se o numero for menor que 0
        while (true) {
            System.out.print("\nDigite um número inteiro (negativo para encerrar): ");
            num = input.nextInt();

            if (num < 0){
                break;
            }

            //inico dos if e else, para saber qual o maior e menor
            //no 1 if, iguala todos os valores
            if (primeironum) {
                maior = menor = num;
                primeironum = false;
            }

            //se não, continua verificando o maior e menor valor fornecido
            else {
                if (num > maior){
                    maior = num;
                }

                if (num < menor){
                    menor = num;
                }
            }
        }

        //exibe o maior e o menor numero
        if (!primeironum) {
            System.out.println("\nO maior número inserido foi: " + maior);
            System.out.println("\nO menor número inserido foi: " + menor);
        } else {
            System.out.println("\nNenhum número foi inserido.");
        }
        input.close();
    }
}
