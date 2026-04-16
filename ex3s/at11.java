//O programa pede nome e 3 notas de 5 alunos, calcula a média de cada um e imprime.
package ex3s;
import java.util.Locale;
import java.util.Scanner;

public class at11 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String[] alunos = new String[5];
        float[] notas = new float[5];
        float media = 0;
        for (int i = 0;i<5;i++){
            sc = new Scanner(System.in);
            System.out.println("nome: ");
            String nome = sc.nextLine();
            alunos[i] = nome;
            for (int n = 0;n<3;n++){
                System.out.printf("Qual sua nota %d :",(n+1));
                float nota = sc.nextFloat();
                media = media+nota;
                notas[i] = media;
            }
        }
        for (int i = 0;i<5;i++){
            System.out.printf("%s , sua média é %.2f \n",alunos[i],notas[i]);
        }
   sc.close();}
}
