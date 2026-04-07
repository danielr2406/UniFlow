/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uniflow.model;

/**
 *
 * @author user
 */
public class Dicta {
    // Atributos
    private int idNota;
    private double valor;
    private int idEstudiante; // FK
    private int idTaller;     // FK

    public Dicta() {
    }

    public Dicta(int idNota, double valor, int idEstudiante, int idTaller) {
        this.idNota = idNota;
        this.valor = valor;
        this.idEstudiante = idEstudiante;
        this.idTaller = idTaller;
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdTaller() {
        return idTaller;
    }

    public void setIdTaller(int idTaller) {
        this.idTaller = idTaller;
    }
    
}
