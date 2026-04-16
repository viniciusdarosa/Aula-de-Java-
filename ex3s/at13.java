//O programa pede nome e salário de 10 funcionários e calcula um bônus de 10% do salário. 
// Mostra o salário final com bônus.
package ex3s;
import java.util.Locale;
import java.util.Scanner;

public class at13 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[10];
        float[] salarios = new float[10];
        for (int i = 0; i<10;i++){
            sc = new Scanner(System.in);
            System.out.println("Nome: ");
            nomes[i] = sc.nextLine(); 
            System.out.println("Salário: ");
            salarios[i] = sc.nextFloat();
        }     
        for (int i = 0;i<10;i++){
            System.out.printf("Olá %s, Seu novo salário é %.2f",nomes[i],(salarios[i]+(salarios[i]*1/10)));
        }  
   sc.close();}
}