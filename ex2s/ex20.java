package ex2s;

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Aumentos:\n1-10%\n2-15%\n3-20%");
        int op = sc.nextInt();
        System.out.println("Qual o valor do Salário?");
        float n = sc.nextFloat();
        switch (op){
            case 1:
                System.out.println(n+(n*1/10));
                break;
            case 2:
                System.out.println(n+(n*15/100));
                break;
            case 3:
                System.out.println(n+(n*2/10));
                break;
            default:
                System.err.print("Inválido");
        }
   sc.close();}
}
