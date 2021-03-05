/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Fernando & João Vitor
 * @since 12/06/2017
 * @version Beta Xamego 1.9
 */
public class conexaoBanco {
    
    //Atributos estáticos com os dados do Banco de Dados
    private static String URL = "jdbc:mysql://localhost:3306/restaurante";
    private static String USUARIO = "joao";
    private static String SENHA = "root";

    //Método que efetua a conexão com o MySQL
    public static Connection getConexao() throws SQLException {
        Connection c = null;
        try {
            c = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException se) {
            throw new SQLException("Erro ao conectar! " + se.getMessage());
        }//fecha catch
        return c;
    }//fecha metodo
    
}
