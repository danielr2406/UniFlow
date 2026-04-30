package uniflow.controller;

import dao.DictaDAO;
import dao.MateriaDAO;
import dto.MateriaVistaDTO;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import uniflow.model.Materia;

public class MateriaController {

    private MateriaDAO dao = new MateriaDAO();
    private DictaDAO dictaDAO = new DictaDAO();

    public String crearMateria(String nombre, int idDocente) {

    String codigo = CodigoGenerator.generar();

    Materia m = new Materia();
    m.setNombre(nombre);
    m.setCodigo(codigo);

    // 🔥 VERIFICAR INSERT REAL
    boolean ok = dao.registrar(m);

    if (!ok) {
        System.out.println("❌ No se insertó materia en BD");
        return null;
    }

    int idMateria = dao.obtenerIdPorCodigo(codigo);

    if (idMateria <= 0) {
        System.out.println("❌ No se pudo obtener idMateria");
        return null;
    }

    dictaDAO.insertar(idDocente, idMateria);

    return codigo;

    }
    public void cargarMaterias(JTable tabla) {

    DefaultTableModel model = new DefaultTableModel();

    model.addColumn("Materia");
    model.addColumn("Código");
    model.addColumn("Docente");

    List<MateriaVistaDTO> lista = dao.listarMateriasConDocente();

    for (MateriaVistaDTO m : lista) {
        model.addRow(new Object[]{
            m.getNombreMateria(),
            m.getCodigo(),
            m.getNombreDocente()
        });
    }

    tabla.setModel(model);
}
}