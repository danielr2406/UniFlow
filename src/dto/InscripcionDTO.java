package dto;

import uniflow.model.Inscripcion;

public class InscripcionDTO {

    private int idMateria;
    private String semestre;

    public InscripcionDTO(int idMateria, String semestre) {
        this.idMateria = idMateria;
        this.semestre = semestre;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public String getSemestre() {
        return semestre;
    }

    public static InscripcionDTO fromInscripcion(Inscripcion i) {
        return new InscripcionDTO(
            i.getIdMateria(),
            i.getSemestre()
        );
    }
}