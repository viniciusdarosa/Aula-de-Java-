package ex2s;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Digite um número 1");
        int n1 = sc.nextInt();
        System.out.println("Digite um número 2");
        int n2 = sc.nextInt();
        System.out.println("Digite um número 3");
        int n3 = sc.nextInt();
        if (n1+n2<n3 && n3+n2<n1 && n1+n3<n1 ){
            System.out.println("Pode formar um triângulo");
        } else {
            System.out.println("Não Pode formar um triângulo");
        }

   sc.close();}
}
