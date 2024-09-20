package br.com.fiap.poke.model;

public class Pokemon {

    private int id;
    private String name;
    private String type;
    private String evolution;

    @Override
    public String toString(){
        return "Pokemon\n" +
                "Numero da pokedex: " + id +
                "\nNome do Pokemon: " + name +
                "\nTipo do pokemon: " + type +
                "\nSuas Evoluções: " + evolution;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEvolution() {
        return evolution;
    }

    public void setEvolution(String evolution) {
        this.evolution = evolution;
    }
}
