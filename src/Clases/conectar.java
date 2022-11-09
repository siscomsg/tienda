package Clases;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Sony
 */

public class conectar {
    Connection conect;
    Statement sentencia;
   public Connection conexion(){
      try {
           final String controlador="com.mysql.jdbc.Driver";
           //Cargamos el Driver MySQL
           Class.forName(controlador);
      }catch(Exception e){
          JOptionPane.showMessageDialog(null,"Error al cargar controlador");
      }
      try{
          String DSN="jdbc:mysql://localhost:3306/tienda";
          String user="root";
          String password="";
          conect = DriverManager.getConnection(DSN,user,password);
      } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al realizar la conexion");
        }
        try{
            sentencia=conect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al crear el objeto sentencia");
        }
      return conect;      
}
}
