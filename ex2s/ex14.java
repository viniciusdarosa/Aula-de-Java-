package ex2s;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma opção:\n 1) +\n2) -\n3) *\n4) /\nOpção: ");
        String op = sc.nextLine();
        switch (op){
            case "+":
                System.out.println("Digite um número 1");
                int n1 = sc.nextInt();
                System.out.println("Digite um número 2");
                int n2 = sc.nextInt();
                int r = n1+n2;
                System.out.println(r);
                break;
            case "-":
                System.out.println("Digite um número 1");
                int n11 = sc.nextInt();
                System.out.println("Digite um número 2");
                int n22 = sc.nextInt();
                int r2 = n11-n22;
                System.out.println(r2); 
                break;
            case "*":
                System.out.println("Digite um número 1");
                int nn = sc.nextInt();
                System.out.println("Digite um número 2");
                int nm = sc.nextInt();
                int rm = nn*nm;
                System.out.println(rm);
                break;
            case "/":
                System.out.println("Digite um número 1");
                int d1 = sc.nextInt();
                System.out.println("Digite um número 2");
                int d2 = sc.nextInt();
                int dr = d1/d2;
                System.out.println(dr);
                break;
            default:
                System.err.println("Nenhuma opção válidada");
        }
   sc.close();}
}
