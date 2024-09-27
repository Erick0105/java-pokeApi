//Erick Alves e Luiz Henrique Neri

package br.com.fiap.poke.model;

import java.util.List;

public class Pokemon {

    private int num_pokedex;
    private String name;

    @Override
    public String toString(){
        return "\n------------Pokemon-------------\n" +
                "Numero da pokedex: " + num_pokedex +
                "\nNome do Pokemon: " + name;
    }


    public int getNum_pokedex() {
        return num_pokedex;
    }

    public void setNum_pokedex(int num_pokedex) {
        this.num_pokedex = num_pokedex;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

}
