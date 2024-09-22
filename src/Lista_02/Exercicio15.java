package Lista_02;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        float[] notas = new float[4];
        float media, newmedia, notarec;
        Scanner input = new Scanner(System.in);


        for (var i = 0; i < notas.length; i++){
            System.out.printf("Digite a %d nota: ", i + 1);
            notas[i] = input.nextFloat();
        }

        media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;

        if (media >= 7 && media <= 10){
            System.out.printf("\nA média é %.2f, você está aprovado!", media);
        } else if (media >= 4 && media < 7) {
            System.out.print("\nDigite a nota da recuperação: ");
            notarec = input.nextFloat();

            newmedia = (media + notarec) / 2;

            if (newmedia >= 7 && newmedia <= 10){
                System.out.printf("\nA média é %.2f, você está aprovado na recuperação!", newmedia);
            } else if (newmedia >= 0 && newmedia < 7) {
                System.out.printf("\nA média é %.2f, você está reprovado na recuperação!", newmedia);
            }
            else {
                System.out.println("Há algo errado!");
            }
        } else if (media >= 0 && media < 4) {
            System.out.printf("\nA média é %.2f, você está reprovado direto!", media);
        }
        else {
            System.out.println("\nhá algo errado!");
        }

        input.close();
    }
}
