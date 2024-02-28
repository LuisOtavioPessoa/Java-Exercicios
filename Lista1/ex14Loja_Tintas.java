import java.util.Scanner;

class ex14Loja_Tintas{
    public static void main(String []args){
        Scanner teclado = new Scanner (System.in);

        System.out.println("Qual será o tamanho  em metros quadrados da área a ser pintada: ");
        int metrosQuadrados = teclado.nextInt();

        float litroTinta =(float) metrosQuadrados / 3;

        int latasTinta = (int) Math.ceil(litroTinta / 18);

        float precoTotal = latasTinta * 80;

        System.out.println("Quantidade de latas de tinta a serem compradas: " + latasTinta);
        System.out.println("Preço total: R$ " + precoTotal);

    }
}