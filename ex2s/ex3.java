package ex2s;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número 1");
        int n1 = sc.nextInt();
        System.out.println("Digite um número 2");
        int n2 = sc.nextInt();
        String r = (n1>n2) ? n1 + " é maior" :n2 + " é maior" ;
        System.out.println(r);
   sc.close();}
}
