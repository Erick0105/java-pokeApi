package br.com.fiap.poke.service;

import br.com.fiap.poke.model.Pokemon;
import com.google.gson.Gson;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PokeApiService {

    /**
     * PokeApi - https://pokeapi.co/
     * Esta é uma API RESTful completa vinculada a um extenso banco de dados detalhando tudo sobre a série principal de jogos Pokémon.
     * Abordamos tudo, de Pokémon a sabores de frutas vermelhas.
     * Exemplo de consulta de Pokemon:
     *      https://pokeapi.co/api/v2/pokemon/ditto
     * Saída
     *      {
     *   "abilities": [
     *     {
     *       "ability": {
     *         "name": "limber",
     *         "url": "https://pokeapi.co/api/v2/ability/7/"
     *       },
     *       "is_hidden": false,
     *       "slot": 1
     *     },
     *     {
     *       "is_hidden": true,
     *       "slot": 3
     *     }
     *   ],
     *   "forms": [
     *     {
     *       "name": "ditto",
     *       "url": "https://pokeapi.co/api/v2/pokemon-form/132/"
     *     }
     *   ],
     *   "game_indices": [
     *     {
     *       "game_index": 76,
     *       "version": {
     *         "name": "red",
     *         "url": "https://pokeapi.co/api/v2/version/1/"
     *       }
     *     },
     *     ... Mais
     *Vamos filtrar para pegar somente as informações que nos interessa
     *PokeAPi possui tipo de consultas diferentes tambem que nos abordaremos
     * como:
     *      evolução
     *      e em quais jogos eles estão
     * */

    public Pokemon buscarPokemon(String nome ){
        try{
            String endereco = "https://pokeapi.co/api/v2/pokemon/" + nome;
            //HttClient => criar um objeto do HttpClient responsável por fazer a requisição HTTP para a api
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Pokemon.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
