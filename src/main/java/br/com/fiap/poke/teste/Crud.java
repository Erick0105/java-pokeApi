//Erick Alves e Luiz Henrique Neri

package br.com.fiap.poke.teste;

import br.com.fiap.poke.model.Pokemon;
import br.com.fiap.poke.service.PokeApiService;

import java.util.Scanner;

public class Crud {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Pokemon pokeAlvo = new Pokemon();
        PokeApiService consulta = new PokeApiService();


        do {
            System.out.println("------------------CRUD------------------" +
                    "\n[1] - Cadastrar um Pokémon" +
                    "\n[2] - Buscar pokémon por nome" +
                    "\n[3] - Buscar pokémon pelo número da Pokédex" +
                    "\n[4] - Listar todos os pokémons cadastrados" +
                    "----------------------------------------");
            int opcaoCrud = leitor.nextInt();
            switch (opcaoCrud){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
            }

        } while (repetir)









        boolean executar = true;

        while (executar){
            System.out.println("----------MENU----------" +
                    "\n[1] - Deseja procurar o Pokémon pelo nome;" +
                    "\n[2] - Deseja procurar o Pokémon pelo número da pokédex" +
                    "\nOBS: O número você pode digitar um número aleatorio entre 1-1025" +
                    "\n--------------------");
            int opcao = leitor.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Qual o nome do pokémon alvo");
                    String nome = leitor.next();
                    leitor.nextLine();
                    pokeAlvo = consulta.buscarPokemon(nome);

                    break;
                case 2:
                    System.out.println("Qual o número da pokedex do Pokémon alvo?");
                    int numero = leitor.nextInt();
                    leitor.nextLine();
                    pokeAlvo = consulta.buscarPokemon(numero);

                    break;
            }
            System.out.println(pokeAlvo);

            System.out.println("Voce Deseja Procurar por outro Pokémon? s/n ");
            String op = leitor.nextLine();

            if (op.equals("n")) {
                executar = false;
            }

        }
    }
}
