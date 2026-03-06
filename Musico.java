public class Musico {

        private String nombre;
        private Composicion[] composiciones;
        private int contadorComposiciones;

        public Musico(String nombre) {
            this.nombre = nombre;
            composiciones = new Composicion[10];
            contadorComposiciones = 0;
        }

        public void agregarComposicion(Composicion c) {
            if (contadorComposiciones < composiciones.length) {
                composiciones[contadorComposiciones] = c;
                contadorComposiciones++;
            }
        }

        public void mostrarComposiciones() {
            for (int i = 0; i < contadorComposiciones; i++) {
                System.out.println(composiciones[i]);
                System.out.println();
            }
        }
    }

