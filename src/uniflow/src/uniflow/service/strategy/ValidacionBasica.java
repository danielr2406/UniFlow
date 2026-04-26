package uniflow.service.strategy;

import uniflow.model.Usuario;
import uniflow.model.Usuario_dao;

/**
 * PATRÓN STRATEGY - Validación básica usando DAO
 */
public class ValidacionBasica implements ValidacionStrategy {

    @Override
    public boolean validar(String correo, String password) {

        Usuario_dao dao = new Usuario_dao();
        Usuario u = dao.login(correo, password);

        // Si encuentra usuario → válido
        return u != null;
    }
}