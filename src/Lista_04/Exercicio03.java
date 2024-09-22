package Lista_04;

import java.util.Scanner;

public class Exercicio03 {

    public static String iniciais(String nome){
        //usa um vetor para armazenar o nome atraves do metodo split(divide a string por espaços em branco, \\s+ é o padrao para espaços em branco, e o
        // + e para mais de um espaço em branco
        String[] palavras = nome.split("\\s+");
        //declara variavel stringbuilder
        StringBuilder iniciais = new StringBuilder();

        //usa o for para a string palavra percorrer o vetor palavras, onde eal pega cada palvra do vetor e comapra no if, se estiver sem espaços em branco e sem as
        // outras especificações, adiciona atraves do append o valor da inicial da string que a varaivel palavra esta armazenando, atraves do charat
        for (String palavra : palavras) {
            if (!palavra.isEmpty() && !palavra.equalsIgnoreCase("e") && !palavra.equalsIgnoreCase("do") && !palavra.equalsIgnoreCase("da") &&
                !palavra.equalsIgnoreCase("dos") && !palavra.equalsIgnoreCase("das") && !palavra.equalsIgnoreCase("de") &&
                !palavra.equalsIgnoreCase("di") && !palavra.equalsIgnoreCase("du")) {
                iniciais.append(palavra.charAt(0));
            }
        }
        //retorna as inicias do nome
        return iniciais.toString();
    }

    public static void main(String[] args) {
        //variaveis
        Scanner input = new Scanner(System.in);
        String nome;

        //pede para inserir o numero completo
        System.out.print("Digite seu nome completo: ");
        nome = input.nextLine();

        //nova variavel para receber a função "iniciais"
        String iniciais_nome = iniciais(nome);

        //exibe o nome em caps, e as iniciais
        System.out.println("Nome: " + nome.toUpperCase().trim());
        System.out.println("Iniciais: " + iniciais_nome.toUpperCase());
        input.close();
    }
}
