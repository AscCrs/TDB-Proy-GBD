/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conn;

/**
 *
 * @author crist
 */
public class Conexion {
    public String nombreCon = "";
    public String tipo = "mysql", ip = "127.0.0.1", port = "3306", url;
    public String user = "root";
    public String password = "useradmin";

    public Conexion() {

    }
    
    public void setNombreCon(String nombre) {
        this.nombreCon = nombre;
    }

    public void setURL(String tipo, String ip, String port) {
        this.tipo = tipo;
        this.ip = ip;
        this.port = port;
        this.url = "jdbc:" + this.tipo + "://" + this.ip + ":" + this.port + "/";
    }

    public void setURL() {
        this.url = "jdbc:" + this.tipo + "://" + this.ip + ":" + this.port + "/";
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
