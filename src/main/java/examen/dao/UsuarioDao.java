package examen.dao;

import java.util.List;
import examen.model.Usuario;

public interface UsuarioDao {
    int create (Usuario user);
    int update (Usuario user);
    int delete (int id);
    Usuario read (int id);
    List<Usuario> readAll();
}
