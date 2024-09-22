package Lista_03;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        //declaração de variaveis
        float[] notas = new float[4];
        float media;
        String matricula, continuar;
        int contarAlunos = 0, contarRecuperacao = 0, contarAprovados = 0, contarReprovados = 0, i;
        Scanner input = new Scanner(System.in);

        //inicio do-while
        do {
            //pede a matricula do aluno
            System.out.print("\nDigite a matrícula do aluno: ");
            matricula = input.nextLine();

            //usa o for para inserir valores na array notas, não permite notas negativas e nem maiores que 10. Caso seja, informa uma mensagem informando
            for (i = 0; i < notas.length; i++){
                do {
                    System.out.printf("\nDigite a %d nota: ", i + 1);
                    notas[i] = input.nextFloat();
                    if (notas[i] < 0 || notas[i] > 10){
                        System.out.println("As notas tem  que ser entre 0 e 10, insira o valor novamente!");
                    }
                }while (notas[i] < 0 || notas[i] > 10);
            }

            //calcula a media, e verifica se o aluno foi aprovado, reprovado, ou está na recuperação. E conta quantas pessoas estão em cada "Classificação"
            media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;

            if (media >= 7){
                System.out.println("\no aluno com a matrícula: " + matricula + ", está aprovado com média " + media + ".");
                contarAprovados++;
            } else if (media >= 4 && media < 7) {
                System.out.println("\no aluno com a matrícula: " + matricula + ", está na recuperação com média " + media + ".");
                contarRecuperacao++;
            }

            else {
                System.out.println("\no aluno com a matrícula: " + matricula + ", está reprovado com média " + media + ".");
                contarReprovados++;
            }

            //conta o total de alunos, e limpa o buffer
            contarAlunos++;
            input.nextLine();

            //Pergunta se quer continuar ou nao, se = "s", volta para a pergunta da matricula, se "n". encerra o program e mosta quantos alunos foram calculadas as medias e quantso em cada situação
            System.out.print("\nVocê quer continuar (s | n): ");
            continuar = input.nextLine();
        }while (continuar.equals("s") || continuar.equals("S"));
        System.out.println("\nFoi calcualda a média de " + contarAlunos + " alunos.");
        System.out.println(contarAprovados + " aluno(s) foi/foram aprovado(s).");
        System.out.println(contarRecuperacao + " aluno(s) está/estão na recuperação.");
        System.out.println(contarReprovados + " aluno(s) está/estão reprovado(s) direto.");
        input.close();
    }
}
