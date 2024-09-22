package Lista_03;

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        //declaração de variaveis
        String c, continuar;
        float n, salario, salarioTotal, salarioExcedente;
        Scanner input = new Scanner(System.in);

        //inicio do - while
        do {
            //pergunta o codigo e as horas trabalhadas do operario
            System.out.print("\nDigite o código do operário: ");
            c = input.nextLine();

            System.out.print("\nDigite as horas trabalhadas: ");
            n = input.nextFloat();

            //se as horas >= 0 e <= 50, não tera horas excedentes, caso seja maior tera horas excedentes, se for negativo, algo estara errado
            if (n >= 0 && n <= 50) {
                salario =  (n * 10);
                System.out.printf("\nO operário com o código %s, tem o salário de %.2f reais.", c, salario);
            } else if (n > 50) {
                salarioExcedente = (n - 50) * 20;
                salario = (50 * 10);
                salarioTotal = salario + salarioExcedente;
                System.out.printf("\nO operário com o código %s, tem o salário total de %.2f reais. E o salário excedente é %.2f reais.", c, salarioTotal, salarioExcedente);
            }
            else {
                System.out.println("\nHá algo errado!");
            }

            //limpa o buffer e pergunta se quer encerrar o programa
            input.nextLine();
            System.out.print("\n\nDeseja encerrar o programa (s | n): ");
            continuar = input.nextLine();
        }while (continuar.equals("n") || continuar.equals("N"));
        input.close();
    }
}
