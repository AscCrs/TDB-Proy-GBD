/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itver.gbd;

import conn.Conexion;
import conn.Connections;
import conn.MySQLConnection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class GBD_TEST {
    public static Connections connect = new Connections();
    public static void listadoConexiones() {
        ArrayList<String> nombresCon;
        nombresCon = connect.getNombresConexiones();
        System.out.println("---- Listado de las conexiones: ----");
        for (String nombre : nombresCon) {
            System.out.println(nombre);
        }
    }

    public static void opciones() {
        System.out.println(
                "Opciones:\n1.Listar conexiones\n2.Agregar nueva conexion\n3.Conectarse a una configuracion existente"
        );
    }
    
    public static void main(String[] args) {
        boolean bool = true;
        int opc = 0;
        String schemaN, ip, port, connexion;
        MySQLConnection connSQL = new MySQLConnection();
        Conexion conn = new Conexion();
        Scanner sc = new Scanner(System.in);
        
        while(bool) {
            opciones();
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    listadoConexiones();
                    break;
                case 2:
                    System.out.println("ip: ");
                    ip = sc.nextLine();
                    System.out.println("puerto: ");
                    port = sc.nextLine();
                    conn.setURL("mysql", ip, port);
                    bool = false;
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("nombre de la conexion: ");
                    connexion = sc.nextLine();
                    conn = connect.buscarConexion(connexion);
                    bool = false;
                    break;
                default:
                    break;
            }
        }

        try {
            connSQL.setConnection(conn);
            connSQL.openConnection();
            List<String> schemaNames = connSQL.getSchemasName();
            for (String schemaName : schemaNames) {
                System.out.println("Schema: " + schemaName);
            }
            
            System.out.println("---- Listado de las tablas de una db ----");
            System.out.println("Nombre de la base de datos: ");
            String dbname = sc.next();
            List<String> tables= connSQL.listTablesInDatabase(dbname);
            for (String table: tables) {
                System.out.println("tabla: "+ table);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connSQL.closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        sc.close();
    }
}
