/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbdd;

import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author HP Probook 440 G3
 */
public class Conexionbdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        PreparedStatement ps = null;
        conector stringConexion = new conector();
        stringConexion.getConxion();
        
        // Insert
        
        String insert =
"insert into "
+ "articulos(nombre,descripcion,precio) "
+ "values(?,?,?) ";
        
        try {
            ps = (PreparedStatement) stringConexion
                    .getConxion()
                    .prepareStatement(insert);
            ps.setString(1, "X box");
            ps.setString(2, "Consola juegos");
            ps.setInt(3, 500);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Conexionbdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
        
        
    }
        // TODO code application logic here
    }
    

