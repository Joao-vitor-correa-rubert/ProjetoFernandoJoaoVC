/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.UsuarioLoginDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.UsuarioVO;

/**
 *
 * @author Fernando & João Vitor
 * @since 12/06/2017
 * @version Beta Xamego 1.9
 */
public class usuarioServicos {
    
    public void cadastrarUsuario(UsuarioVO uVO) throws SQLException {
        UsuarioLoginDAO uDAO = DAOFactory.getUsuarioDAO();
        uDAO.cadastrarUsuario(uVO);
    }//fecha método
    
    public ArrayList<UsuarioVO> buscarUsuarios() throws SQLException {
        UsuarioLoginDAO uDAO = DAOFactory.getUsuarioDAO();
        return uDAO.buscarUsuarios();
    }//fecha método    
    
    public boolean validarSenha(UsuarioVO u) throws SQLException {
        UsuarioLoginDAO uDAO = DAOFactory.getUsuarioDAO();
        return uDAO.validarSenha(u);
    }//fecha método
    
}
