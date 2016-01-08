package ioo.ex.edificio;
/**
 * Implentação orientada a objeto.
 * @author Leonardo Pereira Alves
 * @version 26/04/2015
 */
public class PrinciplaClasseEdificio {

    public static void main(String[] args) {
        Edificio predio = new Edificio(100); //Criando objeto edificio com espaço para 100 portas
        Porta porta1 = new Porta(); // Criando objeto porta.
        Porta porta2 = new Porta(); // Criando outro objeto porta.
        //Porta[] portaX = new Porta[100];
        
        predio.mostrar(); //Mostrar status do objeto.
        
        /*for(int i = 0; i < portaX.length; i++){
        portaX[i] = new Porta();
        predio.adicionarPorta(portaX[i]);
        }*/
        predio.adicionarPorta(porta1); // Adicionando a porta ao edificio.
        predio.adicionarPorta(porta2); //Adicionando outra porta
        predio.pintar("Verde");
        predio.porta[0].abre(); // Abrindo a primeira porta adicionada.
        predio.porta[1].abre(); // Abrindo a segunda porta adicionada.
        for(int i = 0; i < 100; i++){ // Adicionando 100 andares ao predio.
            predio.adicionarAndar();
        }
        
        predio.mostrar(); //Mostando novamente.
    } 
}
