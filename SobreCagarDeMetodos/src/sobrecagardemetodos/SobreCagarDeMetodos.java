package sobrecagardemetodos;
/**
 * Esse Programa mostra com fumciona a sobrecarga de metodo.
 * @author Leonardo Pereira Alves
 */
class Matematica{
    public int soma (int operador1, int operador2){
        return operador1 + operador2;
    }
    public int soma (int operador){
        return operador + operador;
    }
    
    public float soma (float operador1, float operador2){
        return operador1 + operador2;
    }
    public double soma (double operador1, double operador2){
        return operador1 + operador2;
    }
    
}
public class SobreCagarDeMetodos {
    
    public static void main(String[] args) {
        
        Matematica a = new Matematica();
        double b = a.soma(1.0,5.0);
        int c = a.soma(2);
        int d = a.soma(1, 2);
        
        System.out.println("Soma b é: " + b);
        System.out.println("Soma c é: " + c);
        System.out.println("Soma d é: " + d);
        
        
    }
}
