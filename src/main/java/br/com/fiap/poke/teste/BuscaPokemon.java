package br.com.fiap.poke.teste;

import br.com.fiap.poke.model.Pokemon;
import br.com.fiap.poke.service.PokeApiService;

import java.util.Scanner;

public class BuscaPokemon {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Pokemon poke = new Pokemon();
        PokeApiService consulta = new PokeApiService();

        System.out.println("Digite o nome do pokemon: ");
        var nome = leitor.nextLine();
        poke = consulta.buscarPokemon(nome);

        System.out.println(poke.toString());
    }
}
