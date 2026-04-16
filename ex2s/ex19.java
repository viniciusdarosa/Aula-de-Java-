package ex2s;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Descontos:\n1-5%\n2-10%\n3-15%");
        int op = sc.nextInt();
        System.out.println("Qual o valor do produto?");
        float n = sc.nextFloat();
        switch (op){
            case 1:
                System.out.println(n-(n*5/100));
                break;
            case 2:
                System.out.println(n-(n*10/100));
                break;
            case 3:
                System.out.println(n-(n*15/100));
                break;
            default:
                System.err.print("Inválido");
        }
   sc.close();}
}
