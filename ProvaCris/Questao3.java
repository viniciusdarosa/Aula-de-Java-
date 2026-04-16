import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalA = 0;
        int totalB = 0;
        int total = 0;
        int quantidadeA = 0;
        int quantidadeB = 0;
        System.out.println("Seja bem vindo à Cafeteria Dardo!");
        System.out.println("=================================");
        System.out.println("Qual o Seu nome? ");
        String nome = sc.nextLine();
        System.out.println("=================================");
        System.out.printf("seja bem Vindo(a) %s, Qual será deu pedido hoje?\n",nome);
        System.out.println("======== Menu de Bebidas ========");
        System.out.println("1 - Café Expresso - R$5,00\n2 - Café ao Latte - R$6,00\n3 - Capuccino - R$8,00\n4 - Nenhum");
        int opbebida = sc.nextInt();
        if (opbebida == 1 || opbebida == 2 || opbebida == 3){
            System.out.println("=================================");
            System.out.println("Qual a Quantidade? ");
            quantidadeA = sc.nextInt();
        }
        System.out.println("==== Menu de Acompanhamento ====");
        System.out.println("1 - Bolo - R$5,00\n2 - Cookies - R$3,00\n3 - Croissant - R$4,00\n4 - Nenhum");
        int opacompanhamento = sc.nextInt();
        if (opacompanhamento == 1 || opacompanhamento == 2 || opacompanhamento == 3){
            System.out.println("=================================");
            System.out.println("Qual a Quantidade? ");
            quantidadeB = sc.nextInt();
        }
        System.out.println("========== Nota Fiscal ==========");
        System.out.println("Nome do Cliente: " + nome);
        switch (opbebida){
            case 1:
                if (opbebida == 1){ // tive q botar os if pq só o switch case estava printando todos
                totalA = 5 * quantidadeA;
                System.out.println(quantidadeA +" Café Expresso - R$"+totalA);}
            case 2:
                if (opbebida == 2){
                totalA = 6 * quantidadeA;
                System.out.println(quantidadeA +" Café ao Latte - R$"+totalA);}
            case 3:
                if (opbebida == 3){
                totalA = 8 * quantidadeA;
                System.out.println(quantidadeA +" Capuccino - R$"+totalA);}
            default:
                if (opbebida > 3){
                System.out.println("Nenhuma Bebida solicitada");}
        }
        switch (opacompanhamento){
            case 1:
                if (opacompanhamento == 1){ 
                totalB = 5 * quantidadeB;
                System.out.println(quantidadeB +" Bolo - R$"+totalB);}
            case 2:
                if (opacompanhamento == 2){ 
                totalB = 3 * quantidadeB;
                System.out.println(quantidadeB +" Cookies - R$"+totalB);}
            case 3:
                if (opacompanhamento == 3){ 
                totalB = 4 * quantidadeB;
                System.out.println(quantidadeB +" Croissant - R$"+totalB);}
            default:
                if (opacompanhamento > 3){ 
                System.out.println("Nenhum Acompanhamento solicitado");}
        }
        total = totalA + totalB;
        System.out.println("O valor total da conta foi de R$"+total);
        System.out.println("=================================");        
    sc.close();}   
}