
package service.strategy;


import uniflow.model.Usuario;
import dao.UsuarioDAO;

/**
 * PATRÓN STRATEGY - Solo permite ADMIN
 */
public class ValidacionAdmin implements ValidacionStrategy {

    @Override
    public boolean validar(String correo, String password) {

        UsuarioDAO dao = new UsuarioDAO();
        Usuario u = dao.login(correo, password);

        return u != null && u.getRol().equalsIgnoreCase("ADMIN");
    }
}