
package Modelo.DAO;

import java.sql.*; //importa todas las conexiondes de sql

public class Conexion {
    //atributo de tipo conecction, permite conectarnos a la base de datos
    Connection conectar = null;
    
    public Connection conectar(){
        
        try {
            //cadenas de conexion para conectar java a sql
            Class.forName("org.sqlite.JDBC");
            //Conexión
            conectar = DriverManager.getConnection("jdbc:sqlite:libro.db");
            
            //.jar
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        
        return conectar;
    }
}