package ex2s;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Bom dia\n2 - Boa Tarde\n3 - Boa noite\n Escolha uma opção:");
        int op = sc.nextInt();
        switch (op){
            case 1:
                System.out.print(op);
                break;
            case 2:
                System.out.print(op);
                break;
            case 3:
                System.out.print(op);
                break;
            default:
                System.err.print("Nenhuma válida");
        }
   sc.close();}
}