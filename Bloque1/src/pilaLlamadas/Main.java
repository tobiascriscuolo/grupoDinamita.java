package pilaLlamadas;

public class Main {

    public static void probarPilaFunciones(){
        PilaFunciones pila= new PilaFunciones();
        pila.InicializarPila();
        pila.Apilar("main()");
        pila.Apilar("calcularPromedio()");
        pila.Apilar("sumar()");

        System.out.println("Funciones en la pila");
        while (!pila.PilaVacia()){
            System.out.println("---------------------------------------");
            System.out.println(pila.Tope());
            pila.Desapilar();
        }

    };


    //una funcion padre no puede terminar hasta que sus hijas terminen, entonces si tenemos una funcion main, que llama
    // a x() y luego a y(), nuestra pila de funciones seria, en el enunciado la funcion Suma() seria el tope
    //PilaFunciones= [main(),x(),y()]
    public static void main(String[] args){
        probarPilaFunciones();
    }




}
