/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import com.itextpdf.text.PageSize;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import modelo.PessoaVO;

/**
 *
 * @author Fernando & João Vitor
 * @since 12/06/2017
 * @version Beta Xamego 1.9
 */
public class GeraPDF {
    private static String nomePDF = "nomePadrao";

    public static String getNomePDF() {
        return nomePDF;
    }

    public static void setNomePDF(String nomePDF) {
        GeraPDF.nomePDF = nomePDF;
    }
        
    public static void gerarPDF(PessoaVO VO) throws Exception {

        Document document = null;

        try {
            document = new com.itextpdf.text.Document(PageSize.A4, 72, 72, 72, 72);
            PdfWriter.getInstance(document, new FileOutputStream(nomePDF+".pdf"));

            //Abrindo documento PDF para inserir dados
            document.open();

            System.out.println("teste: "+VO);
            
            //Inserindo um novo parágrafo no PDF
            document.add(new Paragraph(VO.toString()));
            
        } catch (Exception e) {
            throw new Exception("Erro ao gerar PDF! " + e.getMessage());
        } finally{
            //Fechando PDF
            document.close();
        }//fecha finally
    }//fecha método

}//fecha classe
