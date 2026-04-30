    package dto;

    import uniflow.model.Dicta;

    public class DictaDTO {

        private int idDocente;
        private int idMateria;

        public DictaDTO(int idDocente, int idMateria) {
            this.idDocente = idDocente;
            this.idMateria = idMateria;
        }

        public int getIdDocente() {
            return idDocente;
        }

        public int getIdMateria() {
            return idMateria;
        }

        public static DictaDTO fromDicta(Dicta d) {
            return new DictaDTO(
                d.getIdDocente(),
                d.getIdMateria()
            );
        }
    }