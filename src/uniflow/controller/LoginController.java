
package uniflow.controller;

import uniflow.model.Usuario;
import uniflow.model.Usuario_dao;


public class LoginController {
    
    public Usuario login(String correo, String password) {
        Usuario_dao dao = new Usuario_dao();
        return dao.login(correo, password);
    }
}

