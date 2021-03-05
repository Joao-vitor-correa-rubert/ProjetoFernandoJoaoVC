/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.PessoaVO;
import persistencia.conexaoBanco;

/**
 *
 * @author Fernando & João Vitor
 * @since 12/06/2017
 * @version Beta Xamego 1.9
 */
public class PesssoaDAO {
    
    public void cadastrarProduto(PessoaVO proVO) throws SQLException {

        //Buscando uma conexão com o Banco de Dados
        Connection con = conexaoBanco.getConexao();
        /*Criando obj. capaz de executar instruções
         SQL no banco de dados*/
        Statement stat = con.createStatement();

        try {
            //String que receberá instrução SQL
            String sql;

            /* Montando a instrução INSERT para inserir
             um objeto pVO no Banco MySQL */
            sql = "insert into produto(cod_pro,produto,valor,quantidade_estoque)"
                    + "values(null, '" + proVO.getProduto()+ "', " + proVO.getValor()+ ", " + proVO.getQuantidadeEstoque()+ ")";

            //Executando o sql
            stat.execute(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir produto!");
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
    
    public void cadastrarPessoa(PessoaVO p ) throws SQLException{
       
       Connection con = conexaoBanco.getConexao();//busca conexção
       Statement Stat = con.createStatement();//permite fazer sql
       
       try {
           String sql= "";
           
           sql = "insert into cliente(cod_cli,nome,cpf,endereco,bairro,numero,complemento,cep,telefone,cidade)"
                 +"values(null,'"+p.getNome()+"',"+p.getCpf()+",'"+p.getEndereco()+"','"+p.getBairro()+"',"+p.getNumero()+",'"+p.getComplemento()+"',"+p.getCep()+","+p.getTelefone()+",'"+p.getCidade()+"')";
           
           Stat.execute(sql);//envia par ao banco com isso
           
       } catch (SQLException se) {
           throw  new SQLException("Erro ao cadastrar,tente novamente!"+se.getMessage());
       }finally{
           //encerrrando os portais do banco!
           Stat.close();
           con.close();
       }//fecha finally
   }//fecha método
    
    public ArrayList<PessoaVO> buscarPessoas() throws SQLException {

        Connection con = conexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            //Montando o sql            
            sql = "select * from cliente";

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Criando ArrayList para armazenar 
             objetos do tipo produto */
            ArrayList<PessoaVO> prod = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                PessoaVO p = new PessoaVO();

                /* Mapeando a tabela do banco para objeto
                 chamado pVO */
                p.setCod_cli(rs.getInt("cod_cli"));
                p.setNome(rs.getString("nome"));
                p.setCpf(rs.getString("cpf"));
                p.setEndereco(rs.getString("endereco"));
                p.setBairro(rs.getString("bairro"));
                p.setNumero(rs.getInt("numero"));
                p.setComplemento(rs.getString("complemento"));
                p.setCep(rs.getInt("cep"));
                p.setTelefone(rs.getString("telefone"));
                p.setCidade(rs.getString("cidade"));
                /* Inserindo o objeto pVO no ArrayList */
                prod.add(p);
            }//fecha while

            //Retornando o ArrayList com todos objetos
            return prod;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar Cliente! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
    
    
    public ArrayList<PessoaVO> buscarProdutos() throws SQLException {

        Connection con = conexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            //Montando o sql            
            sql = "select * from produto";

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Criando ArrayList para armazenar 
             objetos do tipo produto */
            ArrayList<PessoaVO> prod = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                PessoaVO p = new PessoaVO();

                /* Mapeando a tabela do banco para objeto
                 chamado p */
                p.setCod_pro(rs.getInt("cod_pro"));
                p.setProduto(rs.getString("produto"));
                p.setValor(rs.getDouble("valor"));
                p.setQuantidadeEstoque(rs.getDouble("quantidade_estoque"));

                /* Inserindo o objeto pVO no ArrayList */
                prod.add(p);
            }//fecha while

            //Retornando o ArrayList com todos objetos
            return prod;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar produtos! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
    
    public ArrayList<PessoaVO> filtrarPro(String query) throws SQLException {

        Connection con = conexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            //Montando o sql            
            sql = "select * from produto "+query;

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Criando ArrayList para armazenar 
             objetos do tipo produto */
            ArrayList<PessoaVO> prod = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                PessoaVO p = new PessoaVO();

                /* Mapeando a tabela do banco para objeto
                 chamado pVO */
                p.setCod_pro(rs.getInt("cod_pro"));
                p.setProduto(rs.getString("produto"));
                p.setValor(rs.getDouble("valor"));
                p.setQuantidadeEstoque(rs.getDouble("quantidade_estoque"));

                /* Inserindo o objeto pVO no ArrayList */
                prod.add(p);
            }//fecha while

            //Retornando o ArrayList com todos objetos
            return prod;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar produtos! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
    
    public ArrayList<PessoaVO> filtrarPessoa(String query) throws SQLException {

        Connection con = conexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            //Montando o sql            
            sql = "select * from cliente "+query;

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Criando ArrayList para armazenar 
             objetos do tipo produto */
            ArrayList<PessoaVO> prod = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                PessoaVO p = new PessoaVO();

                /* Mapeando a tabela do banco para objeto
                 chamado pVO */
                p.setCod_cli(rs.getInt("cod_cli"));
                p.setNome(rs.getString("nome"));
                p.setCpf(rs.getString("cpf"));
                p.setEndereco(rs.getString("endereco"));
                p.setBairro(rs.getString("bairro"));
                p.setNumero(rs.getInt("numero"));
                p.setComplemento(rs.getString("complemento"));
                p.setCep(rs.getInt("cep"));
                p.setTelefone(rs.getString("telefone"));
                p.setCidade(rs.getString("cidade"));
     
                /* Inserindo o objeto pVO no ArrayList */
                prod.add(p);
            }//fecha while

            //Retornando o ArrayList com todos objetos
            return prod;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar pessoa! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
    public void deletarProduto(long id)throws SQLException{
        Connection con = conexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql="";
            
            sql="delete from produto where cod_pro= "+id;
            
            stat.execute(sql);
            
        } catch (SQLException se) {
            throw  new SQLException("Erro ao deletar!"+se.getMessage());
        }finally{
            stat.close();
            con.close();
        }//fecha finally
    }//fecha deletar 
    
    public void deletarPessoa(long id)throws SQLException{
        Connection con = conexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql="";
            
            sql="delete from cliente where cod_cli= "+id;
            
            stat.execute(sql);
            
        } catch (SQLException se) {
            throw  new SQLException("Erro ao deletar!"+se.getMessage());
        }finally{
            stat.close();
            con.close();
        }//fecha finally
    }//fecha deletar 
    
}//fecha class
