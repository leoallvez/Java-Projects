package ioo.ex.pkg010.casa;
/**
 * Implentação orientada a objeto.
 * @author Leonardo Pereira Alves
 * @version 26/04/2015
 * 
 */
public class PrincinpalClasseCasa {

    public static void main(String[] args) {
        Casa casa1 = new Casa(4);
        
        casa1.mostrar();
        casa1.pintar("Amarela");
        casa1.porta[0].abre();
        casa1.porta[1].abre();
        
        casa1.mostrar();
        
    }
    
}
