//Peça um número ao usuário e mostre a tabuada usando while
package ex3s;

import java.util.Scanner;

public class at3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um número: ");
        int n = sc.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println(n+"X"+i+"="+(n*i));
            i++;
        }
        
   sc.close();}
}
