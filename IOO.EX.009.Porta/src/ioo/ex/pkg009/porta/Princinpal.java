package ioo.ex.pkg009.porta;
/**
 * Implentação orientada a objeto.
 * @author Leonardo Pereira Alves
 * @version 26/04/2015
 * 
 */
public class Princinpal {
    public static void main(String[] args) {
        // Criando um objeto do tipo Porta.
        Porta porta1 = new Porta();
        // Mostrar status.
        porta1.mostrar();
        porta1.abre(); //Abrir porta
        porta1.pinta("Azul"); //Pintar porta.
        porta1.setDimensoes(3.0, 2.0, 2.0); //Mudar dimensões da porta.
        porta1.mostrar();
        
        
        
        
    }
    
}
