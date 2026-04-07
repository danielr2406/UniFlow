
package uniflow.model;


public class Estudiante {
     private int idUsuario;
    private String Carrera;
   

    public Estudiante() {
    }

    public Estudiante(int idUsuario, String Carrera) {
        this.idUsuario = idUsuario;
        this.Carrera = Carrera;
    }

    

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

 

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
}
