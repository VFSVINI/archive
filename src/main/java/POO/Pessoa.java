package POO;

public class Pessoa {
    String nome;
    int idade;
    String estadocivil;
    String profissao;
    double salario;

    public Pessoa(String nome, int idade, String estadocivil, String profissao, double salario){

        this.nome = nome;
        this.idade = idade;
        this.estadocivil = estadocivil;
        this.profissao = profissao;
        this.salario = salario;
    }

    public void apresentar(){

        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Estado Civil"+estadocivil);
        System.out.println("Profissão: "+profissao);
        System.out.println("Salário"+salario);

    }
}
