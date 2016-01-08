package testes;

public class Main {

    
    public static void main(String[] args) {
        
        TantoFaz a = metodoEstranho(1,2,3);
        TantoFaz b = metodoEstranho(3,2,1);
        
        System.out.println(a.getN3());
        System.out.println(b.getN3());
        
    }
    
    public static TantoFaz metodoEstranho(int a, int b, int c){
        TantoFaz n = new TantoFaz();
        
        n.setN1(a);
        n.setN2(b);
        n.setN3(c);
        
        return n;
    }
}
