//Peça ao usuário um número entre 1 e 50. O programa deve continuar pedindo até que o usuário digite um valor inválido
package ex3s;
import java.util.Scanner;
public class at4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i>1 || i<50){
            System.out.println("Digite um número entre 1 e 50: ");
            i = sc.nextInt();
        }
        System.out.println(i);
   sc.close();}
}
