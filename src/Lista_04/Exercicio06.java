package Lista_04;

import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {

    public static void recombinacao(String cod1, String cod2){
        //variaveis
        String corte1, corte2;
        int i, posicaoinicio, posicaoinicio2, tamanho1, tamanho2;
        Random corteString = new Random();
        Random corteString2 = new Random();

        //pega o tamnho das 2 string
        tamanho1 = cod1.length();
        tamanho2 = cod2.length();

        //pecorrer o codigo 2 vezes com o for
        for (i = 1; i < 3; i++){
            //pega uma posição aleatória das 2 string
            posicaoinicio = corteString.nextInt(tamanho1 - 3);
            posicaoinicio2 = corteString2.nextInt(tamanho2 - 3);

            //atraves do substring, pega a posição inicial sorteda, e a posição final é a posição inicial + 4, e garante que não ultrapasse a string e
            // sempre pega 4 caracteres consecutivos
            corte1 = cod1.substring(posicaoinicio, posicaoinicio + 4);
            corte2 = cod2.substring(posicaoinicio2, posicaoinicio2 + 4);

            //exibe s3 e s4
            System.out.printf("O código S%d é: %s\n", i + 2, corte1 + corte2);
        }
    }

    public static void mutacao(String cod1){
        //variaveis
        int posicaoindice, caps;
        Random aleatorioS1 = new Random();
        Random num = new Random();

        //gera 0 ou 1, e gera um número aleatório do indice do código genético
        caps = num.nextInt(0, 2);
        posicaoindice = aleatorioS1.nextInt(cod1.length());

        //if o num for 0, os caracteres vao ser maiusculos
        if (caps == 0){
            //usa o char para gerar os caracteres, e converte a variavel em char, para gerar uma letra do alfabeto
            char alfabetoaleatorio = (char) ('A' + aleatorioS1.nextInt(26));

            //usa o stringbuilder para usar o setCharat, o setcharat muda uma posição da string
            StringBuilder mutacao = new StringBuilder(cod1);

            //uso do setcharat com a posição e a letra aleatória
            mutacao.setCharAt(posicaoindice, alfabetoaleatorio);

            //declara uma string para converter a stringbuilder em string
            String mudada = mutacao.toString();

            //imprime o codigo original e com mutação
            System.out.print("\n");
            System.out.println("O Código Original de S1: " + cod1);
            System.out.println("o Código com Mutação de S1: " + mudada);
        }

        //fas a mesma coisa do if, só muda quq a letra gerada é minuscula
        else {
            char alfabetoaleatorio = (char) ('a' + aleatorioS1.nextInt(26));

            StringBuilder mutacao = new StringBuilder(cod1);

            mutacao.setCharAt(posicaoindice, alfabetoaleatorio);

            String mudada = mutacao.toString();

            System.out.print("\n");
            System.out.println("O Código Original de S1: " + cod1);
            System.out.println("o Código com Mutação de S1: " + mudada);
        }
    }

    public static void main(String[] args) {
        //variaveis
        Scanner input = new Scanner(System.in);
        int tamanho1, tamanho2;
        String cod1, cod2, continuar;

        //do while para continuar, até o user dizer que não
        do {
            //loop para garantir que o tamanho da string seja igual a 8
            do {
                System.out.print("\nDigite o código genético S1(com 8 digitos): ");
                cod1 = input.next();
                tamanho1 = cod1.length();
                if (tamanho1 != 8){
                    System.out.println("Digite o código com 8 digitos!");
                }
            }while (tamanho1 != 8);

            do {
                //loop para garantir que o tamanho da string seja igual a 8
                System.out.print("Digite o código genético S2(com 8 digitos): ");
                cod2 = input.next();
                tamanho2 = cod2.length();
                if (tamanho2 != 8){
                    System.out.println("Digite o código com 8 digitos!");
                }
            }while (tamanho2 != 8);

            //exibe o código de s1 e s2
            System.out.print("\n");
            System.out.println("O código de s1 é: " + cod1);
            System.out.println("O código de s1 é: " + cod2);

            //chama a função recombinacao para gera os filhos(s3 e s4), com base nas string cod1, cod2
            recombinacao(cod1, cod2);

            //faz a mutação da cod1, através da função mutacao, explicada acima
            mutacao(cod1);

            //pergunta se quer continuar
            System.out.print("\nVocê quer continuar(s | n): ");
            continuar = input.next();

        }while (continuar.equalsIgnoreCase("s"));

        input.close();
    }
}
