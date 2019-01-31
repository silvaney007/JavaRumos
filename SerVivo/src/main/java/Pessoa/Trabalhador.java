package Pessoa;

import Servivo.Pessoa;

public class Trabalhador extends Pessoa {
    private String profissao;
    private int salario;

    public Trabalhador(String nome, int idade, int peso, String genero) {
        super(nome, idade, peso, genero);
        this.setFuncao("Trabalhador");
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
}
