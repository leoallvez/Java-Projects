
package empresas;

/**
 *
 * @author Leonardo
 */
public class PrincipalEmpresas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Restaurante[] rest = new Restaurante[3];
        
        for(int i = 0; i < rest.length; i++){
            rest[i] = new Restaurante("Nome"+i, "Cidade"+i, "Estado"+i, "Comida"+i, 2);
        }
        Restaurante rest2 = new Restaurante();
        int n = rest2.buscaCidade(rest,"Cidade1");
        System.out.println(n);
    }
    
}
