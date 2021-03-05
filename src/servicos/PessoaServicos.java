/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.PesssoaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.PessoaVO;

/**
 *
 * @author Fernando & João Vitor
 * @since 12/06/2017
 * @version Beta Xamego 1.9
 */
public class PessoaServicos {
    
    public void cadastrarProduto(PessoaVO proVO) throws SQLException {
        PesssoaDAO proDAO = DAOFactory.getPessoaDAO();
        proDAO.cadastrarProduto(proVO);
    }//fecha método
    
    public void cadastarPessoa(PessoaVO p)throws SQLException{
        PesssoaDAO pDAO = DAOFactory.getPessoaDAO();
        pDAO.cadastrarPessoa(p);
    }//fecha cadastro 
    
    public ArrayList<PessoaVO> buscarPessoas() throws SQLException {
        PesssoaDAO pDAO = DAOFactory.getPessoaDAO();
        return pDAO.buscarPessoas();
    }//fecha método
    public ArrayList<PessoaVO> buscarProduto() throws SQLException {
        PesssoaDAO pDAO = DAOFactory.getPessoaDAO();
        return pDAO.buscarProdutos();
    }//fecha método
    public ArrayList<PessoaVO> filtrarPro(String query) throws SQLException {
        PesssoaDAO pDAO = DAOFactory.getPessoaDAO();
        return pDAO.filtrarPro(query);
    }//fecha método
    public ArrayList<PessoaVO> filtrarPessoa(String query) throws SQLException {
        PesssoaDAO pDAO = DAOFactory.getPessoaDAO();
        return pDAO.filtrarPessoa(query);
    }//fecha método
    public void deleteProduto(long id)throws  SQLException{
        PesssoaDAO pDAO = DAOFactory.getPessoaDAO();
        pDAO.deletarProduto(id);
    }
    public void deletePessoa(long id)throws  SQLException{
        PesssoaDAO pDAO = DAOFactory.getPessoaDAO();
        pDAO.deletarPessoa(id);
    }
}//fecha class
