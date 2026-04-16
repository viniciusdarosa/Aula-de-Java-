package ex1s;
import java.util.Scanner;

public class teste7 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o seu telefone: ");
    String tel = sc.nextLine();
    if (tel.length() == 8 ){
        System.out.println("Telefone valido: "+tel);
    } else{
         System.out.println("Telefone invalido: "+tel);
    }
sc.close();}
}
