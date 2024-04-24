package org.example;

import java.sql.Connection;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do{
            System.out.println("-----------------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. crear mensajes");
            System.out.println("2. listar mensajes");
            System.out.println("3. eliminar mensaje");
            System.out.println("4. editar mensaje");
            System.out.println("5. salir");
            System.out.println("------------------------------");
            // leer la opcion seleccionada
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensaje();
                    break;
                case 3:
                    MensajesService.borrarMensaje();
                    break;
                case 4:
                    MensajesService.editarMensaje();
                    break;
                default:
                    break;
            }

        }while(opcion != 5);

    }
}