package ex1s;
import java.util.Scanner;

public class teste3 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite uma senha: ");
    String senha = sc.nextLine();
    if (senha.isEmpty()) {
        System.err.println("Sua senha não pode ser vazia");    
    } else { if(senha.length()<6){
        System.err.println("Sua senha deve conter pelo menos 6 caracteres");
    }else{
        System.out.println("Senha: " + senha + ". salva com sucesso");
    }}

sc.close();}
}
