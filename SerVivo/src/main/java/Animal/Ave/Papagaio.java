package Animal.Ave;

import Servivo.Animal;

public class Papagaio extends Animal {
    public Papagaio(String nome, int idade, int peso, String genero) {
        super(nome, idade, peso, genero);
        this.setClassificacao("Ave");
        this.setAnimal("Papagaio");
    }
}
