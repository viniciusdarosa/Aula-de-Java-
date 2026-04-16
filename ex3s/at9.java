//O programa pede nome e salário de 3 funcionários e imprime o total de salários e a média salarial.
package ex3s;
import java.util.Locale;
import java.util.Scanner;

public class at9 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float sala = 0;
        float total = 0;
        for (int i = 0;i<3;i++){
            sc = new Scanner(System.in);
            System.out.println("nome: ");
            String nome = sc.nextLine();
            System.out.println(nome+" Salário: ");
            sala = sc.nextFloat();
            total = total + sala;
        }
        System.out.println("Total: "+total+"| Média: "+(total/3));
   sc.close();}
}
