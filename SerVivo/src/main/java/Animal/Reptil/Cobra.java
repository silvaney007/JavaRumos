package Animal.Reptil;

import Servivo.Animal;

public class Cobra extends Animal {
    public Cobra(String nome, int idade, int peso, String genero) {
        super(nome, idade, peso, genero);
        this.setClassificacao("Reptil");
        this.setAnimal("Cobra");
    }
}
