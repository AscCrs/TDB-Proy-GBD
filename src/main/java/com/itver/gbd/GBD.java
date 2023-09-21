/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.itver.gbd;
import conn.MySQLConnection;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class GBD {
    public static void main(String[] args) {
        String schemaN;
        MySQLConnection connSQL = new MySQLConnection();
        Scanner sc = new Scanner(System.in);
        try {
            connSQL.openConnection();
            System.out.print("Ingrese el nombre del schema: ");
            schemaN = sc.next();
            connSQL.setSchema(schemaN);
            connSQL.connectSchema();
            
            connSQL.showSchemas();
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
