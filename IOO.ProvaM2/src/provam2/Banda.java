package provam2;


public class Banda {
    private AnaoMaestro maestro;
    private AnaoMusico[] musicos;
    
    Banda(AnaoMaestro maestro, AnaoMusico[] musicos){
        this.maestro = maestro;
        this.musicos = musicos;
    } 
}
