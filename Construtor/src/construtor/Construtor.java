/*
 * Esse programa mostra um a utilização dos construtores.
 * E a declaração do método do static.
 */
package construtor;

class Teste{
    static int one; // Atributo estático.
    Teste(){ // Construtor da classe Teste.
        Teste.one = Teste.one + 1;
        System.out.println(one);
    }
}
public class Construtor {
    public static void main(String[] args){
        Teste x = new Teste();
        Teste z = new Teste();
    }
}
