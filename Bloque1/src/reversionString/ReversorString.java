package reversionString;
import java.util.List;


public class ReversorString implements ReversorStringTDA{
    private static final int MAX = 100;
    private char[] datos;
    private int cantidad; // variable auxiliar: cantidad de elementos

    public void ingresarString(String x){
        for (char elemento:x.toCharArray()){
            Apilar(elemento);
        }
    }
    public String obtenerStringInvertido(){
        char[] string= new char[this.cantidad];
        int aux=0;
        while (!this.PilaVacia()){
            string[aux]=this.Tope();
            this.Desapilar();
            aux++;
        }
        return new String(string);
    };


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
