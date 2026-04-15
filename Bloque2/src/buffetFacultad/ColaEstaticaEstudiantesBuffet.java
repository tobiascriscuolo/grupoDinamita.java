package buffetFacultad;

import buffetFacultad.ColaTDA;
import java.util.ArrayList;

public class ColaEstaticaEstudiantesBuffet implements ColaTDA {

    private static final int MAX = 100;
    private ArrayList<String> datos;

    @Override
    public void InicializarCola() {
        datos = new ArrayList<>();
    }

    @Override
    public void Acolar(String x) {
        if (datos.size() < MAX) {
            System.out.println("Se acolo a " + x);
            datos.add(x);
        }
    }

    @Override
    public void Desacolar() {
        if (!ColaVacia()) {
                System.out.println("Se desacolo a " + datos.get(0));
            datos.remove(0);
        }
    }

    @Override
    public String Primero() {
        return datos.get(0);
    }

    @Override
    public boolean ColaVacia() {
        return datos.size() == 0;
    }
}
