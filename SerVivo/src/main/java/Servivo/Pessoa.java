package Servivo;

public class Pessoa extends Servivo{

    private String corOlhos;
    private String cabelo;
    private int altura;
    private String funcao;

    public Pessoa(String nome, int idade, int peso, String genero) {
        super(nome, idade, peso, genero);
        this.setClassificacao("Mamifero");
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    public String getCabelo() {
        return cabelo;
    }

    public void setCabelo(String cabelo) {
        this.cabelo = cabelo;
    }

    @Override
    public String info() {
        return "Pessoa{" +
                "funcao='" + funcao + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", genero='" + genero + '\'' +
                ", classificacao='" + classificacao + '\'' +
                '}';
    }
}