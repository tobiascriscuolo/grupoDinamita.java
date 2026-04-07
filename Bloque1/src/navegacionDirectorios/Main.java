package navegacionDirectorios;

public class Main {
    //usamos la pila para guardar el string de la carpeta, asi podemos guardar niveles
    //si queremo subir solo debemos usar tope y luego desapilar
    public static void probarPilaDirectorios() {
        PilaTDAString pilaDirectorios = new NavegadorDirectorios();
        pilaDirectorios.InicializarPila();
        pilaDirectorios.Apilar("C:/");
        pilaDirectorios.Apilar("Usuarios");
        pilaDirectorios.Apilar("Documentos");

        while (!pilaDirectorios.PilaVacia()){
            System.out.println(pilaDirectorios.Tope());
            System.out.println("---------------------");
            pilaDirectorios.Desapilar();
        }
    }
    public static void main(String[] args){
        //en la pila vamos a almacenar nombres de ficheros o directorios y cada vez que queramos subir de nivel,
        //desapilamos
        probarPilaDirectorios();
    }

}
