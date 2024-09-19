package br.com.fiap.poke.model;

public class Pokemon {

    private int id;
    private String nome;
    private String type;
    private String evolution;

    @Override
    public String toString(){
        return "Pokemon\n" +
                id +
                nome +
                type +
                evolution;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
