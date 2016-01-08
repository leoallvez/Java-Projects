package meuexe6;

/**
 *
 * @author Leonardo Pereira Alves
 * @version 18.02.2015
 */
public class Principal {

    public static void main(String[] args) {
        Cliente c1 = new Cliente(1000);
        
        c1.mostra();
        c1.compra();
        c1.mostra();
    }
}
