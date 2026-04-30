package dto;

import uniflow.model.Docente;

public class DocenteDTO {

    private int idUsuario;

    public DocenteDTO(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public static DocenteDTO fromDocente(Docente d) {
        return new DocenteDTO(d.getIdUsuario());
    }
}