package ex2s;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args){
        float lado,altura;
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Quadrado, 2 - Retângulo, 3 - Triângulo");
        int op =sc.nextInt();
        switch (op){
            case 1:
                System.out.print("Digite o tamanho do Lado: ");
                lado = sc.nextFloat();
                System.out.print(lado*lado);
                break;
            case 2:
                System.out.print("Digite o tamanho do Lado: ");
                lado = sc.nextFloat();
                System.out.print("Digite o tamanho da altura: ");
                altura = sc.nextFloat();
                System.out.print(lado*altura);
                break;
            case 3:
                System.out.print("Digite o tamanho do Lado: ");
                lado = sc.nextFloat();
                System.out.print("Digite o tamanho da altura: ");
                altura = sc.nextFloat();
                System.out.print(lado*altura/2);
                break;
            default:
                System.err.print("opção inválida");
        }
   sc.close();}
}
