package oi;

/**
 * Programa para mostrar o metodo digaOi.
 * @author Leonardo Pereira Alves
 * @version 27-12-2014
 */
public class Oi {
    private void digaOi(){
        System.out.println("Oi!");
        System.out.println("Esse é um motodo digaOi");
        System.out.println("Ele contem 3 comandos");         
    }
    public int veze2 (int valor){ // metodo que retonar um valor vezes 2.
        int i = valor * 2;
        return i;
    }
    public static void main(String[] args) {
        final Oi objeto = new Oi();
        objeto.digaOi();
        objeto.digaOi();
        System.out.println(objeto.veze2(2));
    } 
}
