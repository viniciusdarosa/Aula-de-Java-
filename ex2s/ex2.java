package ex2s;

import java.util.Scanner;

public class ex2 {
        public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("digite o seu nome: ");
    String nome = sc.nextLine();
    System.out.print("Digite uma nota: ");
    float nota = sc.nextFloat();
    if(nota<0||nota>10){
        System.err.println("nota inválida");
    } else{if (nome.isEmpty()){System.out.println("Seu nome esta vazio");}else{
        if (nota>7){
            System.out.println(nome+" passa");
        } else if (nota<7 && nota>=5){
            System.out.println(nome+" recuperação");
        } else{ System.out.println(nome+" recuperação"); }
    }}
sc.close();}
}
