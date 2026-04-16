package ex2s;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanta notas vc deseja calcular(2,3,4)? ");
        float n1,n2,n3,n4 = 0;
        String op = sc.nextLine();
        switch (op) {
            case "2":
                System.out.print("Digite nota 1: ");
                n1 = sc.nextFloat();
                System.out.print("Digite nota 2: ");
                n2 = sc.nextFloat();
                System.out.print((n1+n2)/2);
                break;
            case "3":
                System.out.print("Digite nota 1: ");
                n1 = sc.nextFloat();
                System.out.print("Digite nota 2: ");
                n2 = sc.nextFloat();
                System.out.print("Digite nota 3: ");
                n3 = sc.nextFloat();
                System.out.print((n1+n2+n3)/3);
                break;
            case "4":
                System.out.print("Digite nota 1: ");
                n1 = sc.nextFloat();
                System.out.print("Digite nota 2: ");
                n2 = sc.nextFloat();
                System.out.print("Digite nota 3: ");
                n3 = sc.nextFloat();
                System.out.print("Digite nota 4: ");
                n4 = sc.nextFloat();
                System.out.print((n1+n2+n3+n4)/4);
                break;
            default:
                System.out.println("Nada válido");
                break;
        }
   sc.close();}
}
