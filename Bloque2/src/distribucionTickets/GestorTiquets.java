package distribucionTickets;

public class GestorTiquets {
    ColaPrioridadTDA cola;

    public GestorTiquets(){
        cola= new ColaPrioridadEstatica();
        cola.InicializarColaPrioridad();
    }
    public void cargarTicket(String asunto,int pri){
        cola.AcolarPrioridad(asunto,pri);
    };
    public void obtenerPrimerTicket(){
        System.out.println("Asunto: "+ cola.Primero()+" | "+" Prioridad: "+ cola.Prioridad());
    };
    public void atenderTicket(){
        cola.Desacolar();
    }
    //La prioridad va desde 999 hasta 0 donde 999 es el nivel maximo de prioridad


}
