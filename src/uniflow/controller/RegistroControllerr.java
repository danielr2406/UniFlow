
package uniflow.controller;

import uniflow.model.Estudiante;
import uniflow.model.Estudiante_dao;
import uniflow.model.Usuario;
import uniflow.model.Usuario_dao;


public class RegistroControllerr {
    
     public boolean registrarUsuario(String nombre, String correo, String password, String rol, String carrera) {

        Usuario u = new Usuario();
        u.setNombre(nombre);
        u.setCorreo(correo);
        u.setPassword(password);
        u.setRol(rol);

        Usuario_dao dao = new Usuario_dao();
        int idGenerado = dao.registrar(u);

        if (idGenerado > 0) {

            if (rol.equalsIgnoreCase("Estudiante")) {

                Estudiante e = new Estudiante();
                e.setIdUsuario(idGenerado);
                e.setCarrera(carrera);

                Estudiante_dao edao = new Estudiante_dao();
                edao.registrar(e);
            }

            return true;
        }

        return false;
    }

    
}
