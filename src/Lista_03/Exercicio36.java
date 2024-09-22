package Lista_03;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args){
        //declaração de variaveis
        int num, i, maior, menor, somanum = 0;
        Scanner input = new Scanner(System.in);

        //inicia menor com o maior valor inteiro, e maior com o menor valor inteiro
        menor = Integer.MAX_VALUE;
        maior = Integer.MIN_VALUE;

        //inicio do loop, o loop for para inserir 10 numeros inteiros e pegar o menor e maior
        for (i = 1; i <= 10; i++){
            System.out.printf("\nDigite o %dº número inteiro: ", i);
            num = input.nextInt();

            //os if verificam qual o maior e menor

            if (num > maior){
                maior = num;
            }

            if (num < menor){
                menor = num;
            }
            //conta quantos numeros foram, e faz a soam de todos os numeros
            somanum += num;
        }

        //exibe o maior, o menor numero e a media
        System.out.println("\nO maior número inserido foi: " + maior);
        System.out.println("\nO menor número inserido foi: " + menor);
        System.out.printf("\nA média dos numeros é: %d", somanum / 10);
        input.close();
    }
}
