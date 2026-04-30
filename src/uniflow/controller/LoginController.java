
package uniflow.controller;

import uniflow.model.Usuario;

import dao.UsuarioDAO;


public class LoginController {

    private UsuarioDAO dao = new UsuarioDAO();

    public Usuario login(String correo, String password) {
        return dao.login(correo, password);
    }
}

