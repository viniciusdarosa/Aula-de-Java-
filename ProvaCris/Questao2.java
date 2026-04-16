import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km;
        do{
            sc = new Scanner(System.in);
            System.out.println("digite quantos km o carro rodou (0 = encerra o programa)");
            km = sc.nextInt();
            System.out.println("digite quantos litros o carro gastou: ");
            int litros = sc.nextInt();
            if(litros != 0){
                float consumo = km/litros;
                if(consumo<8){
                    System.out.println("Consumo Elevado");
                } else if(consumo<14){
                    System.out.println("Consumo Médio");
                } else{
                    System.out.println("Consumo Eficiente");
                }
            }
        } while(km != 0);
        System.out.print("Até a próxima");
    sc.close();}   
}
