package dto;

import uniflow.model.Usuario;

public class UsuarioDTO {

    private String nombre;
    private String correo;
    private String rol;

    public UsuarioDTO(String nombre, String correo, String rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getRol() {
        return rol;
    }

    // Conversión desde entidad
    public static UsuarioDTO fromUsuario(Usuario u) {
        return new UsuarioDTO(
            u.getNombre(),
            u.getCorreo(),
            u.getRol()
        );
    }
}