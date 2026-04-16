package ex2s;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Você quer converter: \n1-C° pra F°\n2-F° pra C°");
        int op = sc.nextInt();
        float temp;
        switch (op){
            case 1:
                System.out.println("digite a temperatura em celcius: ");
                temp = sc.nextFloat();
                System.out.print((temp*1.8)+32);
                break;
            case 2:
                System.out.println("digite a temperatura em Farenheit: ");
                temp = sc.nextFloat();
                System.out.print((temp-32)*5/9);
                break;
            default:
                System.err.print("Nenhuma válida");
        }
        
   sc.close();}
}
