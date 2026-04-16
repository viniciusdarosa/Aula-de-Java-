package ex2s;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma opção:\n 1-cadastrar\n2-listar\n3-sair\nOpção: ");
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("Cadastrar");
                break;
            case 2:
                System.out.println("Listar");
                break;
            case 3:
                System.out.println("sair");
                break;
            default:
                System.err.println("Nenhuma opção válidada");
        }
   sc.close();}
}
