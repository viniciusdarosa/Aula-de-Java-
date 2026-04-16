package ex1s;
import java.util.Scanner;

public class teste2 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite a sua idade: ");
    String entrada = sc.nextLine();

    if (entrada.isEmpty()){
        System.err.println("Sua idade está vazia");
    }else{
        int idade = Integer.parseInt(entrada);
        if (idade<0||idade>120) {
            System.err.println("Sua idade não bate");
        } else{
            System.out.println("Sua idade é "+idade);
        }
    } 
    sc.close();
}
}
