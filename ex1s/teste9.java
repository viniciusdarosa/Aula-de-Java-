package ex1s;
import java.util.Scanner;

public class teste9 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("digite o seu nome: ");
    String nome = sc.nextLine();
    System.out.print("Digite uma nota: ");
    float nota = sc.nextFloat();
    if(nota<0||nota>10){
        System.err.println("nota inválida");
    } else{if (nome.isEmpty()){System.out.println("Seu nome esta vazio");}else{
        if (nota>7){
            System.out.println(nome+" passa");
        } else{
            System.out.println(nome+" não passa");
        }
    }}
sc.close();}
}
