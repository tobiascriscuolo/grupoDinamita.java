package FilaDelCajero;

public class Main {
    public static void main(String[] args) {
        ColaPrioridadTDA colaBanco = new ColaCajero();

        colaBanco.InicializarColaPrioridad();

        System.out.println("=== Fila del Cajero - Banco de la Esquina ===");
        System.out.println("Los clientes llegan al banco y se atienden según prioridad.\n");

        System.out.println("Prioridades:");
        System.out.println("  4 = Persona con discapacidad");
        System.out.println("  3 = Anciano");
        System.out.println("  2 = Embarazada");
        System.out.println("  1 = Cliente sin prioridad\n");

        // Simulamos clientes llegando al banco
        System.out.println("Llegada de clientes:");
        System.out.println("- Cliente 1: Juan (cliente sin prioridad)");
        colaBanco.AcolarPrioridad(1, 1);
        System.out.println("- Cliente 2: María (anciana)");
        colaBanco.AcolarPrioridad(2, 3);
        System.out.println("- Cliente 3: Pedro (cliente sin prioridad)");
        colaBanco.AcolarPrioridad(3, 1);
        System.out.println("- Cliente 4: Ana (persona con discapacidad)");
        colaBanco.AcolarPrioridad(4, 4);
        System.out.println("- Cliente 5: Luis (embarazada)");
        colaBanco.AcolarPrioridad(5, 2);

        System.out.println("\n=== Orden de atención (por prioridad) ===");
        int orden = 1;
        while (!colaBanco.ColaVacia()) {
            System.out.println(orden + "° en atender: Cliente " + colaBanco.Primero() + " (prioridad " + colaBanco.Prioridad() + ")");
            colaBanco.Desacolar();
            orden++;
        }

        System.out.println("\n¿Cola vacía?: " + colaBanco.ColaVacia());
        System.out.println("\nConclusión: Los clientes se atienden por prioridad, no por orden de llegada.");
    }
}
