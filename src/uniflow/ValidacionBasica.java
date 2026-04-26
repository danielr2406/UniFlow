package uniflow.service.strategy;

import uniflow.model.Usuario;
import uniflow.model.Usuario_dao;

/**
 * PATRÓN STRATEGY - Solo permite ADMIN
 */
public class ValidacionAdmin implements ValidacionStrategy {

    @Override
    public boolean validar(String correo, String password) {

        Usuario_dao dao = new Usuario_dao();
        Usuario u = dao.login(correo, password);

        if (u != null && u.getRol().equalsIgnoreCase("ADMIN")) {
            return true;
        }

        return false;
    }
}