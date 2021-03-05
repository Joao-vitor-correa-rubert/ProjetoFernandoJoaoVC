/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * @author Joao Vitor C. & Fernando Souza
 * @version 1.0 beta
 * @since 08/06/2017
 */
public class PessoaVO {
    
    private int cod_cli;
    private int cod_pro;
    private String nome;
    private String produto;
    private String cpf;
    private String bairro;
    private int cep;
    private String telefone;
    private double valor;
    private double quantidadeEstoque;
    private String endereco;
    private int numero;
    private String complemento;
    private String cidade;

    public PessoaVO() {
    }

    public PessoaVO(int cod_cli, int cod_pro, String nome, String produto, String cpf, String bairro, int cep, String telefone, double valor, double quantidadeEstoque, String endereco, int numero, String complemento, String cidade) {
        this.cod_cli = cod_cli;
        this.cod_pro = cod_pro;
        this.nome = nome;
        this.produto = produto;
        this.cpf = cpf;
        this.bairro = bairro;
        this.cep = cep;
        this.telefone = telefone;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
    }

    public int getCod_cli() {
        return cod_cli;
    }

    public void setCod_cli(int cod_cli) {
        this.cod_cli = cod_cli;
    }

    public int getCod_pro() {
        return cod_pro;
    }

    public void setCod_pro(int cod_pro) {
        this.cod_pro = cod_pro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(double quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

   
    @Override
    public String toString() {
        return "\nCodigo do cliente é: "+cod_cli
               +"\nCodigo do produto é: "+cod_pro
               +"\nNome: "+nome
               +"\nCPF: "+cpf
               +"\nBairro: "+bairro
               +"\nCep: "+cep
               +"\nTelefone: "+telefone
               +"\nValor: "+valor
               +"\nQuantidade de estoque: "+quantidadeEstoque
               +"\nEndereco: "+endereco
               +"\nNumero: "+numero
               +"\nComplemento: "+complemento
               +"\nCidade: "+cidade;

    }//fecha to string                
}//fecha class