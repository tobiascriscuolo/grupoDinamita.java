package buffetFacultad;

public interface ColaTDA {
    void InicializarCola();
    void Acolar(String x);
    void Desacolar();
    String Primero();
    boolean ColaVacia();
}