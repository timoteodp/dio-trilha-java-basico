public class TiposVariaveis {
    public static void main(String[] args) {
       double salarioMinimo = 2.500;

       short numeroCurto = 1;
       int numeroNormal = numeroCurto;
       short numeroCurto2 = (short) numeroNormal;
       System.out.println("O salário mínimo é "+ salarioMinimo);

       int numero =4;
       numero = 10;
       System.out.println("O número agora é " + numero);

       final double VALOR_DE_PI = 3.14;
       System.out.println("Valor de Pi é " + VALOR_DE_PI);


    }
}
