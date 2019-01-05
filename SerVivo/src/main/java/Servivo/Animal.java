package Servivo;

public class Animal extends Servivo {


    public Animal(String nome, int idade, int peso, String genero) {
        super(nome, idade, peso, genero);
    }

    @Override
    public void classificacao() {
        this.getClassificacao();
    }


    @Override
    public String info() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", genero='" + genero + '\'' +
                ", classificacao='" + classificacao + '\'' +
                '}';
    }
}
