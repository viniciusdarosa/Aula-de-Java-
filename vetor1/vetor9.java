//9 - Criar um programa JAVA com um array de 10 números depois peça ao usuário um valor e conte quantas 
// vezes esse valor aparece no array. Exemplo: No array {1, 2, 3, 2, 4, 2}, o número 2 aparece 3 vezes.

import java.util.Scanner;

public class vetor9 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);  
        int[] numeros = {1,2,3,4,5,6,7,8,9,9};
        System.out.print("digite um número inteiro: ");
        int r = sc.nextInt();
        int quant = 0;
        for(int n : numeros){
            if(n == r){
                quant++;
            }
        }
        System.out.println(quant);
        sc.close();
    }
}
