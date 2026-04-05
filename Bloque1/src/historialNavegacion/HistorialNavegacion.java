package historialNavegacion;

public class HistorialNavegacion implements PilaTDAString {

    private static final int MAX = 100;
    private String[] datos;
    private int cantidad;

    @Override
    public void InicializarPila() {
        datos = new String[MAX];
        cantidad = 0;
    }

    @Override
    public void Apilar(String x) {
        if (cantidad < MAX) {
            datos[cantidad] = x; // guarda al final
            cantidad++;
        }
    }

    @Override
    public void Desapilar() {
        if (!PilaVacia()) {
            cantidad--;
        }
    }

    @Override
    public String Tope() {
        return datos[cantidad - 1];
    }

    @Override
    public boolean PilaVacia() {
        return cantidad == 0;
    }
}

