import java.util.Scanner;

public class met1 {
    public static int somar(int a,int b){
        return a + b;
    }
    public static int diminuir(int a, int b){
        return a - b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }
    public static float dividir(int a, int b){
        float divisao = a / b;
        return divisao;
    }
    //Começo do Programa
    public static void main(String[] args) {
        int op = 0;
        Scanner sc = new Scanner(System.in);
        float resultado = 0;
        int a = 0;
        int b = 0;

        System.out.println("== Bem Vindo a calculadora ==");

        do {
        System.out.println("Escolha uma opção: ");
        System.out.println("1 -> Soma ");
        System.out.println("2 -> Subtração ");
        System.out.println("3 -> Mutiplicar ");
        System.out.println("4 -> Dividir ");
        System.out.println("5 -> Sair ");
        System.out.print("Opção Número: ");
        op = sc.nextInt();

        if(op != 5){
            System.out.println("Digite o 1º Número:");
            a = sc.nextInt();
            System.out.println("Digite o 2º Número:");
            b = sc.nextInt();
        }

        switch (op) {
            case 1:
                resultado = somar(a,b);
                break;
            case 2:
                resultado = diminuir(a,b);
                break;
            case 3:
                resultado = multiplicar(a,b);
                break;
            case 4:
                if (b != 0){
                resultado = dividir(a,b);
                break;
                } else {
                    System.err.println("O divisor não pode ser 0");
                    resultado = 0;
                    break;
                }
            case 5:
                System.out.print("Fim do Programa");
                sc.close();
                break;
            default:
                System.err.println("Opção inválida");
                break;
        }

        if (op != 5){
            System.out.println("O Resultado final é: " + resultado);
            sc = new Scanner(System.in);
        }

        } while (op != 5);
     sc.close();}
}