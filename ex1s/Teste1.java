package ex1s;
import java.util.Scanner;

public class Teste1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Qual o Seu email? ");
    String email = sc.nextLine();

    if (email.trim().isEmpty() || !email.contains("@")){
        System.err.println("Seu Email está vazio ou não tem @");
    } else{
        System.out.println("Email: "+email);
    }
    sc.close();
    }
}
