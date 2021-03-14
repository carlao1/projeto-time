/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Persistencia {
    
    private static Connection conn = null;
    
    private static final String CONNURL = "jdbc:mysql://localhost:3306/dbprojetotime?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "testuserteam";
    private static final String PASSWORD = "1234";
    
    private Persistencia() {
        try{
            
            //Class.forName("org.gjt.mm.mysql.Driver"); //NAO TENHO IDEIA
            conn = (Connection) DriverManager.getConnection(CONNURL, USER, PASSWORD);
            
            //System.out.println(conn);
            
        }/*catch(ClassNotFoundException e) {
            System.out.println("Nao foi possivel encontrar o Driver especificado" + e);
        }*/
        catch(SQLException ex) {
            System.out.println("Nao foi possivel encontrar o banco de dados" + ex);
        }
    }
    
    public static Connection conexao() {
        if( conn == null) {
            Persistencia p1 = new Persistencia();
        }
        return conn;
    }
    
}
