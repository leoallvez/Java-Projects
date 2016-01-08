/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

/**
 *
 * @author 12141100130
 */
public class Porta {
    private double comprimento, largura, altura;
    private String cor,descricao;
    private boolean aberta;
    
    public Porta() {}
    
    public Porta(double comp, double larg, double alt, String descricao, String color){
        comprimento = comp;
        largura = larg;
        altura  = alt;
        cor = color;
        this.descricao = descricao;
        aberta = false;
    }    

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
    
    public void fecharPorta() { aberta = false;}
    public void abrirPorta() { aberta = true;}    
    public void pintarPorta(String color) { cor = color;}
    public void mostrarPorta() {
            System.out.println("Descricao :"+descricao);
            System.out.println("Dimensao  :"+altura+"\t"+comprimento+"\t"+largura);
            System.out.println("Cor Porta :"+cor);
    }
    
    
}
