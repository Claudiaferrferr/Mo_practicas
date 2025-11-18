import java.util.Scanner;

public class Ejercicios{
Scanner scanner = new Scanner(System.in);

// Realizar un menú de 4 opciones, donde se mostrará por pantalla el siguiente formato
//- Bienvenido a la aplicación del menú 1. Opción1  Opción2 Opción3 Opción4  Salir
//- Introduce la opción seleccionada
//Una vez mostrado la última línea, el sistema esperará a que el usuario introduzca un dato.
// Dependiendo de la opción seleccionada aparecerá un mensaje por pantalla que ponga
// "La opción seleccionada es X". En el caso de meter una diferente pondrá
//"opción no contemplada". El programa se repetiría hasta que introduzca el 5 (MenuSimple)

    public void MenuSimple(){
        System.out.println("Bienbenido a la aplicacion del menu");
        System.out.println("Opcion 1");
        System.out.println("Opcion 2");
        System.out.println("Opcion 3");
        System.out.println("Opcion 4");
        System.out.println("5. salir");

        int opcion = scanner.nextInt();

        while (opcion != 5){
            System.out.println("Opcion 1");
            System.out.println("Opcion 2");
            System.out.println("Opcion 3");
            System.out.println("Opcion 4");
            System.out.println("5. salir");

            opcion = scanner.nextInt();

            if (opcion ==1) {
                System.out.println("La opcion seleccionada es la 1");
            }else if (opcion == 2) {
                System.out.println("La opcion seleccionada es la 2");
            } else if (opcion ==3) {
                System.out.println("La opcion seleccionada es la 3");
            } else if (opcion ==4) {
                System.out.println("La opcion seleccionada es la 4");
            } else if (opcion==5) {
                System.out.println("La opcion seleccionada es la 5");
                System.out.println("Saliendo del programa");
            } else {
                System.out.println("Opcion no contemplada");
                break;
            }


        }
        scanner.close();



    }

    public void CajeroAutomatico(){
        //Desarrolla un programa que simule un cajero automático. El saldo inicial es 1000€.
        // Usa un bucle do-while para mostrar un menú con opciones: 1=Consultar saldo, 2=Retirar dinero,
        // 3=Depositar dinero, 4=Salir.
        // Usa switch para cada opción. Para retirar dinero, usa un bucle while para validar que no
        // se retire más del saldo disponible (si intenta retirar más, debe volver a pedir la cantidad).
        // Para depositar, valida que sea una cantidad positiva.

        double saldo = 1000;
        int opcion;

        do {
            System.out.println("Cajero automatico");
            System.out.println("1.Consultar saldo");
            System.out.println("2.Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");

            opcion = scanner.nextInt();
        }

        switch (opcion){
            case 1:
            case 1:
                System.out.println("Tu sal");
        }



    }



}
