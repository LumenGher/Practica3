public class App {
        public static void main(String[] args) {

            Musico musico = new Musico("Martin camera");

            Composicion c1 = new Composicion(
                    "Palomando",
                    3.5,
                    "Rock",
                    "01/01/2024",
                    "10/02/2024"
            );

            Interprete i1 = new Interprete("Mirian parra");

            c1.agregarInterprete(i1);

            musico.agregarComposicion(c1);

            SolicitudInterpretacion s1 = new SolicitudInterpretacion(
                    i1,
                    "01/03/2024",
                    "05/03/2024",
                    "migajerITOs"
            );

            musico.mostrarComposiciones();

            System.out.println("Interpretes de la composicion:");
            c1.mostrarInterpretes();

            System.out.println();
            System.out.println(s1);
        }
    }
