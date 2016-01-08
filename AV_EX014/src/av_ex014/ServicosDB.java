/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av_ex014;

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
    public static String connectionUrl = "jdbc:sqlserver://26LAB116;" +
			"databaseName=db_aula;integratedSecurity=false;user=sa;password=123456;";
    private Connection con;
    
    public ServicosDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();            
            con = DriverManager.getConnection(connectionUrl);
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
