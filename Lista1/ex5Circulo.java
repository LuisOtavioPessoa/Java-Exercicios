import java.util.Scanner;

class ex5Circulo{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("---Área do Círculo---");
        System.out.println("Digite o valor do Raio: ");
        float raio = teclado.nextFloat();
        double pi = Math.PI;

        double circulo = pi * (raio * raio);
        
        System.out.println("A área do Círculo é: " + circulo +".");
    }
}

