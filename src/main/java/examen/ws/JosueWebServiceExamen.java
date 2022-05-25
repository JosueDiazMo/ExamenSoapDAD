package examen.ws;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import examen.dao.UsuarioDao;
import examen.daoImpl.UsuarioDaoImpl;
import examen.model.Usuario;

@WebService(serviceName = "JosueWebServiceExamen")
public class JosueWebServiceExamen {

    private UsuarioDao user = new UsuarioDaoImpl();

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "insertar")
    public int insertar(@WebParam(name = "username") String username, 
            @WebParam(name = "password") String password, 
            @WebParam(name = "idpersona") int idpersona, 
            @WebParam(name = "idrol") int idrol, 
            @WebParam(name = "fechacreacion") String fechacreacion, 
            @WebParam(name = "estado") boolean estado) {
        //TODO write your implementation code here:
        return user.create(new Usuario(0, username, password, idpersona, idrol, null, true));
    }

    @WebMethod(operationName = "editar")
    public int editar(@WebParam(name = "idusuario") int idusuario, 
            @WebParam(name = "username") String username, 
            @WebParam(name = "password") String password, 
            @WebParam(name = "idpersona") int idpersona, 
            @WebParam(name = "idrol") int idrol) {
        //TODO write your implementation code here:
        return user.update(new Usuario(idusuario, username, password, idpersona, idrol, null, true));
    }

    @WebMethod(operationName = "eliminar")
    public int eliminar(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return user.delete(id);
    }

    @WebMethod(operationName = "read")
    public Usuario read(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return user.read(id);
    }

    @WebMethod(operationName = "readAll")
    public List<Usuario> readAll() {
        //TODO write your implementation code here:
        return user.readAll();
    }
}
