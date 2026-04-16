package ex1s;
import java.util.Scanner;

public class teste8 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um nome de Usuário: ");
    String nome = sc.nextLine();
    System.out.print("Digite uma Senha: ");
    String senha = sc.nextLine();
    if (nome.isEmpty() || senha.isEmpty()){
        System.err.println("Nome ou senha vazios");
    } else{ if(senha.length()<6){
        System.err.println("senha muito pequena");
    }else{
        System.out.println("Bem-Vindo "+nome+"Sua senha é: "+senha);
    }}
sc.close();}
}
