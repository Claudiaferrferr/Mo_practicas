public class Main {
    public static void main(String[] args){
        System.out.println("Proyecto metodos");
        System.out.println("Vamos a realizar llamadas a metodos");
        saludar("Borja");
        despedir();
        saludar( "Laura");
        System.out.println(calculadora.multiplicar);

        //Operaciones
        Calculadora operacionesMatematicas = new Calculadora();
        operacionesMatematicas.sumar(1,4);
        operacionesMatematicas.restar(8,2); 

    }
    public static void saludar(String nombre){
        System.out.println("Hola "+ nombre);
        System.out.println("Encantada de saludarte vamos a practicar");
        System.out.println("Encantada de saludarte vamos a practicar");
        System.out.println("Vamos, no decaigas en tu tarea");

    }
    public static void despedir(){
        System.out.println("A tu casa a ver pocoyo");
    }
}
