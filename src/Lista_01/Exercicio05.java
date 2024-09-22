package Lista_01;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        float distancia, velocidade, tempo, litros_used;
        Scanner input = new Scanner(System.in);

        System.out.printf("\nDigite a velocidade em Km/h que o automóvel se encontra: ");
        velocidade = input.nextFloat();

        System.out.printf("Digite o tempo em minutos que a viagem vai durar: ");
        tempo = input.nextFloat();

        distancia = (float ) (velocidade / 3.6) * (tempo * 60);
        litros_used = (float) (distancia / 1000) / 12;

        System.out.printf("\nO automóvel faz 12Km por litro, como a distância é %.2fKm, o automóvel utilizará %.2f Litros.", distancia / 1000, litros_used);
    }
}
