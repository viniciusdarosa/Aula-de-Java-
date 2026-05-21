import java.util.*;
// SUPERClasse b
class Pessoa {
    public String nome;
    public String cpf;
    public Date data_nascimento;

    public Pessoa(String _nome, String _cpf, Date _data) {
        this.nome = _nome;
        this.cpf = _cpf;
        this.data_nascimento = _data;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + data_nascimento);
    }
}

// Classe Aluno herdando de SUPERCLASSE Pessoa
class Aluno extends Pessoa {
    public String matricula;

    public Aluno(String _nome, String _cpf, Date _data, String _matricula) {
        super(_nome, _cpf, _data);
        this.matricula = _matricula;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Matrícula: " + matricula);
    }
}

// Classe Professor herdando de SUPERCLASSE Pessoa
class Professor extends Pessoa {
    public double salario;
    public String disciplina;

    public Professor(String _nome, String _cpf, Date _data,double _salario, String _disciplina) {
        super(_nome, _cpf, _data);
        this.salario = _salario;
        this.disciplina = _disciplina;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Salário: R$ " + salario);
        System.out.println("Disciplina: " + disciplina);
    }
}

// Classe Funcionario herdando de SUPERCLASSE Pessoa
class Funcionario extends Pessoa {
    public double salario;
    public String cargo;

    public Funcionario(String _nome, String _cpf, Date _data, double _salario, String _cargo) {
        super(_nome, _cpf, _data);
        this.salario = _salario;
        this.cargo = _cargo;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Salário: R$ " + salario);
        System.out.println("Cargo: " + cargo);
    }
}

// Programa principal (valores fixos exemplo)
public class exemplo1 {
    public static void main(String[] args) {

        // Criando um aluno
        Aluno aluno = new Aluno(
                "Carlos Silva", "111.111.111-11", new Date(), "2024001");

        // Criando um professor
        Professor professor = new Professor(
                "Maria Souza", "222.222.222-22", new Date(), 5500.00, "Matemática");

        // Criando um funcionário
        Funcionario funcionario = new Funcionario("João Pereira", "333.333.333-33", new Date(), 3200.00, "Secretário");

        
        System.out.println("=== ALUNO ===");
        aluno.mostrarDados();
        System.out.println("\n=== PROFESSOR ===");
        professor.mostrarDados();
        System.out.println("\n=== FUNCIONÁRIO ===");
        funcionario.mostrarDados();
    }
}