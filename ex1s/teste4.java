package ex1s;
import java.util.Scanner;

public class teste4 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual o seu nome completo? ");
    String nome = sc.nextLine();
    if (nome.trim().isEmpty() || !nome.contains(" ")){
        System.err.println("Seu nome está vazio ou não tem espaços");
    } else{
        System.out.println("Nome: "+ nome);
    }
sc.close();}
}