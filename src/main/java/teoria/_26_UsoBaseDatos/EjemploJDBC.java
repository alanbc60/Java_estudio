package teoria._26_UsoBaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EjemploJDBC {


    public static void main(String[] args) {
        Connection connection = ConectarBD();
        Consulta(connection);
        CerrarBD(connection);
    }


    public static void Consulta(Connection conn) {
        
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            String sql = "SELECT * FROM alquileres";
            System.out.println("Consulta"); 
            stmt = conn.createStatement(); // se debe de crear el statement para ejecutar la consulta
            rs = stmt.executeQuery(sql); // se debe de ejecutar la consulta
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public static Connection ConectarBD() {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/rentingsdb2";
        String root = "root";
        String rootPass = "";

        try{
            conn = DriverManager.getConnection(url, root, rootPass);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return conn;
    }


    public static void CerrarBD(Connection conn) {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    
}
