package Lista_03;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        //declaração de variaveis
        float grau, farenheit, conveF, converC, pesoM, pesoF, h;
        short escolha;
        String continuar;
        Scanner input = new Scanner(System.in);

        //inicio do loop
        do {
            //menu com as opções do programa
            System.out.print("\n========== Menu ==========");
            System.out.print("\n1.  Conversão de Graus Celsius em Graus Fahrenheit\n" +
                    "2.  Conversão de Graus Fahrenheit em Graus Celsius\n" +
                    "3.  Peso ideal do homem\n" +
                    "4.  Peso ideal da mulher\n\n");
            System.out.print("Escolha uma opção do menu: ");
            escolha = input.nextShort();

            //inicio switch case de acordo com as opções
            switch (escolha){
                case 1:
                    //converte celsius em farenheit de acordo com a função abaixo e com a temperatura que o user inserir
                    System.out.print("\nDigite a tempeatura em  Graus: ");
                    grau = input.nextFloat();
                    conveF = (float) (1.8 * grau) + 32;
                    System.out.println(grau + "ºC em Farenheit é: " + conveF + "ºF");
                    break;

                case 2:
                    //converte farenheit em celsius de acordo com a função abaixo e com a temperatura que o user inserir
                    System.out.print("\nDigite a tempeatura em  Farenheit: ");
                    farenheit = input.nextFloat();
                    //conveF = (float) (1.8 * grau) + 32;
                    converC = (float) ((farenheit - 32) / 1.8);
                    System.out.println(farenheit + "ºF em Farenheit é: " + converC + "ºC");
                    break;

                case 3:
                    //verifica o peso idela para homem
                    System.out.print("\nDigite sua altura: ");
                    h = input.nextFloat();
                    pesoM = (float) (72.7 * h) - 58;
                    System.out.printf("\nO seu peso ideal é %.2f.", pesoM);
                    break;

                case 4:
                    //verifica o peso ideal para mulher
                    System.out.print("\nDigite sua altura: ");
                    h = input.nextFloat();
                    pesoF = (float) ((62.1 * h) - 44.7);
                    System.out.printf("\nO seu peso ideal é %.2f.", pesoF);
                    break;

                default:
                    //pede para escolher uma opção valida
                    System.out.println("\nDigite uma opçõa válida!");
                    break;
            }
            //limpa o buffer e pergunda se o usuario quer continuar
            input.nextLine();
            System.out.print("\nVocê deseja sair (s | n): ");
            continuar = input.nextLine();
        }while (continuar.equals("n") || continuar.equals("N"));
        input.close();
    }
}
