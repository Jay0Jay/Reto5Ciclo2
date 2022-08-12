
package Modelo.DAO;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ActualizarUnidades {
    
    public void actualizar(int isbn, int cantidad){

        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            Statement st = cn.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM libro WHERE ISBN='"+isbn+"'");
            
            if(rs.next()){
                
                ResultSet rsi = st.executeQuery("SELECT * FROM inventario WHERE ISBN='"+isbn+"'");
                
                if(rsi.next()){
                    PreparedStatement ps = cn.prepareStatement("UPDATE inventario SET cantidad=? WHERE ISBN=?");
                    
                    ps.setInt(1, rsi.getInt(2)+cantidad);
                    ps.setInt(2, isbn);
                    ps.executeUpdate();
                    ps.close();
                    System.out.println("Unidades Actualizadas exitosamente");
                }else{
                    PreparedStatement ps = cn.prepareStatement("INSERT INTO inventario VALUES (?,?)");
                    ps.setInt(1, isbn);
                    ps.setInt(2, cantidad);
                    ps.executeUpdate();
                    System.out.println("Unidades Insertadas exitosamente...");
                    ps.close();
                    
                }
                
                rs.close();
                
            }else{
                System.out.println("No existe un libro con ese ISBN");
            }
            
            cn.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ActualizarUnidades.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
