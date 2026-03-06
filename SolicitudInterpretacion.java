public class SolicitudInterpretacion {

        private Interprete interprete;
        private String fechaSolicitud;
        private String fechaAutorizacion;
        private String compania;

        public SolicitudInterpretacion(Interprete interprete,
                                       String fechaSolicitud,
                                       String fechaAutorizacion,
                                       String compania) {

            this.interprete = interprete;
            this.fechaSolicitud = fechaSolicitud;
            this.fechaAutorizacion = fechaAutorizacion;
            this.compania = compania;
        }

        @Override
        public String toString() {
            return "Solicitud de Interpretacion" +
                    "\nInterprete: " + interprete.getNombre() +
                    "\nFecha Solicitud: " + fechaSolicitud +
                    "\nFecha Autorizacion: " + fechaAutorizacion +
                    "\nCompañia: " + compania;
        }
    }

