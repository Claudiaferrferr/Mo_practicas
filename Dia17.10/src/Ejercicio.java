import java.util.Scanner;

public class Ejercicio {
    private Scanner lecturaTeclado;


    public void ejercicio1(){
        lecturaTeclado = new Scanner(System.in);
        // 1. Introducir valores
        //2. guardar en variables
        System.out.println("Cuantos bocatas");
        int bocatas = lecturaTeclado.nextInt();
        System.out.println("Cuantos bebidas");
        int bebidas = lecturaTeclado.nextInt();
        System.out.println("Cuantos cuesta cada bocata");
        double precioBocata = lecturaTeclado.nextDouble();
        System.out.println("Cuantos cuesta cada bebida");
        double precioBebida = lecturaTeclado.nextDouble();
        System.out.println("Cuantos sois para la cuenta");
        int numeroPersonas = lecturaTeclado.nextInt();

        //3. Hacer calculos
        double costeBocatas = bocatas*precioBocata;
        double costeBebidas = bebidas*precioBebida;
        double costeTotal = costeBocatas+costeBebidas;
        double precioTotal = costeTotal/numeroPersonas;

        // 4. Mostrar datos
        System.out.printf("El precio de los bocatas es %.2f%n",costeBocatas);
        System.out.printf("El precio de los bebida es %.2f%n",costeBebidas);
        System.out.printf("El precio total es %.2f%n",costeTotal);
        System.out.printf("El precio por persona es %.2f%n",precioTotal);
        lecturaTeclado.close();
    }


}
