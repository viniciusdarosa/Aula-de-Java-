package ex1s;
import java.util.Scanner;

public class teste5 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite seu CPF: ");
    String cpf = sc.nextLine();
    if (cpf.length() == 11){
        System.out.println("CPF: "+cpf);
    } else{
        System.err.println("Seu cpf está vazio ou errado");
    }
sc.close();}
}
