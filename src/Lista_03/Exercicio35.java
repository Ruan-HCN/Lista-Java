package Lista_03;

public class Exercicio35 {
    public static void main(String[] args) {
        int i, mult;

        //for de 1 a 100
        for (i = 1; i <= 100; i++){

            //pega o resto da divisao, se o resto for 0, exbir ao lado do numero que e multiplo de 10. caso nao continua o for
            mult = i % 10;
            if (mult == 0){
                System.out.println(i + " É multiplo de 10.");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
