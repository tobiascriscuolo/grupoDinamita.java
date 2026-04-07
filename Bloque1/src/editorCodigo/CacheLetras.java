package editorCodigo;

public class CacheLetras implements PilaTDAChar{
    private static final int MAX = 100;
    private char[] datos;
    private int cantidad; // variable auxiliar

    @Override
    public void InicializarPila(){
        datos=new char[MAX];
        cantidad=0;
    }
    @Override
    public void Apilar(char x) {
        if (cantidad < MAX) {
            for (int i = cantidad; i > 0; i--) {
                datos[i] = datos[i - 1]; // mueve a la derecha
            }
            datos[0] = x; // el tope siempre queda en 0
            cantidad++;
        }
    };
    @Override
    public void Desapilar() {
        if (!PilaVacia()) {
            for (int i = 0; i < cantidad - 1; i++) {
                datos[i] = datos[i + 1]; // corre a la izquierda
            }
            cantidad--;
        }
    }
    @Override
    public char Tope(){return datos[0];};
    @Override
    public boolean PilaVacia(){return cantidad==0;};

}
