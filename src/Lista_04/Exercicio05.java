package Lista_04;

import java.util.Scanner;


public class Exercicio05 {
    public static void main(String[] args) {
        //variaveis
        String texto;
        Scanner input = new Scanner(System.in);

        //inserir um texto
        System.out.print("Digite um texto: ");
        texto = input.nextLine();

        //exibe o texto sem espaços a mais que o user tenha adicionado
        System.out.println(texto.trim());
        input.close();
    }
}

