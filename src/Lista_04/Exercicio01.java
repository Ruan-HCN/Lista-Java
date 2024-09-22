package Lista_04;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        //variaveis
        Scanner input = new Scanner(System.in);
        String palavra;
        int tamanho, Vogaisconta = 0, i, ContarDigitos = 0;

        //introduzir a string
        System.out.print("Digite uma palavra: ");
        palavra = input.next();

        //tamanho da string
        tamanho = palavra.length();


        //Letra A
        //imprime o numero de caracteres
        System.out.println("\nO número de caracteres da palavra digitada é: " + tamanho + ".");

        //Letra B
        //Exibe a palavra em caps
        System.out.println("A palavra em CapsLock é: " + palavra.toUpperCase() + ".");

        //Letra C
        //usa o for para percorrer o tamanho da palavra, inicia uma nova string para comparar com um caractere da palavra atraves do "charat", e o indice i para pecorrer cada caractere
        //inicia o if para verificar se é vogal e adiciona a contagem
        for (i = 0; i < palavra.length(); i++) {
            String vogal = String.valueOf(palavra.charAt(i));
            if (vogal.equalsIgnoreCase("a") || vogal.equalsIgnoreCase("e") || vogal.equalsIgnoreCase("i") || vogal.equalsIgnoreCase("o") || vogal.equalsIgnoreCase("u")) {
                Vogaisconta++;
            }
        }
        //imprime a palvra em minusculo e exibe quantas vogais a palavra tem
        System.out.println("A palavra " + palavra.toLowerCase() + " tem " + Vogaisconta + " vogais.");

        //Letra D
        //verifica se a palavra começa com "uni"
        if (palavra.startsWith("uni")) {
            System.out.println(palavra.toLowerCase() + " começa com \"uni\".");
        } else {
            System.out.println(palavra.toLowerCase() + " não começa com \"uni\".");
        }

        //Letra E
        //verifica se a palavra acaba com "rio"
        if (palavra.endsWith("rio")) {
            System.out.println(palavra.toLowerCase() + " acaba com \"rio\".");
        } else {
            System.out.println(palavra.toLowerCase() + " não acaba com \"rio\".");
        }


        //Letra F
        //faz a mesma coisa que a de contar vogais, sendo que conta os digitos
        for (i = 0; i < palavra.length(); i++) {
            String digitos = String.valueOf(palavra.charAt(i));
            if (digitos.equals("0") || digitos.equals("1") || digitos.equals("2") || digitos.equals("3") || digitos.equals("4") || digitos.equals("5") || digitos.equals("6") || digitos.equals("7") || digitos.equals("8") || digitos.equals("9")) {
                ContarDigitos++;
            }
        }
        System.out.println("A palavra " + palavra.toLowerCase() + " tem " + ContarDigitos + " digitos.");

        //Letra G
        //usa o stringbuilder para inverter a string e depois converte para string
        StringBuilder ineverso = new StringBuilder(palavra);
        String invertido = ineverso.reverse().toString();

        //usa if e contentEquals(compara duas variaveis tipo string) para ver se a palvra invertida é igual a original, ou seja, um palíndromo
        if (palavra.contentEquals(ineverso)) {
            System.out.println("A palavra é igual de trás para frente!");
            System.out.println(palavra.toLowerCase() + ", a palavra normal. " + invertido.toLowerCase() + " , a palavra invertida.");
        } else {
            System.out.println("A palavra não é um palíndromo");
        }

        input.close();
    }
}
