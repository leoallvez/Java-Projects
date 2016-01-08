/*
 * Esse programa é para testar o conseito de interface.
 */
package testeinterface;
/**
 * @author Leonardo Pereira Alves.
 * @version 16.01.2015
 */
interface AreaCalculavel{
    double calculaArea();
}
class Quadrado implements AreaCalculavel{
    final private int lado;
    Quadrado(int lado){
        this.lado = lado; 
    }
    @Override
    public double calculaArea(){
        return this.lado;
    }
}
public class TesteInterface {
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
