
package Modelo.DAO;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ListarLibros {
    
    public void listar(){
        
        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();            
            Statement st = cn.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM libro");
            
            while (rs.next()){
                System.out.println("----------------------------");
                
                System.out.println("ISBN: "+rs.getInt(1));
                System.out.println("Titulo: "+rs.getString(2));
                System.out.println("Año: "+rs.getInt(3));
                
                System.out.println("----------------------------");
                
            }
            rs.close();
            cn.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ListarLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

}
