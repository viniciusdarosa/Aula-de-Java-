//O usuário digita nome aluno, disciplina e pergunta quantas notas. Calcular a media e mostrar no final
package ex3s;
import java.util.Scanner;

public class at8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nome do aluno? ");
        String nome = sc.nextLine();
        System.out.println("Qual a disciplina? ");
        String disciplina = sc.nextLine();
        System.out.println("Quantas notas? ");
        int i = sc.nextInt();
        int contador = 1;
        float nota,media = 0;
        do {
            System.out.println("Qual a nota "+contador+"?");
            nota = sc.nextFloat();
            media = media + nota;
            contador++;
        } while(contador<=i);
        System.out.println(nome+" em "+disciplina+" Média:"+(media/i));   
   sc.close();}
}
