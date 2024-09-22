package Lista_04;

import java.util.Scanner;


public class Exercicio04 {
    public static void main(String[] args) {
        //variaveis
        int tamanho, ContarPalavras = 0, i;
        String textin;
        Scanner input = new Scanner(System.in);

        //digitar um texto
        System.out.print("Digite um texto: ");
        textin = input.nextLine();

        //pega o tamanho da string
        tamanho = textin.length();

        //adciona as palavraas separadas em um vetor
        String[] palavras = textin.split("\\s+");

        //usa o for para percorrer o vetor, e contar quantas palavras o texto possui
        for (i = 0; i < palavras.length; i++){
            ContarPalavras++;
        }

        //exibe o número de caracteres do texto e a quantidade de palavras
        System.out.println("O texto tem: " + ContarPalavras + " palavras.");
        System.out.println("O texto tem: " + tamanho + "caracteres");


        input.close();
    }
}
