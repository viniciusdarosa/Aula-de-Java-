//1. Soma de elementos Criar um programa JAVA que contenha um array de 10 números inteiros e calcule a soma de todos os elementos.
public class vetor {
    public static void main(String[] args) {
        int[] numeros = {5,8,9,12,15,48};
        int soma = 0;
        for (int n : numeros){
            soma += n;
        }
        System.out.println(soma);
    }
}
