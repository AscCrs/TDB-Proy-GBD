package conn;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author crist
 */

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Connections {
    private ArrayList<Conexion> conexiones = new ArrayList<>();
    public static final String fileName = "connections.json";

    public Connections() {
        // Cargar las conexiones desde el archivo JSON al inicializar
        crearJson();
        cargarConexionesDesdeArchivo();
    }
    
    public void crearJson() {
        File file = new File(fileName);
        
        if (file.exists()) {
            System.out.println("El archivo JSON ya existe.");
        } else {
            // Crear el archivo JSON y escribir datos de ejemplo
            try (FileWriter writer = new FileWriter(fileName)) {
                // Aquí puedes escribir datos de ejemplo si lo deseas
                writer.write("{}");
                System.out.println("Archivo JSON creado.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void agregarConexion(Conexion conexion) {
        conexiones.add(conexion);
        guardarConexionesEnArchivo();
    }

    public void guardarConexionesEnArchivo() {
        try (Writer writer = new FileWriter(fileName)) {
            Gson gson = new Gson();
            Map<String, Conexion> map = new HashMap<>();
            int i = 1;
            for (Conexion conexion : conexiones) {
                map.put("Conexion" + i, conexion);
                i++;
            }
            gson.toJson(map, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargarConexionesDesdeArchivo() {
        try (Reader reader = new FileReader(fileName)) {
            Gson gson = new Gson();
            TypeToken<Map<String, Conexion>> typeToken = new TypeToken<Map<String, Conexion>>() {
            };
            Map<String, Conexion> map = gson.fromJson(reader, typeToken.getType());
            if (map != null) {
                for (Conexion conexion : map.values()) {
                    conexiones.add(conexion);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Conexion> getConexiones() {
        return conexiones;
    }
    
    public ArrayList<String> getNombresConexiones() {
        ArrayList<String> nombres = new ArrayList<>();
        for (Conexion conexion : conexiones) {
            nombres.add(conexion.nombreCon);
        }
        return nombres;
    }

    public Conexion buscarConexion(String nombre) {
        for (Conexion conexion : this.conexiones) {
            if (conexion.nombreCon.equals(nombre)) {
                return conexion;
            }
        }
        return null;
    }
    
    public void eliminarConexion(String nombre) {
        Conexion conexionAEliminar = null;
        for (Conexion conexion : conexiones) {
            if (conexion.nombreCon.equals(nombre)) {
                conexionAEliminar = conexion;
                break;
            }
        }
        if (conexionAEliminar != null) {
            conexiones.remove(conexionAEliminar);
            guardarConexionesEnArchivo();
        }
    }
    
    public void editarConexion(String nombre, String nuevaURL) {
        for (Conexion conexion : conexiones) {
            if (conexion.nombreCon.equals(nombre)) {
                // Analizar la nueva URL para obtener la IP y el puerto
                String[] partesURL = nuevaURL.split("//|:");
                if (partesURL.length >= 4) {
                    conexion.tipo = partesURL[1];
                    conexion.ip = partesURL[2];
                    conexion.port = partesURL[3];
                    conexion.url = nuevaURL;
                    guardarConexionesEnArchivo();
                    break;
                }
            }
        }
    }

}
