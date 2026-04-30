
package uniflow.controller;

import dao.DocenteDAO;
import dao.UsuarioDAO;
import uniflow.model.Estudiante;

import dao.EstudianteDAO;
import uniflow.model.Usuario;
import dao.UsuarioDAO;


public class RegistroControllerr {
    
   public boolean registrarUsuario(String nombre, String correo, String password, String rol, String carrera) {

    Usuario u = new Usuario();
    u.setNombre(nombre);
    u.setCorreo(correo.trim());
    u.setPassword(password.trim());
    u.setRol(rol);

    UsuarioDAO dao = new UsuarioDAO();
    int idGenerado = dao.registrar(u);

    if (idGenerado > 0) {

        if (rol.equalsIgnoreCase("Estudiante")) {
            Estudiante e = new Estudiante();
            e.setIdUsuario(idGenerado);
            e.setCarrera(carrera);

            EstudianteDAO estudianteDAO = new EstudianteDAO();
            estudianteDAO.registrar(e);
        }

        if (rol.equalsIgnoreCase("Docente")) {
            DocenteDAO docenteDAO = new DocenteDAO();
            docenteDAO.registrar(idGenerado);
        }

        return true;
    }

    return false;
}
}