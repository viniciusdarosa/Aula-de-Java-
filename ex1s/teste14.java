package ex1s;
import java.util.Scanner;

public class teste14 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("digite o nome do modelo do carro: ");
    String modelo = sc.nextLine();
    System.out.print("digite a marca do carro: ");
    String marca = sc.nextLine();
    System.out.print("Digite o preço: ");
    float preco = sc.nextFloat();
    if (modelo.isEmpty()||marca.isEmpty()||preco<=0){
        System.err.println("Cadastro inválido");
    } else{
        System.out.println("modelo: "+modelo+ " marca: "+marca+" Preço: R$"+preco);
    }
sc.close();}
}