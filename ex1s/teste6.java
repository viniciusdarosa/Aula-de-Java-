package ex1s;
import java.util.Scanner;

public class teste6 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um numero positivo");
    int numero = sc.nextInt();
    if(numero<0){
        System.err.println("O número digitado era negativo");
    } else {if(numero==0){
        System.out.println("O número digitado era neutro");
    }else{
        System.out.println("Cadastro feito com sucesso");
    }}
sc.close();}
}
