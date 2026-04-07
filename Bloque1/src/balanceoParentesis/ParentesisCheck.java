package balanceoParentesis;

public class ParentesisCheck implements PilaTDAChar{
    private static final int MAX = 100;
    private char[] datos;
    private int cantidad; // variable auxiliar: cantidad de elementos

    @Override
    public void InicializarPila() {
        datos = new char[MAX];
        cantidad = 0;
    }

    @Override
    public void Apilar(char x) {
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
    public char Tope() {
        return datos[cantidad - 1];
    }

    @Override
    public boolean PilaVacia() {
        return cantidad == 0;
    }
}