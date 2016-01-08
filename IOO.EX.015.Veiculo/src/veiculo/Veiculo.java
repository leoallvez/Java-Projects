package veiculo;

public class Veiculo {
    protected double peso;
    protected double velocMax;
    protected double preco;
    protected Motor mot;
    
    public Veiculo(){}
    
    public Veiculo(double p,double v,double pre, Motor m){
        peso = p;
        velocMax = v;
        preco = pre;
        mot = m;    
    }
    
    public void mostrar(){
        System.out.println("Peso...............:"+peso+" Kilos");
        System.out.println("Velocidade Max.....:"+velocMax+" Km");
        System.out.println("Preço..............:"+preco);
        this.mot.mostrar();
    }
    
}
