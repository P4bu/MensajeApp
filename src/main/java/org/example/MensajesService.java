package org.example;

import java.util.Scanner;

public class MensajesService {
    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();

        System.out.println("Ingresa tu nombre");
        String autorMensaje = sc.nextLine();

        Mensaje registro = new Mensaje();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(autorMensaje);
        MensajesDAO.creaMensaje(registro);

    }
    public static void listarMensaje(){
        MensajesDAO.leerMensaje();
    }
    public static void borrarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese ID a borrar");
        int id_mensaje = sc.nextInt();
        MensajesDAO.borrarMensaje(id_mensaje);
    }
    public static void editarMensaje(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();

        System.out.println("Ingrese ID a Actualizar");
        int id_mensaje = sc.nextInt();

        Mensaje actualizacion = new Mensaje();
        actualizacion.setId_mensaje(id_mensaje);
        actualizacion.setMensaje(mensaje);
        MensajesDAO.actualizarMensajeDB(actualizacion);
    }

}
