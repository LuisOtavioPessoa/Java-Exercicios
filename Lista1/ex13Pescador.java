import java.util.Scanner;
import java.text.DecimalFormat;

class ex13Pescador{
    public static void main (String[]args){
        Scanner teclado = new Scanner (System.in);

        System.out.println("Digite o peso de peixes: ");
        int peso = teclado.nextInt();

        if(peso > 50){
            int excesso = peso - 50;
            double multa = excesso * 4.00;

            DecimalFormat df = new DecimalFormat("#.##");
            String multaNova= df.format(multa);

            System.out.println("Você ultrapassou o excesso do peso de peixes(50 quilos).");
            System.out.println("Você está com "+  excesso + " Kg de excesso do peso de peixes e deverá pagar uma multa de " + multaNova + " R$.");
        }else{
            System.out.println("Você não ultrapassou o limite do peso de peixes.Não irá precisar pagar multa.");
        }
    }
}