package ex1s;
import java.util.Scanner;

public class teste13 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("digite o nome do produto: ");
    String produto = sc.nextLine();
    System.out.print("Digite a quantidade: ");
    int quant = sc.nextInt();
    if (produto.isEmpty()||quant<=0){
        System.err.println("Cadastro inválido");
    } else{
        System.out.println("Produto: "+produto+" quantidade: "+quant);
    }
sc.close();}
}