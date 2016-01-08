package biblioteca;

/**
 *
 * @author Leonardo
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login matricula = new Login ();
        matricula.setVisible(true);
        CadastroDeUsuario cadastro = new CadastroDeUsuario();
        cadastro.setVisible(true);
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setVisible(true);
        Pedido_de_Compra pedidoDeCompra = new Pedido_de_Compra();
        pedidoDeCompra.setVisible(true);
        Pesquisa pesquisa = new Pesquisa();
        pesquisa.setVisible(true);
        
        
        // TODO code application logic here
    }
    
}
