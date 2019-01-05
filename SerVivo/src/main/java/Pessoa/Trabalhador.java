package Pessoa;

import Servivo.Pessoa;

public class Trabalhador extends Pessoa {

    private String profissao;
    private int salario;

    public Trabalhador(String nome, int idade, int peso, String genero) {
        super(nome, idade, peso, genero);
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String info() {
        return "Trabalhador{" +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", genero='" + genero + '\'' +
                "profissao='" + profissao + '\'' +
                ", salario=" + salario +
                '}';
    }
}
