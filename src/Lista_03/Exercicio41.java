package Lista_03;

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        //Declaração de variaveis
        int idade;
        String terno, continuar;
        Scanner input = new Scanner(System.in);

        //inicio do-while
        do {
            //pede para inserir a idade, e não permite idade negativa
            do {
                System.out.print("\nDigite sua idade: ");
                idade = input.nextInt();
                if (idade < 0){
                    System.out.println("Digite uma idade válida!");
                }
            }while (idade < 0);

            //inicia o operador ternario
            terno = (idade >= 5 && idade <= 7) ? idade + " anos, Infantil A." :
                    (idade >= 8 && idade < 11) ? " anos, Infantil B." :
                            (idade >= 12 && idade < 14) ? idade + " anos, Juvenil A." :
                                    (idade >= 14 && idade < 18) ? idade + " anos, Juvenil B" :
                                            (idade >= 18) ? idade + " anos, Adultos." : "Não há classificação.!";

            System.out.println(terno);

            //limpa o buffer e pergunda se deseja encerrar o programa.
            input.nextLine();
            System.out.print("\n\nDeseja encerrar o programa (s | n): ");
            continuar = input.nextLine();
        }while (continuar.equals("n") || continuar.equals("N"));
        input.close();
    }
}
