package ex1s;
import java.util.Scanner;

public class teste11 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("digite o seu nome: ");
    String nome = sc.nextLine();
    System.out.print("Digite sua função: ");
    String func = sc.nextLine();
    if (!nome.isEmpty()&&!func.isEmpty()){
        System.out.println(nome+" "+func);
    } else {
        System.err.println("Algo ficou vazio no cadastramento");
    }
sc.close();}
}