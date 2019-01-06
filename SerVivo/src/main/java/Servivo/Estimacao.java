package Servivo;


public class Estimacao {

    private Pessoa pessoa;
    private Animal animal;

    public Estimacao(Pessoa pessoa, Animal animal) {
        this.pessoa = pessoa;
        this.animal = animal;
    }

    public final void animalEstimacao( Pessoa pessoa, Animal animal){
        System.out.println("Dono: " + this.getPessoa().getNome());
        System.out.println("Animal: " +this.getAnimal().getNome());
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Estimacao{" +
                "Pessoa=" + pessoa.getNome() +
                ", Animal=" + animal.getAnimal() +
                ", Nome=" + animal.getNome() +
                '}';
    }
}
