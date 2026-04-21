package osScheduler;


public class Main {
    public static void main(String[] args) {

        ColaPrioridadOsScheduler colaProcesos = new ColaPrioridadOsScheduler();

        colaProcesos.InicializarColaPrioridad();

        colaProcesos.AcolarPrioridad("OS", 50);
        colaProcesos.AcolarPrioridad("Spotify", 10);
        colaProcesos.AcolarPrioridad("Instagram", 10);
        colaProcesos.AcolarPrioridad("Snapchat", 10);
        colaProcesos.AcolarPrioridad("Slack", 10);
        colaProcesos.AcolarPrioridad("Notion", 10);

//        Si se llega al limite de procesos en la cola los mismos no se agregan a la cola
    }
}
