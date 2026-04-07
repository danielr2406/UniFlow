
package uniflow.model;


public class Materia {
    private int id_materia;
    private String Nombre;
    private String Codigo;

    public Materia() {
    }

        public Materia(int id_materia, String Nombre, String Codigo) {
            this.id_materia = id_materia;
            this.Nombre = Nombre;
            this.Codigo = Codigo;
        }

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    
    
}
