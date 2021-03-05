/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 *
 * @author Fernando & João Vitor
 * @since 12/06/2017
 * @version Beta Xamego 1.9
 */
public class servicosFactory {
    
    private static final PessoaServicos ps = new PessoaServicos();
    private static final usuarioServicos usuarioServicos= new usuarioServicos();
    
    public static PessoaServicos getPessoaServicos(){
        return ps;
    }
    
    public static usuarioServicos getUsuarioServicos(){
       
       return usuarioServicos;
   }//fecha metodo
    
}
