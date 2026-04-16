//3. Média dos valores - Criar um programa JAVA que contenha um array 10 números e calcule a média deles.
public class vetor3 {
    public static void main(String[] args) {
        int[] numeros = {5,8,9,12,15,48};
        int soma = 0;
        for (int n : numeros){
            soma += n;
        }
        System.out.println(soma/numeros.length);
    }
}
