package ImpresoraLaboratorio;

public class Main {
    public static void main(String[] args) {
        ColaTDA colaImpresion = new ColaImpresora();

        colaImpresion.InicializarCola();

        System.out.println("=== Impresora del Laboratorio ===");
        System.out.println("Todos mandan el TP al mismo tiempo para que no cierre la entrega.\n");

        // Simulamos 5 archivos llegando a la impresora
        System.out.println("Llegada de archivos:");
        System.out.println("- Archivo 1 (TP de Juan)");
        colaImpresion.Acolar(1);
        System.out.println("- Archivo 2 (TP de María)");
        colaImpresion.Acolar(2);
        System.out.println("- Archivo 3 (TP de Pedro)");
        colaImpresion.Acolar(3);
        System.out.println("- Archivo 4 (TP de Ana)");
        colaImpresion.Acolar(4);
        System.out.println("- Archivo 5 (TP de Luis)");
        colaImpresion.Acolar(5);

        System.out.println("\n=== Orden de impresión (FIFO) ===");
        int orden = 1;
        while (!colaImpresion.ColaVacia()) {
            System.out.println(orden + "° en imprimir: Archivo " + colaImpresion.Primero());
            colaImpresion.Desacolar();
            orden++;
        }

        System.out.println("\n¿Cola vacía?: " + colaImpresion.ColaVacia());
        System.out.println("\nConclusión: Los archivos se imprimen en el mismo orden que llegaron (FIFO).");
    }
}
