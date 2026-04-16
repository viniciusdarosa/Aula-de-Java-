//O usuário digita um numero. Calcula e mostra o FATORIAL do numero escolhido
package ex3s;
import java.util.Scanner;

public class at7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número do fatorial: ");
        int n = sc.nextInt();
        int fatorial = 1;
        int cont = 1;
        do{ 
            fatorial = fatorial * cont;
            cont++;} while (cont<=n);
            System.out.println(fatorial);
        
   sc.close();}
}
