//2. Maior e menor valor – Criar um programa JAVA que preencha um array com 10 números e mostre:
//O maior valor 
//O menor valor 
public class vetor2 {
    public static void main(String[] args) {
        int[] numeros = {5,8,9,12,15,48};
        int maior = 0;
        int menor = 0;
        for(int n : numeros){
            if (n > maior){
                maior = n;
            }
            if (n < menor){
                menor = n;
            }
        }
        System.out.printf("%d, %d",maior,menor);
    }
    
}
