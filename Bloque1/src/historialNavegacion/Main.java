package historialNavegacion;

public class Main {

    public static void probarHistorialNavegacion(){
        PilaTDAString historialNavegacion= new HistorialNavegacion();
        historialNavegacion.InicializarPila();
        historialNavegacion.Apilar("fi.uba.ar");
        historialNavegacion.Apilar("campus.utn.edu.ar");
        historialNavegacion.Apilar("stackoverflow.com");
        for (int i=0;i<3;i++){
            System.out.println("-----Desapilamos-----");
            System.out.println(historialNavegacion.Tope());
            historialNavegacion.Desapilar();
        }
    }
    public static void main(String[] args){
        //Apilamos las url de las paginas que se visitaron, cada vez que desapilamos lo que hacemos es recuperar una url
        probarHistorialNavegacion();
    };


}
