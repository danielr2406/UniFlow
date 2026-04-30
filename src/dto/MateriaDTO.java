package dto;

import uniflow.model.Materia;

public class MateriaDTO {

    private String nombre;
    private String codigo;

    public MateriaDTO(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public static MateriaDTO fromMateria(Materia m) {
        return new MateriaDTO(
            m.getNombre(),
            m.getCodigo()
        );
    }
}