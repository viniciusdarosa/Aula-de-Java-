import java.util.Scanner;
// criar a superclasse 
class Veiculo {
    public String marca;
    public String modelo;
    public String combustivel;
    public int ano;
    public String cor;

    public Veiculo(String marca, String modelo, String combustivel, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustivel = combustivel;
        this.ano = ano;
        this.cor = cor;
    }

    public void mostrarDados() {
        System.out.println("\n=== DADOS DO VEÍCULO ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Combustível: " + combustivel);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }
}

// criar a SUBCLASSE moto

class Moto extends Veiculo {
    public int cilindradas;
    public double potenciaMotor;

    public Moto(String marca,String modelo,String combustivel,int ano,String cor,
                int cilindradas,double potenciaMotor) {
        super(marca, modelo, combustivel, ano, cor);
        this.cilindradas   = cilindradas;
        this.potenciaMotor = potenciaMotor;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Nr de Cilindradas: " + cilindradas);
        System.out.println("Potência do motor: " + potenciaMotor + " cv");
    }
}

// criar as SUBCLASSE carro
class Carro extends Veiculo {
    public int numeroPortas;
    public String acessorios;
    public String tipoDirecao;

    public Carro(String marca, String modelo, String combustivel, int ano, String cor,
                 int numeroPortas, String acessorios, String tipoDirecao) {
        super(marca, modelo, combustivel, ano, cor);
        this.numeroPortas = numeroPortas;
        this.acessorios = acessorios;
        this.tipoDirecao = tipoDirecao;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Número de portas: " + numeroPortas);
        System.out.println("Tipo Acessórios: " + acessorios);
        System.out.println("Tipo de direção: " + tipoDirecao);
    }
}

// criando o programa PRINCIPAL
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("============ MENU ===========");
            System.out.println("1 - Cadastrar Moto");
            System.out.println("2 - Cadastrar Carro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1) {
                System.out.println("----------- CADASTRAR MOTO -----------");
                System.out.print("Marca: ");
                String marca = entrada.nextLine();
                System.out.print("Modelo: ");
                String modelo = entrada.nextLine();
                System.out.print("Combustível: ");
                String combustivel = entrada.nextLine();
                System.out.print("Ano: ");
                int ano = entrada.nextInt();
                entrada.nextLine();
                System.out.print("Cor: ");
                String cor = entrada.nextLine();
                System.out.print("Nr de Cilindradas: ");
                int cilindradas = entrada.nextInt();
                System.out.print("Potência do motor: ");
                double potencia = entrada.nextDouble();
                entrada.nextLine();

                Moto moto = new Moto(marca, modelo, combustivel, ano, cor, cilindradas, potencia);
                moto.mostrarDados();

            } else if (opcao == 2) {
                System.out.println("------------- CADASTRO DE CARRO -------------");
                System.out.print("Marca: ");
                String marca = entrada.nextLine();
                System.out.print("Modelo: ");
                String modelo = entrada.nextLine();
                System.out.print("Combustível: ");
                String combustivel = entrada.nextLine();
                System.out.print("Ano: ");
                int ano = entrada.nextInt();
                entrada.nextLine();
                System.out.print("Cor: ");
                String cor = entrada.nextLine();
                System.out.print("Número de portas: ");
                int portas = entrada.nextInt();
                entrada.nextLine();
                System.out.print("Acessórios: ");
                String acessorios = entrada.nextLine();
                System.out.print("Tipo de direção: ");
                String direcao = entrada.nextLine();

                Carro carro = new Carro(marca, modelo, combustivel, ano, cor,
                        portas, acessorios, direcao);
                carro.mostrarDados();

            } else if (opcao == 0) {
                System.out.println("Programa encerrado.");

            } else {
                System.out.println("Opção inválida!");

            }

        } while (opcao != 0);

        entrada.close();
    }
}