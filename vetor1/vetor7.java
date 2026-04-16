//7. Ordenação simples - Criar um programa JAVA para criar e ordenar um array de 10 números em ordem crescente
import java.util.Arrays;
public class vetor7 {
    public static void main(String[] args) {
    int[] numeros = {5,48,9,12,15};
    Arrays.sort(numeros);
    for (int n:numeros){
        System.out.println(n);
    }
    }
}