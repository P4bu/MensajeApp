package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO {
    public static void creaMensaje(Mensaje mensaje){
        Conexion dbConnect = new Conexion();
        try(Connection conexion = dbConnect.get_connection()){
             PreparedStatement ps=null;
             try{
                 String query = "INSERT INTO mensaje(mensaje, autor_mensaje)VALUES (?, ?)";
                 ps = conexion.prepareStatement(query);
                 ps.setString(1, mensaje.getMensaje());
                 ps.setString(2, mensaje.getAutor_mensaje());
                 ps.executeUpdate();
                 System.out.println("Mensaje creado");
             }catch(SQLException ex){
                 System.out.println(ex);
             }
        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void leerMensaje(){
        Conexion dbConnect = new Conexion();
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try(Connection conexion = dbConnect.get_connection()){
            try{
                String query = "SELECT * FROM MENSAJE";
                ps = conexion.prepareStatement(query);
                resultSet = ps.executeQuery();
                while(resultSet.next()){
                    System.out.println("ID: "+resultSet.getInt("id_mensaje"));
                    System.out.println("Msj: "+resultSet.getString("mensaje"));
                    System.out.println("Autor: "+resultSet.getString("autor_Mensaje"));
                    System.out.println("Fecha: "+resultSet.getDate("fechamensaje"));
                    System.out.println("");
                }
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void borrarMensaje(int id_mensaje){
        Conexion dbConnect = new Conexion();

        try(Connection conexion = dbConnect.get_connection()){
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM MENSAJE WHERE id_mensaje = ?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, id_mensaje);
                ps.executeUpdate();
                System.out.println("El mensaje a sido eliminado");

            }catch (SQLException ex){
                System.out.println("No se pudo borrar el mensaje");
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void actualizarMensajeDB (Mensaje mensaje){
        Conexion dbConnect = new Conexion();
        try(Connection conexion = dbConnect.get_connection()){
            PreparedStatement ps = null;
            try{
               String query = "UPDATE MENSAJE SET mensaje = ? where id_mensaje = ?";
               ps = conexion.prepareStatement(query);
               ps.setString(1, mensaje.getMensaje());
               ps.setInt(2, mensaje.getId_mensaje());
               ps.executeUpdate();
                System.out.println("El mensaje se ha actualizado");
            }catch (SQLException ex){
                System.out.println(ex);
                System.out.println("No se pudo actualizar mensaje");
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
