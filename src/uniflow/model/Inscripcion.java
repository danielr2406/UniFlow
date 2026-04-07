
package uniflow.model;

/**
 *
 * @author user
 */
public class Inscripcion {
    // Atributos basados en tu diagrama
    private int id_dicta;
    private int id_docente; // FK
    private int idMateria;    // FK

    public Inscripcion() {
    }

    public Inscripcion(int id_dicta, int id_docente, int idMateria) {
        this.id_dicta = id_dicta;
        this.id_docente = id_docente;
        this.idMateria = idMateria;
    }

    public int getId_dicta() {
        return id_dicta;
    }

    public void setId_dicta(int id_dicta) {
        this.id_dicta = id_dicta;
    }

    public int getId_docente() {
        return id_docente;
    }

    public void setId_docente(int id_docente) {
        this.id_docente = id_docente;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }
   
}