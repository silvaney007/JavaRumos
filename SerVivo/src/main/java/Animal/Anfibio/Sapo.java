package Animal.Anfibio;

import Servivo.Animal;

public class Sapo extends Animal {
    public Sapo(String nome, int idade, int peso, String genero) {
        super(nome, idade, peso, genero);
        this.setClassificacao("Anfíbio");
        this.setAnimal("Sapo");
    }
}
