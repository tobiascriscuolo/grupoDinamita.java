package buffetFacultad;


public class Main {
    public static void main(String[] args) {

        ColaEstaticaEstudiantesBuffet estudiantes = new ColaEstaticaEstudiantesBuffet();

        estudiantes.InicializarCola();

        estudiantes.Acolar("Ninja");
        estudiantes.Acolar("Vibe coder");

        estudiantes.Desacolar();
    }
}
