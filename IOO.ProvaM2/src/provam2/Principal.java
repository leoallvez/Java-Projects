/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provam2;

/**
 *
 * @author 12141100130
 */
public class Principal {

    public static void main(String[] args) {
        Anao dunga = new Anao("Dunga",1.51);
        
        Instrumento violao = new Instrumento("Corda","Um violão comum");
        Instrumento gaita = new Instrumento("Sopro", "Gaita profissional");
        
        AnaoMusico zangado = new AnaoMusico("Zangado",1.44, violao,"agudo");
        AnaoMusico atim = new AnaoMusico("Atim", 1.22, gaita, "grave");
        
        AnaoMaestro soneca = new AnaoMaestro("Soneca",1.33,20);
        
        AnaoMusico[] musicos = {zangado,atim};
        
        Banda bandaDeAnoes = new Banda(soneca, musicos);
    }
}
