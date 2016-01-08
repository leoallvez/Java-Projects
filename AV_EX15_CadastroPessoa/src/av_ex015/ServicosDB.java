/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av_ex015;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcoaurelio
 */
public class ServicosDB {
    public static String connectionUrl = "jbdc:mysql://localhost/pessoafisica";
    private Connection con;
    
    public ServicosDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();            
            con = DriverManager.getConnection(connectionUrl,"root","1982");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServicosDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServicosDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ServicosDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ServicosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet Consultar(String strSQL) {
        try {
            Statement stmt = con.createStatement();
            stmt.execute(strSQL);
            ResultSet r = stmt.getResultSet();
            return r;
        } catch (SQLException ex) {
            Logger.getLogger(ServicosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int Atualizar(String strSQL) {
        try {            
            Statement stmt = con.createStatement();
            int linhas = stmt.executeUpdate(strSQL);                       
            return linhas;
        } catch (SQLException ex) {
            Logger.getLogger(ServicosDB.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return -1;
    }
}
