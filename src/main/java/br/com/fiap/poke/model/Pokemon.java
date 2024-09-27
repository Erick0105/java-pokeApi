//Erick Alves e Luiz Henrique Neri

package br.com.fiap.poke.model;

import java.util.List;

public class Pokemon {

    private int id;
    private String name;

    @Override
    public String toString(){
        return "\n------------Pokemon-------------\n" +
                "Numero da pokedex: " + id +
                "\nNome do Pokemon: " + name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

}
