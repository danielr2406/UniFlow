
package uniflow.model;

import java.util.Date;


public class Taller {
    // 1. Atributos (Variables de instancia)
    private int idTaller;
    private String nombre;
    private String descripcion;
    private String tipo;
    private Date fechaEntrega;
    private double porcentaje;
    private int id_materia;
    private int id_docente;

    public Taller(int idTaller, String nombre, String descripcion, String tipo, Date fechaEntrega, double porcentaje, int id_materia, int id_docente) {
        this.idTaller = idTaller;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.fechaEntrega = fechaEntrega;
        this.porcentaje = porcentaje;
        this.id_materia = id_materia;
        this.id_docente = id_docente;
    }

    public int getIdTaller() {
        return idTaller;
    }

    public void setIdTaller(int idTaller) {
        this.idTaller = idTaller;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public int getId_docente() {
        return id_docente;
    }

    public void setId_docente(int id_docente) {
        this.id_docente = id_docente;
    }
    
}
    