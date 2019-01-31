package Servivo;


public class Animal extends Servivo {

    private String animal;
    private int comprimento;

    public Animal(String nome, int idade, int peso, String genero) {
        super(nome, idade, peso, genero);
    }

    @Override
    public String info() {
        return "Animal{" +
                "animal='" + animal + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", genero='" + genero + '\'' +
                ", classificacao='" + classificacao + '\'' +
                '}';
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
}
