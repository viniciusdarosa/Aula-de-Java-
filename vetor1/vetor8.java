//8 - Criar um programa JAVA com um array de 10 números. O programa deve percorrer esse array e imprimir apenas os números que são pares. 
// Dica: Use o operador de módulo % para verificar a divisibilidade por 2.

public class vetor8 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for (int n: numeros){
            if(n % 2 == 0){
                System.out.println(n);
            }
        }
    }
}
