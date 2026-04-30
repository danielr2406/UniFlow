
package service.strategy;
import uniflow.model.Usuario;
import dao.UsuarioDAO;

/**
 * PATRÓN STRATEGY - Validación básica usando DAO
 */
public class ValidacionBasica implements ValidacionStrategy {

    @Override
    public boolean validar(String correo, String password) {

        UsuarioDAO dao = new UsuarioDAO();
        Usuario u = dao.login(correo, password);

        // Si encuentra usuario → válido
        return u != null;
    }
}