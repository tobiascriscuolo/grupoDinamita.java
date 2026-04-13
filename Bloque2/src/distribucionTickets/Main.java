package distribucionTickets;

public class Main {
    public static void main(String[] args){
        GestorTiquets gestor= new GestorTiquets();
        gestor.cargarTicket("x",1);
        gestor.cargarTicket("No me gusta fondo de pantalla",0);
        gestor.cargarTicket("Servidor roto",999);
        //comprobamos que servidor roto se posiciono como primero
        gestor.obtenerPrimerTicket();
        gestor.atenderTicket();
        //comprobamos la extraccion de un ticket
        gestor.obtenerPrimerTicket();
    }
}
