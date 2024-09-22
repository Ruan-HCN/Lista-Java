package Lista_03;

import java.math.BigInteger;

public class Exercicio43 {
    public static void main(String[] args) {
    //declaração de variaveis
        /*long GraosCasa = 1, TotalGraos = 0;
        int i;

        //for vai até 64, poiso tabuleiro de xadrez é 8 x 8, e isso da 64
        for (i = 1; i <= 64; i++){
        //soma os graos e multplica o valor da proxima casa
            TotalGraos += GraosCasa;
            GraosCasa *= 2;
        }
        //imprime o valor
        System.out.println("O monge esperava receber: " + TotalGraos + " grãos.");*/

        BigInteger totalGraos = BigInteger.ZERO;  // Armazena o total de grãos
        BigInteger graosNaCasa = BigInteger.ONE;  // Inicia com 1 grão na primeira casa

        // Itera sobre as 64 casas do tabuleiro
        for (int i = 1; i <= 64; i++) {
            // Adiciona o número de grãos na casa atual ao total
            totalGraos = totalGraos.add(graosNaCasa);

            // Dobra a quantidade de grãos para a próxima casa
            graosNaCasa = graosNaCasa.multiply(BigInteger.TWO);
        }

        // Exibe o total de grãos
        System.out.println("O número total de grãos que o monge esperava receber é: " + totalGraos);

    } //Eu montei essa lógica acima do codigo funcional, mas não é capaz de exibir o valor de grãos mesmo com long, então pesquisei e achei essa outra opção acima
}
