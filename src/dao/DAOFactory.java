/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Fernando & João Vitor
 * @since 12/06/2017
 * @version Beta Xamego 1.9
 */
public class DAOFactory {
    
    private static final PesssoaDAO pDAO = new PesssoaDAO();
    private static final UsuarioLoginDAO usuarioLoginDAO = new UsuarioLoginDAO();
    
    public static PesssoaDAO getPessoaDAO(){
        return pDAO;
    }//fecha getprodutoDAO
    public static UsuarioLoginDAO getUsuarioDAO(){
        return usuarioLoginDAO;
    }//fecha método
    
    
}
