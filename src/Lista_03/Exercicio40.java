package Lista_03;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        //Declaração de variaveis
        float indice;
        String terno, continuar;
        Scanner input = new Scanner(System.in);

        //inicio do-while
        do {
            //pede para inserir o indice de poluição
            System.out.print("\nDigite o índice de poluição: ");
            indice = input.nextFloat();

            //inicia o operador ternario
            terno = (indice >= 0 && indice <= 0.25) ? indice + " o índice está aceitável." :
                         (indice > 0.25 && indice < 0.30) ? "Alerta!" :
                                 (indice >= 0.30 && indice < 0.40) ? indice + ". Empresas do 1º grupo, suspendam as atividades!" :
                                         (indice >= 0.40 && indice < 0.50) ? indice + ". Empresas do 1º e 2º grupo, suspendam as atividades!" :
                                                 (indice >= 0.5) ? indice + ". Empresas de todos os grupos, suspendam as atividades!" : "Há algo errado!";

            System.out.println(terno);

            //limpa o buffer e pergunda se deseja encerrar o programa.
            input.nextLine();
            System.out.print("\n\nDeseja encerrar o programa (s | n): ");
            continuar = input.nextLine();
        }while (continuar.equals("n") || continuar.equals("N"));
        input.close();
    }
}
