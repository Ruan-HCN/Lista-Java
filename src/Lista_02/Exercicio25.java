package Lista_02;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args){
        float h, pesoM, pesoF;
        String sexo;
        Scanner input = new Scanner(System.in);

        System.out.println("Esse programa ira calcular seu peso ideal.");
        System.out.print("\nDigite sua altura: ");
        h = input.nextFloat();
        input.nextLine();

        System.out.print("\nDigite a inical do seu sexo(Masculino(m) | Feminino(f)): ");
        sexo = input.nextLine();

        if(sexo.equals("m") || sexo.equals("M") && h >= 0){
            pesoM = (float) (72.7 * h) - 58;
            System.out.printf("\nO seu peso ideal é %.2f.", pesoM);
        } else if (sexo.equals("f") || sexo.equals("F") && h >= 0) {
            pesoF = (float) ((62.1 * h) - 44.7);
            System.out.printf("\nO seu peso ideal é %.2f.", pesoF);
        }
        else {
            System.out.println("\nHá algo errado!");
        }

        input.close();
    }
}
