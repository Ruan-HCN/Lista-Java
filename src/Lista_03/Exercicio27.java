package Lista_03;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args){
        //declaração de variaveis
        int i, j, quantidade, num;
        Scanner input = new Scanner(System.in);

        //manda o user diigtar quantos numeros ele quer saber o fatorial
        System.out.print("Digite a quantidade de números que você quer saber o fatorial: ");
        quantidade = input.nextInt();

        //inicio dos loops baseado na quantidade de numeros que o user quer saber
        for (i = 1; i <= quantidade; i++){
            //pergunta qual o 1], 2º... numero de acorda com a quantidade, e renicia a varavel "numf" a cada loop
            System.out.printf("Digite o %dº número: ", i);
            num = input.nextInt();
            int numf = 1;

            //for para calcular o fatorial
            for (j = 1; j <= num; j++){
                numf *= j;
            }
            //mensagem exibida de que o fatorial de tal numero e tal
            System.out.println("O fatorial de " + num + " é: " + numf + ".");
        }
        input.close();
    }
}
