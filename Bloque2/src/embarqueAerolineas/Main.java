package embarqueAerolineas;

public class Main {
    public static void main(String[] args){
        //En caso de que la prioridad sea la misma, entonces se tiene en cuenta el tiempo de ingreso, FIFO
        GestorEmbarque x= new GestorEmbarque();
        //Ingreso de pasajeros con prioridad al azar
        x.cargarPasajero(14,2);
        x.cargarPasajero(15,1);
        x.cargarPasajero(12,3);
        x.cargarPasajero(13,2);
        x.cargarPasajero(11,1);
        x.cargarPasajero(10,3);

        System.out.println("Id--|--prioridad");

        int aux=x.obtenerLongitudCola();
        //Obtenemos la cola ordenada de la prioridad mas alta a la mas baja
        for (int i=0;i<aux;i++){
            System.out.println(x.obtenerDatosPrimero());
            x.desacolar();
        }
    }
}
