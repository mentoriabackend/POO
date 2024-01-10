package Herencia2;

public class Main {
    public static void main(String[] args) {

        Trabajador trabajador;
        Empleado empleado;
        Consultor consultor;

        //crear los objetos
        trabajador = new Trabajador("Jorge");
        empleado = new Empleado("Armando",120.000);
        consultor = new Consultor("Andres",150,70.000);

        //Impresion de los valores
        System.out.println(trabajador);
        System.out.println(consultor);
        System.out.println(empleado);

        Trabajador[] trabajadores = new Trabajador[2];
        trabajadores[0]= new Empleado("Jorge", 120.000);
        trabajadores[1]= new Consultor("Juan",50,70.000);

        for (int i = 0; i<2; i++){
            System.out.println(trabajadores[i].calcularPago());
        }




    }
}
