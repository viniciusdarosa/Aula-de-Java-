package ex2s;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu salário? ");
        float salario = sc.nextFloat();
        float sf = (salario< 2000)? salario+(salario*15/100) : salario+(salario*1/10);
        System.out.println("Seu salário final ficou R$"+sf);
   sc.close();}
}
