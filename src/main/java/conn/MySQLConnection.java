/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import conn.Conexion;
import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crist
 */
public class MySQLConnection {
    // Configura tus credenciales y detalles de conexión
    private Conexion conn;
    private static String strStatement = "";
    private String schemaName;
    private static Connection connection; 
    private static Statement statement;

    public void setSchema(String nombre) {
        this.schemaName = nombre;
    }

    public void setConnection(Conexion conn) {
        this.conn = conn;
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
            createSchemaSQL += "CREATE SCHEMA IF NOT EXISTS " + this.schemaName + " CHARACTER SET utf8";
            statement.executeUpdate(createSchemaSQL);
            
            System.out.println("Se creo correctamente el schema: " + this.schemaName);
        } catch (SQLException e) {
            System.err.println("Error al crear el schema: " + e.getMessage());
        }
    }
    
    // Metodo para crear una tabla
    public void createTable(String nombreTabla) {
        try {  
            this.strStatement = "CREATE TABLE IF NOT EXISTS" + nombreTabla;
            statement.executeUpdate(this.strStatement);
            System.out.println("Se creo correctamente la tabla");
        } catch (SQLException e) {
            System.err.print("Error al crear la tabla: " + e.getMessage());
        }
    }

    public String showTables(){
        String tableName = "";
        try {
            String showTableSQL = "SHOW TABLES";
            ResultSet resultSet = statement.executeQuery(showTableSQL);

            System.out.println("Las tablas encontradas, son las siguientes: ");
            while (resultSet.next()) {
                tableName = resultSet.getString(1); // El índice 1 representa la primera columna
                //System.out.println("Tabla: " + tableName);
            }
        } catch (SQLException e) {
            System.err.print("Error al listar los schema's: " + e.getMessage());
        }
        return tableName;
    }
    
    // Metodo para mostrar los esquemas disponibles
    public List<String> getSchemasName() {
        List<String> schemaNames = new ArrayList<>();
    public String showSchemas() {
        String schemaName = "";
        try {
            String createSchemaSQL = "SHOW SCHEMAS";
            ResultSet resultSet = statement.executeQuery(createSchemaSQL);

            System.out.println("Los Schema encontrados, son los siguientes: ");
            while (resultSet.next()) {
                String schemaName = resultSet.getString(1);
                schemaNames.add(schemaName);
                schemaName = resultSet.getString(1); // El índice 1 representa la primera columna
                //System.out.println("Tabla: " + tableName);
            }
        } catch (SQLException e) {
            System.err.print("Error al listar los schema's: " + e.getMessage());
        }
        return schemaNames;
    }
    
    public void createIndex(String tableName, String indexName, String columns) {
        try {
            String createIndexSQL = "CREATE INDEX " + indexName + " ON " + tableName + " (" + columns + ")";
            statement.executeUpdate(createIndexSQL);
            System.out.println("Se creó correctamente el índice: " + indexName + " en la tabla: " + tableName);
        } catch (SQLException e) {
            System.err.print("Error al crear el índice: " + e.getMessage());
        }
    }
    
    public boolean schemaExist(String name) {
        try {
            DatabaseMetaData dbmd = connection.getMetaData();
            ResultSet rs = dbmd.getSchemas();
            while (rs.next()) {
                String schemaName = rs.getString(1);
                if (schemaName.equals(name)) return true;
            }
        } catch (SQLException e) {
            System.err.print("Error al buscar el schema Seleccionado: " + e.getMessage());
        }
        return false;
    }
    
    public void createTable(String nombreTabla, List<String> atributos, List<String> llavesPrimarias, List<String> llavesForaneas) {
        try {
            StringBuilder createTableSQL = new StringBuilder("CREATE TABLE IF NOT EXISTS " + nombreTabla + " (");

            // Agregar atributos
            for (String atributo : atributos) {
                createTableSQL.append(atributo).append(", ");
            }

            // Agregar llaves primarias
            if (!llavesPrimarias.isEmpty()) {
                createTableSQL.append("PRIMARY KEY (");
                for (String primaryKey : llavesPrimarias) {
                    createTableSQL.append(primaryKey).append(", ");
                }
                createTableSQL.setLength(createTableSQL.length() - 2);
                createTableSQL.append("), ");
            }

            // Agregar llaves foraneas
            for (String foreignKey : llavesForaneas) {
                createTableSQL.append(foreignKey).append(", ");
            }

            // Eliminar la coma final
            createTableSQL.setLength(createTableSQL.length() - 2);

            createTableSQL.append(")");

            statement.executeUpdate(createTableSQL.toString());
            System.out.println("Se creó correctamente la tabla: " + nombreTabla);
        } catch (SQLException e) {
            System.err.print("Error al crear la tabla: " + e.getMessage());
        }
    }
    
    public List<String> listTablesInDatabase(String databaseName) {
        List<String> tableNames = new ArrayList<>();

        try {
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet resultSet = metaData.getTables(databaseName, null, null, new String[]{"TABLE"});
            
            while (resultSet.next()) {
                String tableName = resultSet.getString("TABLE_NAME");
                tableNames.add(tableName);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar las tablas: " + e.getMessage());
        }

        return tableNames;
        return schemaName;
    }
    
    // Método para establecer la conexión a la base de datos
    public void openConnection() throws SQLException {
        try {
            Connections conexiones = new Connections();
            if (connection == null || connection.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver"); // Carga el controlador JDBC
                connection = DriverManager.getConnection(conn.url, conn.user, conn.password);
                statement = connection.createStatement();
                System.out.println("Conexión exitosa a la base de datos MySQL.");
                conexiones.agregarConexion(conn);
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Error al cargar el controlador JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    // Método para cerrar la conexión
    public void closeConnection() throws SQLException {
        try {
            if (statement != null && !statement.isClosed()) connection.close();
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexión cerrada.");
            } 
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
