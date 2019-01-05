package Pessoa;

import Servivo.Pessoa;

public class Aluno extends Pessoa {


    private String matricula;

    public Aluno(String nome, int idade, int peso, String genero) {
        super(nome, idade, peso, genero);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String info() {
        return "Aluno{" +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", genero='" + genero + '\'' +
                "matricula='" + matricula + '\'' +
                '}';
    }
}
