package soma_ratramentorecursivo;
/**
 * 
 * @author Leonardo Pereira Alves
 * @version 27-12-14
 */
public class Soma_RatramentoRecursivo {
    private String somaString(final int n){ return "soma("+n+")";}
    private int max = 0;
    private void printout (final int n, final String s) {
        System.out.print (somaString(n));
        for(int i = 0; i <= max - n; ++i){ System.out.print(" "); }
        System.out.print(s);
    }
    private int soma (final int n){
        System.out.println("chama"+somaString(n));
        if (n > max){max = n;}    
        if (n == 0){
            printout (n,"n == 0, return0\n");
            return 0;
        }else{
            printout (n,"n!=0,");
            final int x = soma (n -1);
            printout(n,"retorna "+x+" + "+n+" ("+(x+n)+")\n");
            return x + n;
        }
    }
    public static void main(String[] args) {
        final Soma_RatramentoRecursivo obj = new Soma_RatramentoRecursivo();
        int s = 5;
        obj.soma(s);
    }
}
