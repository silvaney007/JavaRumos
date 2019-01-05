package Servivo;

public class Pessoa extends Servivo{

    protected String corOlhos;
    protected String cabelo;
    protected int altura;

    public Pessoa(String nome, int idade, int peso, String genero) {
        super(nome, idade, peso, genero);
    }

    @Override
    public void classificacao() {
        this.setClassificacao("Mamifero");
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
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", genero='" + genero + '\'' +
                ", classificacao='" + classificacao + '\'' +
                "corOlhos='" + corOlhos + '\'' +
                ", cabelo='" + cabelo + '\'' +
                ", altura=" + altura +
                '}';
    }
}
