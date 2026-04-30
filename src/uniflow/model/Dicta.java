

package uniflow.model;


public class Dicta {

    private int idDocente;
    private int idMateria;

    public Dicta() {
    }

    public Dicta(int idDocente, int idMateria) {
        this.idDocente = idDocente;
        this.idMateria = idMateria;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }
}
