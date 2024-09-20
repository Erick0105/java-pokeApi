package br.com.fiap.poke.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;


public class EscreverJson {

    public void escreverArquivo (Pokemon pokeAlvo){

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("pokemons.json")){
            gson.toJson(pokeAlvo, writer);
            System.out.println("Arquivo Json escrito com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever o arquivo" + e.getMessage() );
        }
    }
}
