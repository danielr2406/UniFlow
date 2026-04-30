package dto;

public class MateriaVistaDTO {

    private String codigo;
    private String nombreMateria;
    private String nombreDocente;

    public MateriaVistaDTO(String codigo, String nombreMateria, String nombreDocente) {
        this.codigo = codigo;
        this.nombreMateria = nombreMateria;
        this.nombreDocente = nombreDocente;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }
}