package ex2s;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque o preço do produto");
        float preco = sc.nextFloat();
        float dc = (preco - (preco*1/10));
        float f = (preco>100) ? dc : preco;
        System.out.print(f);
        sc.close();}
}
