package br.com.fiap.poke.dao;

import br.com.fiap.poke.model.Pokemon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PokemonDao {

    private Connection conexao;

    public PokemonDao() {
        this.conexao = ConnectionFactory.obterConexao();
    }
    public void Cadastrar(Pokemon pokemon){
        PreparedStatement comandoSql = null;
        try{
            String sql = "insert into pokemon(num_pokedex, nome_poke)" +
                    " values(?,?,?,?)";
            comandoSql = conexao.prepareStatement(sql);
            comandoSql.setInt(1, pokemon.getNum_pokedex());
            comandoSql.setString(2, pokemon.getNome());

            comandoSql.executeUpdate();
            comandoSql.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Pokemon buscarPorNum(int numPoke){
        Pokemon pokemon = new Pokemon();
        PreparedStatement comandoSql = null;
        try{
            comandoSql = conexao.prepareStatement("SELECT * FROM pokemon WHERE num_pokedex = ?");
            comandoSql.setInt(1, numPoke);
            ResultSet rs = comandoSql.executeQuery();
            if(rs.next()){
                pokemon.setNum_pokedex(rs.getInt(1));
                pokemon.setNome(rs.getString(2));
            }
            conexao.close();
            comandoSql.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return pokemon;
    }

    public List<Produto> listar(){
        List<Produto> produtos = new ArrayList<>();
        PreparedStatement comandoSql = null;
        try{
            comandoSql = conexao.prepareStatement("SELECT * FROM tbl_produto");
            ResultSet rs = comandoSql.executeQuery();
            while (rs.next()){
                Produto produto = new Produto();
                produto.setCodigo(rs.getInt(1));
                produto.setNome(rs.getString(2));
                produto.setPreco(rs.getDouble(3));
                produto.setQuantidade(rs.getInt(4));
                produtos.add(produto);
            }
            conexao.close();
            comandoSql.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return produtos;
    }
}
