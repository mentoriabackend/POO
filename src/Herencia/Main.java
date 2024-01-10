package Herencia;

public class Main {
    public static void main(String[] args) {

        //DE DONDE ESTOY HEREDANDO  - NOMBRE = NEW CLASEHIJO()

        Profesion medico = new Medico("medico",1000,"hospital","45454gg");

        int sueldo = medico.calcularSueldo();
        int pension = medico.calcularPensionMensual();

        Profesion ingeniero = new Ingeniero("Herencia.Ingeniero",3000,"ObraNombre");
        int sueldoIngeniero= ingeniero.calcularSueldo();
        int pensionIngeniero = ingeniero.calcularPensionMensual();

        //Polimorfismo = poli = muchas - morfismo = formas
        //Herencia = clase padre hereda a sus clase hijas sus atributos y metodos
        // encapsulacion = privatizar variables y metodos
        // abstracion = Representar las cosas



    }
}
