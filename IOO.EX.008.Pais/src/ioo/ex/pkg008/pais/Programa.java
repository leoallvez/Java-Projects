
package ioo.ex.pkg008.pais;

/**
 * Implentação orientada a objeto,
 * @author Leonardo Pereira Alves
 * @version 24/04/2015
 */
public class Programa {

    public static void main(String[] args) {
        /** Ultilizando o contrutor que inicializa os atributos, sendo que se
         *  forem retirados os parametros será usado o segundo construtor da
         *  classe que não inicializa os atributos.
         */
        Pais Argentina = new Pais("Argentina","Bueno Aires",38,100);
        Pais Brasil = new Pais("Brasil","Brasilia",100.00,100,Argentina);
        // Chamando o metodo mostra
        Brasil.mostrar();
   
        // Mostarndo mudança feita.
        Argentina.mostrar();
    } 
}
