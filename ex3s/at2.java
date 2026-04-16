//Peça ao usuário 5 números e mostre a soma total deles usando while.
package ex3s;

import java.util.Scanner;

public class at2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int soma = 0;
        while (i<5){
            System.out.println("Digite um número para a soma: " + soma);
            int n = sc.nextInt();
            soma = soma+n;
            i++;}
        System.out.println("Soma final: " + soma);
   sc.close();}
}
