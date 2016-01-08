package exibeumacinco;
public class ExibeUmACinco {
    private void exibeContagem(){
        int contador = 1;
        while(contador < 6){
            System.out.println(contador);
            contador++;
        }
    }
    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExibeUmACinco objeto = new ExibeUmACinco();
        objeto.exibeContagem();
    }
}
