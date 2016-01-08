package veiculo;

public class VeiculoPasseio extends Veiculo{
    protected String cor;
    protected String modelo;
    
    public VeiculoPasseio(){}
    
    public VeiculoPasseio(double p, double v, double pre, Motor m,String c, String mo) {
        super(p, v, pre, m);
        cor = c;
        modelo = mo;
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Cor................:"+cor);
        System.out.println("Modelo.............:"+modelo);
    }
}
