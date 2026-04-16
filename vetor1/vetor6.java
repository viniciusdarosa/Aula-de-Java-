//6. Buscar elemento - Criar um programa JAVA que contenha um array de 10 elementos. 
// Após peça um novo número ao usuário e verifique se ele existe no array já criado.
import java.util.Scanner;
import java.util.Arrays;
public class vetor6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {5,8,9,12,15,48};
        System.out.println("Digite um númera para a verificação: ");
        int r = sc.nextInt();
        if (Arrays.binarySearch(numeros, r)>-1){
            System.out.println("Seu número ja existe no array");
        } else {System.out.println("Não tem");}
        sc.close();
    }
}
