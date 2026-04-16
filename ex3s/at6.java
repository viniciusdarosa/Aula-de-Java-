//O usuário digita vários números e o programa soma. Quando digitar 0, o programa finaliza
package ex3s;
import java.util.Scanner;

public class at6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int i = 0;
        do {
            System.out.println("Digite um número para a soma total: ");
            i = sc.nextInt();
            soma = soma + i;
        }while(i!=0);
        System.out.println(soma);
        
   sc.close();}
}
