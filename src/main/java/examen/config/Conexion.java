package examen.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String URL = "jdbc:postgresql://ec2-3-228-235-79.compute-1.amazonaws.com/de9buvfhtbndn9";
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String PASS = "dc23b73d9da886fdf64f033f42fcda160bf8a5dfa901c06367df1f3607fdf070";
    private static final String USER = "zrzwyvafeufear";
    private static Connection cx = null;

    public static Connection getConexion() {
        try {
            Class.forName(DRIVER);
            if (cx == null) {
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error:" + e);
        }
        return cx;
    }
}
