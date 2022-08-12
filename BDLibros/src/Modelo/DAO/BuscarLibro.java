
package Modelo.DAO;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BuscarLibro {
    
    public void buscar(int isbn){
        
        try {
            Conexion cc = new Conexion();            
            Connection cn = cc.conectar();
            Statement st = cn.createStatement();
                        
            ResultSet rs = st.executeQuery("SELECT * FROM libro WHERE ISBN=' "+isbn+"'");
            
            if(rs.next()){
                System.out.println("ISBN: "+rs.getInt(1));
                System.out.println("Titulo: "+rs.getString(2));
                System.out.println("Año: "+rs.getInt(3));
            }else
            {
                System.out.println("No existe un libro con ese ISBN.");
            }
            
            rs.close();
            cn.close();            
            
        } catch (SQLException ex) {
            Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
    
}
