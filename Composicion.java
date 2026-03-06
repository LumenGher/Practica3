public class Composicion {

        private String titulo;
        private double duracion;
        private String genero;
        private String fechaRegistro;
        private String fechaEstreno;

        private Interprete[] interpretes;
        private int contadorInterpretes;

        public Composicion(String titulo, double duracion, String genero,
                           String fechaRegistro, String fechaEstreno) {

            this.titulo = titulo;
            this.duracion = duracion;
            this.genero = genero;
            this.fechaRegistro = fechaRegistro;
            this.fechaEstreno = fechaEstreno;

            interpretes = new Interprete[10];
            contadorInterpretes = 0;
        }

        public void agregarInterprete(Interprete i) {
            if (contadorInterpretes < interpretes.length) {
                interpretes[contadorInterpretes] = i;
                contadorInterpretes++;
            }
        }

        public void mostrarInterpretes() {
            for (int i = 0; i < contadorInterpretes; i++) {
                System.out.println(interpretes[i]);
            }
        }

        public String getTitulo() {
            return titulo;
        }

        @Override
        public String toString() {
            return "Titulo: " + titulo +
                    "\nDuracion: " + duracion +
                    "\nGenero: " + genero +
                    "\nFecha Registro: " + fechaRegistro +
                    "\nFecha Estreno: " + fechaEstreno;
        }
    }

