/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto5ciclo2v3.modelo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    //atributo de tipo conecction, permite conectarnos a la base de datos
    Connection conectar = null;
    
    public Connection conectar(){
        
        try {
            //cadenas de conexion para conectar java a sql
            Class.forName("org.sqlite.JDBC");
            //Conexión
            conectar = DriverManager.getConnection("jdbc:sqlite:ProyectosConstruccion.db");
            
            //.jar
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        
        return conectar;
    }
}
