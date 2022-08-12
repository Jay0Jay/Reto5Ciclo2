package Modelo.DAO;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GuardarDAO {
    
    public void guardar(int isbn, String titulo, int año)
    {
        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            
            PreparedStatement ps = cn.prepareStatement("INSERT INTO libro VALUES(?,?,?)");
            
            ps.setInt(1, isbn);
            ps.setString(2, titulo);
            
            //Date
            //Convertir a un dat eentendible por sql
            Calendar fecha = new GregorianCalendar(año,1,1);
            int año_sql =fecha.get(Calendar.YEAR);
            java.sql.Date sqlDate = new java.sql.Date(año_sql);
            ps.setDate(3, sqlDate);
            
            //ejecutar la sentencia
            ps.executeUpdate ();
            ps.close();
            System.out.println("Conexión un exitaso");
            //cerrar la conexión
            cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(GuardarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
