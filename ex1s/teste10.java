package ex1s;
import java.util.Scanner;

public class teste10 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("digite o nome do produto: ");
    String produto = sc.nextLine();
    System.out.print("Digite o preço: ");
    float preco = sc.nextFloat();
    if (produto.isEmpty()||preco<=0){
        System.err.println("Cadastro inválido");
    } else{
        System.out.println("Produto: "+produto+" Preço: R$"+preco);
    }
sc.close();}
}