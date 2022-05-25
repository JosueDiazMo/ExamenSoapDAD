package examen.test;

import com.google.gson.Gson;
import examen.config.Conexion;
import examen.dao.UsuarioDao;
import examen.daoImpl.UsuarioDaoImpl;

public class Test {
    static Gson gson = new Gson();
    
    static UsuarioDao udao = new UsuarioDaoImpl();
    
        public static void main(String[] args) {
        if (Conexion.getConexion() != null) {
            System.out.println("Conectado");
        } else {
            System.out.println("No conectado");
        }
            
            System.out.println(gson.toJson(udao.readAll()));
    }
}
