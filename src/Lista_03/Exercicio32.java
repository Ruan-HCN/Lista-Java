package Lista_03;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        //Declaração de variaveis
        int i, soma = 0, num;
        String continuar;
        Scanner input = new Scanner(System.in);

        //inicio do-while
        do {
            //pede para o user inserir o valor, e não permite um numero fora do estipluado
            do {
                System.out.print("\ninforme um número inteiro entre 0 e 9: ");
                num = input.nextInt();
            }while (num < 0 || num > 9);

            //inicia a condição apra ver se é um número par ou impar
            if(num % 2 == 0){
                //se o numero for par, soma primeiramente + 1, e depois +2 nos proximos numeros, para que "se torne impar", exibe o quadrado desses numeros, e a soma deles ao final
                for (i = 1; i < 20; i = i + 2){
                    if (num + i > 20){
                        break;
                    }
                    int quadra = (int) Math.pow(num + i, 2);
                    System.out.printf("\nO quadrado de %d é = %d.", num + i, quadra);
                    soma += quadra;
                }
            }

            else {
                //se o numero for impar, soma de +2 os numeros, para que continue sendo impar, exibe o quadrado desses numeros, e a soma deles ao final
                for (i = 0; i < 20; i = i + 2){
                    if (num + i > 20){
                        break;
                    }
                    int quadra = (int) Math.pow(num + i, 2);
                    System.out.printf("\nO quadrado de %d é = %d.", num + i, quadra);
                    soma += quadra;
                }
            }
            //exibe a soa e a reninica no loop
            System.out.println("\nA soma dos numeros inteiros impares a partir do numero escolido é: " + soma + ".");
            soma = 0;

            //limpar o buffer e pergunta se o user quer continuar o programa, se nao, encerra e fecha o scanner
            input.nextLine();
            System.out.print("\nVocê quer continuar(s | n): ");
            continuar = input.nextLine();
        }while (continuar.equals("s") || continuar.equals("S"));
        input.close();
    }
}
