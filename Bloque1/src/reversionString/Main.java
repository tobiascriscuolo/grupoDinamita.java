package reversionString;

public class Main {





    public static void main(String[] args){
        //La logica de las pilas LIFO ya nos permite la reversion de manera facil, el ultimo que entra
        //es el primero que sale, podemos revertir un string apilando por completo el string, por cada char,
        //y luego desapilar
        ReversorString reversor= new ReversorString();
        reversor.InicializarPila();
        reversor.ingresarString("MUNDO");
        System.out.println("--------------------------");
        System.out.println(reversor.obtenerStringInvertido());


    }

}
