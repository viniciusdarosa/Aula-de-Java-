//Peça 4 notas de um aluno usando while e calcule e mostre a média final. 
package ex3s;
import java.util.Locale;
import java.util.Scanner;
public class at5 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int i = 1;
        float media = 0;
        while(i<=4){
            System.out.println(i+"° Nota: ");
            float nota = sc.nextFloat();
            media = media + nota;
            i++;
        }
        System.out.println("media"+(media/4));
        
   sc.close();}
}
