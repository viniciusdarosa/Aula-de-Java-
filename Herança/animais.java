import java.util.*;
class Animal {
    public String nome;
    public int idade;
    public Animal(String _nome, int _idade){
        this.nome = _nome;
        this.idade = _idade;
    }
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class Mamifero extends Animal{
    public String corPelo;
    public Mamifero(String _nome, int _idade, String _corPelo) {
        super(_nome, _idade);
        this.corPelo = _corPelo;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cor do Pelo: " + corPelo);
    }
}

class Ave extends Animal{
    public String corBico;
    public Ave(String _nome, int _idade, String _corBico){
        super(_nome,_idade);
        this.corBico = _corBico;
    }

    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Cor do bico: "+corBico);
    }
}

class Reptil extends Animal{
    public String tipoEscama;
    public Reptil(String _nome, int _idade, String _tipoEscama){
        super(_nome,_idade);
        this.tipoEscama = _tipoEscama;
    }

    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Tipo de Escama: "+tipoEscama);
    }
}


public class animais {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;
        String nome;
        int idade;
        String corPelo;
        String corBico;
        String tipoEscama;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar Mamifero");
            System.out.println("2 - Cadastrar Ave");
            System.out.println("3 - Cadastrar Reptil");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc = new Scanner(System.in);

            if (opcao == 1){
                    System.out.print("Nome: ");
                    nome = sc.nextLine();

                    System.out.print("Idade: ");
                    idade = sc.nextInt();

                    System.out.print("Cor do Pelo: ");
                    sc = new Scanner(System.in);
                    corPelo = sc.nextLine();

                    Mamifero mamifero = new Mamifero(nome, idade, corPelo);

                    System.out.println("\n=== DADOS DO MAMIFERO ===");
                    mamifero.mostrarDados();
            } else if (opcao == 2){
                    System.out.print("Nome: ");
                    nome = sc.nextLine();

                    System.out.print("Idade: ");
                    idade = sc.nextInt();

                    System.out.print("Cor do Bico: ");
                    sc = new Scanner(System.in);
                    corBico = sc.nextLine();

                    Ave ave = new Ave(nome, idade, corBico);

                    System.out.println("\n=== DADOS DA AVE ===");
                    ave.mostrarDados();
            } else if (opcao == 3){
                        
                    System.out.print("Nome: ");
                    nome = sc.nextLine();

                    System.out.print("Idade: ");
                    idade = sc.nextInt();

                    System.out.print("Tipo de Escama: ");
                    sc = new Scanner(System.in);
                    tipoEscama = sc.nextLine();

                    Reptil reptil = new Reptil(nome, idade, tipoEscama);

                    System.out.println("\n=== DADOS DO REPTIL ===");
                    reptil.mostrarDados();
            } else if (opcao == 0){
                    System.out.println("Programa Encerrado");
            
            } else{
                    System.out.println("Opção Inválida");
            }
        } while (opcao != 0);
    sc.close();}
}
 