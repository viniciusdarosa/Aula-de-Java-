package ex2s;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a sua idade? ");
        int idade = sc.nextInt();
        if (idade<12){
            System.out.print("Criança");
        } else if (idade<17){
            System.out.print("adolescente");
        } else if (idade<56){
            System.out.print("Adulto");
        } else {
            System.out.print("idoso");
        }
   sc.close();}
}