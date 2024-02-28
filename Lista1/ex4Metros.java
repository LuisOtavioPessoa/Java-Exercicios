import java.util.Scanner;

class ex4Metros{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("---Metros convertido para Centímetros---");
        System.out.println("Digite o valor em Metros: ");
        float metros = teclado.nextFloat();

        float centimetros = metros * 100;

        System.out.println(+ metros + " metros são " + centimetros + " centímetros.");


    }


}