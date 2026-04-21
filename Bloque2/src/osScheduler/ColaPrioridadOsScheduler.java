package osScheduler;

import java.util.ArrayList;

public class ColaPrioridadOsScheduler implements ColaPrioridadTDA {

    private static final int MAX = 100;
    private ArrayList<String> datos;
    private int[] prioridades;
    private int cantidad;

    @Override
    public void InicializarColaPrioridad() {
        datos = new ArrayList<>();
        prioridades = new int[MAX];
        cantidad = 0;
    }



    @Override
    public void AcolarPrioridad(String proceso, int prioridad) {
        if (cantidad < MAX) {
            int i = cantidad - 1;

            // mueve a la derecha mientras la prioridad nueva sea mayor
            while (i >= 0 && prioridades[i] < prioridad) {
                i--;
            }
            datos.add(i + 1, proceso);
            datos.set(i + 1, proceso);
            prioridades[i + 1] = prioridad;
            cantidad++;
            System.out.println("Se acolo el proceso " + proceso + " con prioridad " + prioridad);
        }
    }

    @Override
    public void Desacolar() {
        if (!ColaVacia()) {
            for (int i = 0; i < cantidad - 1; i++) {
                datos.set(i, datos.get(i + 1));
                prioridades[i] = prioridades[i + 1];
            }
            cantidad--;
            System.out.println("Se desacolo el proceso " + datos.get(0) + " con prioridad " + prioridades[0]);
        }
    }

    @Override
    public boolean ColaVacia() {
        return cantidad == 0;
    }

    @Override
    public String Primero() {
        return datos.getFirst();
    }

    @Override
    public int Prioridad() {
        return prioridades[0];
    }
}
