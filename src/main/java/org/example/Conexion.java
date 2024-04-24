package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection get_connection(){
        Connection conection = null;
        try{
            conection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mensaje_app","postgres","admin");
        }catch(SQLException e){
            System.out.println(e);
        }
        return conection;
    }
}
