package balanceoParentesis;

public class Main {

    public static void probarParentesisCheck(int cantidadParentesis){
        PilaTDAChar parentesisChk= new ParentesisCheck();
        parentesisChk.InicializarPila();
        //Abertura de parentesis

        for (int i=0;i<cantidadParentesis;i++){
            parentesisChk.Apilar('(');
        };

        int n=0;
        while (!parentesisChk.PilaVacia()){
            n=n+1;
            //nos va a permitir cerrar parentesis solo si hay elementos en la pila de parentesis de abertura
            parentesisChk.Desapilar();
        }
        System.out.println("Se finalizaron " + n +" parentesis");
    }

    public static void main(String[] args){
        //"Apilar" ocurre cuando se abre un parentesis
        //"Desapilar" ocurre cuando se cierra un parentesis, se debe verificar que la pila con parentesis abiertos no
        //este vacia
        probarParentesisCheck(5);
    }


}
