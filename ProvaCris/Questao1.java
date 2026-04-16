import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int infantil = 0;
        int juvenil = 0;
        int profissional = 0;
        int veterano = 0;
        System.out.println("Digite Quantos atletas: ");
        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
            sc = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();
            if(idade < 14){
                System.out.printf("%s, Sua categoria é Infantil\n",nome); //printf pega as variaveis com o % depois de botarmos elas separadas por virgulas após a string
                infantil = infantil + 1;
            } else if (idade < 18){
                System.out.printf("%s, Sua categoria é Juvenil\n",nome);
                juvenil = juvenil + 1;
            } else if(idade < 40){
                System.out.printf("%s, Sua categoria é Profissional\n",nome);
                profissional = profissional + 1;
            } else if(idade < 100){
                System.out.printf("%s, Sua categoria é Veterano\n",nome);
                veterano = veterano + 1;
            } else {
                System.out.printf("%s, Sua Idade não é válida\n",nome);
            }
        }
        System.out.println(infantil +" atletas na categoria Infantil");
        System.out.println(juvenil +" atletas na categoria Juvenil");
        System.out.println(profissional +" atletas na categoria Profissional");
        System.out.println(veterano +" atletas na categoria Veterano");
    sc.close();}
}
