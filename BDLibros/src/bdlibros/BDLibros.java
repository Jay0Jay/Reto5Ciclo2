
package bdlibros;

import Modelo.Clases.Inventario;
import Modelo.Clases.Libro;
import Modelo.DAO.ActualizarUnidades;
import Modelo.DAO.BuscarLibro;
import Modelo.DAO.Conexion;
import Modelo.DAO.ConsultarUnidades;
import Modelo.DAO.GuardarDAO;
import Modelo.DAO.ListarLibros;
import Modelo.DAO.VenderLibro;
import java.sql.*;
import java.util.Scanner;

public class BDLibros {

    public static void main(String[] args) {
              
        /*Conexion cc = new Conexion();
        Connection cn = cc.conectar();*/
        Scanner sc = new Scanner(System.in);
        Libro libro = new Libro();
        Inventario inventario = new Inventario();
        
        boolean continuar = true;
        do{
            System.out.println("Elija la opcion a relizar sobre la BD: ");
            
            System.out.println("1. Guardar\n"
                    + "2. Buscar\n"
                    + "3 Listar Libro\n"
                    + "4.  Actualizar unidades\n"
                    + "5. Consultar unidades.\n"
                    + "6. Vender libro\n"
                    + "7.Salir\n");
            System.out.println("Digite la opcion: ");
            int opcion = sc.nextInt();
            
            switch(opcion)
            {
                case 1:
                    System.out.println("*********Guardar libro*********");
                    
                            System.out.println("Digite el ISBN");
                            libro.setIsbn(sc.nextInt());
                            sc.nextLine();
                            System.out.println("Digite el titulo");
                            libro.setTitulo(sc.nextLine());
                            System.out.println("Digite el año: ");
                            libro.setAño(sc.nextInt());
                            GuardarDAO guardarDao = new GuardarDAO();
                            guardarDao.guardar(libro.getIsbn(), libro.getTitulo(), libro.getAño());
                            break;
                
                case 2:
                    System.out.println("*********Buscar libro*********");
                    
                           System.out.println("Digite el ISBN del libro a buscar");
                           libro.setIsbn(sc.nextInt());
                           BuscarLibro buscarL = new BuscarLibro();
                           buscarL.buscar(libro.getIsbn());                      
                    
                           break;
                
                case 3:
                    System.out.println("*********Listar libro*********");
                    
                            ListarLibros  listarL = new ListarLibros();
                            listarL.listar();
                            break;
                            
                case 4:
                    System.out.println("*********Actualizar unidades*********");
                            
                           System.out.println("Digite el ISBN del libro a actualizar unidades:");
                           
                           libro.setIsbn(sc.nextInt());
                           System.out.println("Digite la cantidad: ");
                           inventario.setCantidad(sc.nextInt());
                           ActualizarUnidades actualizarUni = new ActualizarUnidades();
                           
                           actualizarUni.actualizar(libro.getIsbn(), inventario.getCantidad());
                           
                    
                            break;
                            
                case 5:
                    System.out.println("*********Consultar unidades*********");
                            System.out.println("Digite el ISBN  del libro a consultar unidades: ");
                            libro.setIsbn(sc.nextInt());
                            ConsultarUnidades consultarUni = new ConsultarUnidades();
                            consultarUni.consultarU(libro.getIsbn());
                    
                            break;
                            
                case 6:
                    System.out.println("*********Vender Libro*********"); 
                    System.out.println("Digite el ISBN del libro a vender: ");
                    libro.setIsbn(sc.nextInt());
                    
                    System.out.println("Digite la cantidad: ");
                    inventario.setCantidad(sc.nextInt());
                    VenderLibro venderL = new VenderLibro();
                    
                    venderL.vender(libro.getIsbn(), inventario.getCantidad());
                    
                    break;
                case 7:
                    System.out.println("Gracias por utilizar nuestro sistema");
                    continuar = false;
                    break;
                default:
                    System.out.println("No es una opcion valida.");
            }
        }while(continuar);
        
    }
    
}

