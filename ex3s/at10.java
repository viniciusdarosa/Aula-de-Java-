//O programa pede nome, quantidade e preço de 5 produtos e 
// mostra o total de cada produto e o valor total da compra.
package ex3s;
import java.util.Locale;
import java.util.Scanner;

public class at10 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        int[] quants = new int[5];
        float[] precos = new float[5];
        float total = 0;
        for (int i= 0;i<5;i++){
            sc = new Scanner(System.in);
            System.out.println("Nome do produto: ");
            String nome = sc.nextLine();
            nomes[i] = nome;
            System.out.println("Qual a quantidade? ");
            int quant = sc.nextInt();
            quants[i] = quant;
            System.out.println("Qual o preço? ");
            float preco = sc.nextFloat();
            precos[i] = preco;
        }
        for (int i=0;i<5;i++){
            System.out.printf("Produto = %s - Quantidade = %d - Preço %.2f - R$%.2f\n", nomes[i],quants[i],precos[i],(quants[i]*precos[i]));
            total = total+precos[i]*quants[i];
        }
        System.out.printf("Total = %.2f",total);
         
   sc.close();}
}

