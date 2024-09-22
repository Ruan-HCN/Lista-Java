package Lista_04;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        //variaveis
        Scanner input = new Scanner(System.in);
        int num, i;

        //pede para inserir um numero inteiro
        System.out.print("Digite um número inteiro: ");
        num = input.nextInt();

        //usa valueof para converter em string
        String numtexto = String.valueOf(num);
        String terno;

        //usa o for para percorrer a string e inicia o operador ternario para exibir o numero por extenso
        for (i = 0; i < numtexto.length(); i++) {
            String numerosextenso = String.valueOf(numtexto.charAt(i));
            terno = (numerosextenso.equals("0")) ? "Zero " :
                    (numerosextenso.equals("1")) ? "Um " :
                            (numerosextenso.equals("2")) ? "Dois " :
                                    (numerosextenso.equals("3")) ? "Três " :
                                            (numerosextenso.equals("4")) ? "Quatro " :
                                                    (numerosextenso.equals("5")) ? "cinco " :
                                                            (numerosextenso.equals("6")) ? "Seis " :
                                                                    (numerosextenso.equals("7")) ? "Sete " :
                                                                            (numerosextenso.equals("8")) ? "Oito " :
                                                                                    (numerosextenso.equals("9")) ? "Nove " :
                                                                                            "Algo errado! ";
            System.out.print(terno);
        }
        input.close();
    }
}

