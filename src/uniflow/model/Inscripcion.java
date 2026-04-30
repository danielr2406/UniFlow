
package uniflow.model;

public class Inscripcion {

    private int idInscripcion;
    private int idEstudiante;
    private int idMateria;
    private String semestre;

    public Inscripcion() {}

    public Inscripcion(int idEstudiante, int idMateria, String semestre) {
        this.idEstudiante = idEstudiante;
        this.idMateria = idMateria;
        this.semestre = semestre;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}