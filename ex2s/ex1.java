package ex2s;

import java.util.Scanner;

public class ex1 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int n = sc.nextInt();
        String r = (n%2 == 0) ? "par" : "impar";
        System.out.println(r);
   sc.close();}
}
