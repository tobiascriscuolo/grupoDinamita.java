package embarqueAerolineas;
import java.util.*;


public class GestorEmbarque {
    ColaPrioridadTDA cola;

    public GestorEmbarque(){
        this.cola= new ColaPrioridadEstatica();
        cola.InicializarColaPrioridad();
    }
    public void cargarPasajero(int idPasajero,int prioridad){
        cola.AcolarPrioridad(idPasajero,prioridad);
    }
    public String obtenerDatosPrimero(){
        return ("Id pasajero: "+cola.Primero()+"| Prioridad "+cola.Prioridad());
    }
    public void desacolar(){
        cola.Desacolar();
    }
    public int obtenerLongitudCola(){
        return cola.obtenerLongitudCola();
    }



}
