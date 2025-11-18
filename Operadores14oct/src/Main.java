import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        System.out.println("En la puta me cago");
        Operadores operacionesVariables = new Operadores();
        //operacionesVariables.operadoresArimeticos();
        //operacionesVariables.operadoresComparacion();
        //operacionesVariables.operadoresLogicos()
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        System.out.println("Que salario quieres ganar");
        double salarioEntrada = lectorTeclado.nextDouble();
        System.out.println("Que edad tienes");
        int edad =lectorTeclado.nextInt();
        System.out.println("Tienes permiso de conducir");
        boolean conducir = lectorTeclado.nextBoolean();
        operacionesVariables.evaluarCandidato((int) salarioEntrada,edad, conducir);





    }

}