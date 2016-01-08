package estacionamento;
import java.sql.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Connection con = Conexao.abrirConexao();
        
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);
        cb.setPlaca("JKK1900");
        cb.setCor("Azul");
        cb.setDescricao("Carro 1");
        System.out.println(cd.inserir(cb));
    } 
}
