package Lista_01;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        String vendedor, cod_peca;
        float vendidas, comissao, preco;
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o nome do vendedor: ");
        vendedor = input.nextLine();

        System.out.printf("Digite o código da peça: ");
        cod_peca = input.nextLine();

        System.out.printf("Digite o preço unitário da peça: ");
        preco = input.nextFloat();

        System.out.printf("Quantas peças foram vendidas: : ");
        vendidas = input.nextFloat();

        comissao = (float) ((preco * vendidas) * 0.05);

        System.out.printf("\nA comissão do(a) vendedor(a) %s, sobre a peça %s, é R$ %.2f.", vendedor, cod_peca, comissao);
    }
}
