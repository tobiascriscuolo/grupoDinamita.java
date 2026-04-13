package distribucionTickets;

public interface ColaPrioridadTDA {
    void InicializarColaPrioridad();
    void AcolarPrioridad(String detalle, int prioridad);
    void Desacolar();
    boolean ColaVacia();
    String Primero();
    int Prioridad();
}