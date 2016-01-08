package pkgswitch;
/**
 * @author Leonardo Pereira Alves.
 * @ 18/01/2015
 */
public class Switch {
    public static void main(String[] args) {
        int valor = 0;
        switch (valor){
            case 0:
                System.out.print("Cadrastro de produto ");
                break;
            case 1:
                System.out.print("Emiti nota fiscal ");
                break;
            case 2:
                System.out.print("Cancelar compra ");
                break;
            default:
                System.out.print("Cancelar venda "); 
                break;
        }
    } 
}
