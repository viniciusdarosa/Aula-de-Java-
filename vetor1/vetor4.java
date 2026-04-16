//4. Contagem de números pares - Criar um programa JAVA que contenha um array com 15 números e conte quantos são pares.
public class vetor4 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int par = 0;
        for (int n: numeros){
            if(n % 2 == 0){
                par++;
            }
        }
        System.out.println(par);
    }
}
