package ex2s;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Maçã\n2 - Banana\n3 - Laranja\n4 - Uva\n5 - Pêra\nEscolha uma opção:");
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
            case 4:
                System.out.print(op);
                break;
            case 5:
                System.out.print(op);
                break;
            default:
                System.err.print("Nenhuma válida");
        }
   sc.close();}
}
