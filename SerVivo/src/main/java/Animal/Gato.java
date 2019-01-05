package Animal;

import Servivo.Animal;

public class Gato extends Animal {

    public Gato(String nome, int idade, int peso, String genero) {
        super(nome, idade, peso, genero);
    }

    @Override
    public void classificacao() {
        this.setClassificacao("Mamifero");
    }
}