package editorCodigo;

public class Main {
    public static void probarCacheLetras(){

        CacheLetras cacheCodigo= new CacheLetras();

        cacheCodigo.InicializarPila();
        cacheCodigo.Apilar('2');
        cacheCodigo.Apilar(' ');
        cacheCodigo.Apilar('A');
        cacheCodigo.Apilar('R');
        cacheCodigo.Apilar('G');
        cacheCodigo.Apilar('O');
        cacheCodigo.Apilar('R');
        cacheCodigo.Apilar('P');

        System.out.println("De la pila solo vamos a desapilar cuando toquemos deshacer-----");

        while (!cacheCodigo.PilaVacia()){
            System.out.println(cacheCodigo.Tope());
            cacheCodigo.Desapilar();
        };
    };
    public static void main(String[] args){
        //Vamos a apilar solo los char que ingrese el usuario, solo tendremos una pila de elementos char
        //se puede añadir otra pila donde se van a apilar elemetos String que se van a extraer de la pila char cuando
        //se detecte la aparicion de " " consecutivos pero la logica es la misma
        probarCacheLetras();
    };


}
