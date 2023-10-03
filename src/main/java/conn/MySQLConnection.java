/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conn;

import static java.lang.StringTemplate.STR;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author crist
 */
public class MySQLConnection {

    // Configura tus credenciales y detalles de conexión
    private static String ipConn = "";
    private static String portConn = "";
    private static String user = "";
    private static String password = "";

    private static final String URL = STR.
    "jdbc:mysql://\{ipConn}\{portConn}/";

    private String nombreSchema;

    private static Connection connection;

    private static String strStatement;
    private String schemaName;

    private static Statement statement;

    public void setIp(String ip) {
        this.ipConn = ip;
    }

    public void setPort(String port) {
        this.portConn = port;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSchema(String nombre) {
        this.schemaName = nombre;
    }

    public String getStatement() {
        return this.strStatement;
    }

    // Metodo que crea el esquema
    public void connectSchema() {
        try {
            String createSchemaSQL = "DROP " + this.schemaName;
            statement.executeUpdate(createSchemaSQL);
            createSchemaSQL += "CREATE SCHEMA IF NOT EXISTS " + this.schemaName;
            statement.executeUpdate(createSchemaSQL);

            System.out.println("Se creo correctamente el schema: " + this.nombreSchema);

            System.out.println("Se creo correctamente el schema: " + this.schemaName);
        } catch (SQLException e) {
            System.err.print("Error al crear el schema: " + e.getMessage());
        }
    }

    // Metodo para crear una tabla
    public void createTable(String nombreTabla) {
        try {
            this.strStatement = STR.
            "CREATE TABLE IF NOT EXIST \{nombreTabla}";
            statement.executeUpdate(this.strStatement);
            System.out.println("Se creo correctamente la tabla");
        } catch (SQLException e) {
            System.err.print("Error al crear la tabla: " + e.getMessage());
        }
    }

    // Metodo para mostrar los esquemas disponibles
    >>>>>>> main

    public void showSchemas() {
        try {
            String createSchemaSQL = "SHOW SCHEMAS";
            ResultSet resultSet = statement.executeQuery(createSchemaSQL);

            System.out.println("Los Schema encontrados, son los siguientes: ");
            while (resultSet.next()) {
                String tableName = resultSet.getString(1); // El índice 1 representa la primera columna
                System.out.println("Tabla: " + tableName);
            }
        } catch (SQLException e) {
            System.err.print("Error al listar los schema's: " + e.getMessage());
        }
    }

    // Método para establecer la conexión a la base de datos
    public void openConnection() throws SQLException {
        try {
            if (connection == null || connection.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver"); // Carga el controlador JDBC
                connection = DriverManager.getConnection(URL, user, password);
                statement = connection.createStatement();
                System.out.println("Conexión exitosa a la base de datos MySQL.");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Error al cargar el controlador JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    // Método para cerrar la conexión
    public void closeConnection() throws SQLException {
        try {
            if (statement != null && !statement.isClosed()) {
                connection.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
