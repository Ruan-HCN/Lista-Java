package Lista_03;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        //declaração de variaveis
        int i, num;
        String escolha;
        Scanner input = new Scanner(System.in);

        //inicio do Do-while
        do {
            //Pergunta qual a tabuda
            System.out.print("\nDigite o número da tabuda que você deseja: ");
            num = input.nextInt();
            input.nextLine();

            //verifica se o numero digitado do usuario é maior ou igua a zero
            //se for <= 0, imprime dizendo que é invalido
            if (num <= 0){
                System.out.println("Digite uma opção válida!");
            }

            //se não roda a tabuada
            else {
                for (i = 1; i <= 10; i++){
                    System.out.printf("\n%d x %d = %d", num, i, i * num);
                }
            }

            //pergunta se quer continuar
            System.out.print("\n\nVocê quer continuar: s | n: ");
            escolha = input.nextLine();
        }while (escolha.equals("s") || escolha.equals("S"));
        input.close();
    }
}
