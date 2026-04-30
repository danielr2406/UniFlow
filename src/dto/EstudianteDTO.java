package dto;

import uniflow.model.Estudiante;

public class EstudianteDTO {

    private int idUsuario;
    private String carrera;

    public EstudianteDTO(int idUsuario, String carrera) {
        this.idUsuario = idUsuario;
        this.carrera = carrera;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getCarrera() {
        return carrera;
    }

    public static EstudianteDTO fromEstudiante(Estudiante e) {
        return new EstudianteDTO(
            e.getIdUsuario(),
            e.getCarrera()
        );
    }
}