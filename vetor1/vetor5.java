//5. Inverter array - Criar um programa JAVA que contenha um array 5 números e mostre seus valores na ordem inversa.
import java.util.Arrays;
public class vetor5 {
    public static void main(String[] args) {
        int[] numeros = {5,8,9,12,15};
        Arrays.sort(numeros);
        System.out.println(numeros);
    }
}
