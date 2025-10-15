public class Operadores {

    public void operadoresArimeticos(){
        //unarios//
        int operandoUno = 5;
        //incremento
        operandoUno++; // le suma al valor que ya tenia
        operandoUno++; // le suma al valor que ya tenia
        operandoUno++; // le suma al valor que ya tenia
        operandoUno++;
        System.out.println("El valor de operando uno despues de los incrementos es " +operandoUno);
        // decremento - le resta uno al valor que ya tenia
        operandoUno--;
        operandoUno--;
        operandoUno--;
        operandoUno--;
        System.out.println("El valor de operando uno despues de los decrementos es " +operandoUno);
        //binarios// - dos operadores: suma(+), resta(-), multi(*), div(/) modulo resto de la div
        operandoUno=8;
        int operandoDos = 3;
        int suma =  operandoUno + operandoDos;
        System.out.println("El resultado de la suma es " +suma);
        System.out.println("El resultado de la suma es " +operandoUno+operandoDos);
        // aqui me da 58 porque no los suma, los concatena;
        System.out.println("El resultado de la suma es " +(operandoUno+operandoDos));
        //  para que haga la suma antes que la concatenación
        int resta = operandoUno-operandoDos;
        System.out.println("El resultado de la resta es " +resta);
        int multi = operandoUno*operandoDos;
        System.out.println("El resultado de la multi es " +multi);
        double div = operandoUno/operandoDos;
        System.out.println("El resultado de la division es "+div);
        //modulo - el resto de la division
        int modulo = operandoUno%operandoDos;
        System.out.println("El resto de la div es " +modulo);
    }

    public void operadoresAsignacion(){
        int operadorUno = 10;
        //operadorUno = operadorUno +5; esto es la forma larga de sumar;
        operadorUno += 5; // en operacionUno guarda la suma de lo que valia operadorUno + 5, es lo mismo que arriba pero mas corto;
        //limpias más el codigo
        System.out.println("El valor de operador 1 es " +operadorUno);
        //Hacemos lo mismo con la resta
        operadorUno -=5;
        operadorUno *=2;
        operadorUno %=2;
    }

    //seran utilizados como condiciones para ejecutar una parte del codigo u otra
    public void operadoresComparacion(){
        int operandoUno = 30;
        int operandoDos = 20;
        boolean resultado = operandoUno > operandoDos;
        System.out.println("El resultado de la comparación es " +resultado);
        resultado = operandoUno<operandoDos;
        System.out.println("El resultado de la comparación es " +resultado);
    }

    public void operadoresLogicos(){
        int sueldo = 200000;
        int edad= 35;
        boolean conducir = false;
        //mi candidato es valido cuando quiere cobrar mensos de 30000, tiene menos de 40 y tiene carnet
        boolean candidatoValido = sueldo<30000 && edad<40 && conducir; //true
        candidatoValido= sueldo>=20000|| edad>25 || conducir;
        System.out.println("El candidato es valido " +candidatoValido);


    }
}
