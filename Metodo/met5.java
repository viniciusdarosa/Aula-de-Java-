import java.util.Scanner;

public class met5 {
    public static int[] tabuada(int n){
        int[] tabu = new int[10];
        for(int i = 0; i<10; i++){
            tabu[i] = n * (i+1);
        }
        return tabu;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número q voce deseja ver a tabuada: ");
    int numero = sc.nextInt();
    int[] resultado = tabuada(numero);
    System.out.printf("=== Tabuada do %d ===\n", numero);
    for(int i = 0; i<10; i++){
        System.out.printf("%d X %d = %d\n", numero, (i+1), resultado[i]);
    }
    sc.close();}
}