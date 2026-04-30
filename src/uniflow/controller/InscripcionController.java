package uniflow.controller;

import dao.InscripcionDAO;
import uniflow.model.Inscripcion;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class InscripcionController {

    private InscripcionDAO dao = new InscripcionDAO();

    // ✅ INSCRIBIR
    public boolean inscribir(int idEstudiante, int idMateria, String semestre) {

        Inscripcion i = new Inscripcion();
        i.setIdEstudiante(idEstudiante);
        i.setIdMateria(idMateria);
        i.setSemestre(semestre);

        return dao.registrar(i);
    }

    // ✅ CARGAR MIS CURSOS (ESTUDIANTE)
    public void cargarMisCursos(JTable tabla, int idEstudiante) {
    InscripcionDAO dao = new InscripcionDAO();
    List<Object[]> lista = dao.listarPorEstudiante(idEstudiante);

    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
    modelo.setRowCount(0); // limpiar tabla

    for (Object[] fila : lista) {
        modelo.addRow(fila);
    }
}

    // ✅ CARGAR MATERIAS DEL DOCENTE CON CANTIDAD
    public void cargarMateriasDocente(JTable tabla, int idDocente) {

        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Materia");
        model.addColumn("Código");
        model.addColumn("Estudiantes");

        List<Object[]> lista = dao.contarEstudiantesPorMateria(idDocente);

        for (Object[] fila : lista) {
            model.addRow(fila);
        }

        tabla.setModel(model);
    }
}