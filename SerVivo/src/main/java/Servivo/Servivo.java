package Servivo;
public  abstract class Servivo {

    protected String nome;
    protected int idade;
    protected int peso;
    protected String genero;
    protected String classificacao;

    public Servivo(String nome, int idade, int peso, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.genero = genero;
    }


    public final void fazerAnos() {
        this.idade++;
    }

    public abstract void classificacao();

    public abstract String info();

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

}