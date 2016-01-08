package veiculo;

public class Motor {
    private int numCilindro;
    private int pontenci;
    
    public Motor(){
        numCilindro = 0;
        pontenci = 0;
    }
    
    public Motor(int n,int p){
        numCilindro = n;
        pontenci = p;
    }
    
    public void mostrar(){
        System.out.println("Motor:");
        System.out.println("Número de Cilindro.:"+numCilindro);
        System.out.println("Potencia...........:"+pontenci+" cavalos");    
    }
    
}
