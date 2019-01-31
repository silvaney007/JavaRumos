package Animal.Mamifero;

import Servivo.Animal;

public class Gato extends Animal {

    public Gato(String nome, int idade, int peso, String genero) {
        super(nome, idade, peso, genero);
        this.setClassificacao("Mamifero");
        this.setAnimal("Gato");
    }
}