/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provam2;

public class AnaoMusico extends Anao{
    protected Instrumento istru;
    protected String tomDeVoz;
    public AnaoMusico(String nome, double altura,Instrumento istru, String tomDeVoz){
        super(nome,altura);
        this.istru = istru;
        this.tomDeVoz = tomDeVoz;
    }  
}
