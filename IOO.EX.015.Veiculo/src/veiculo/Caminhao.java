package veiculo;

public class Caminhao extends Veiculo{
    protected double toneladas;
    protected double alturaMax;
    protected double comprimento;
    
    public Caminhao(){}
    
    public Caminhao(double p, double v, double pre, Motor m,double to,double al, double com) {
        super(p, v, pre, m);
        toneladas = to;
        alturaMax = al;
        comprimento = com;
    } 
    
    public void mostrar(){
        System.out.println("Caminhão:");
        System.out.println("Tonelada...........:"+toneladas);
        System.out.println("Altura Max.........:"+alturaMax);
        System.out.println("Comprimento........:"+comprimento);
        super.mostrar();
    }
}
