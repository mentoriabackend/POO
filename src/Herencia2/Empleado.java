package Herencia2;

public class Empleado extends Trabajador{

    private double sueldo;
    private double deducciones;

    public Empleado(String nombre,double sueldo) {
        super(nombre);
        this.sueldo=sueldo;
        this.deducciones = 0.45 * sueldo;
    }

    @Override
    public double calcularPago(){
        return (sueldo - deducciones);
    }

    public String toString(){
        return "Empleado: " + super.toString();
    }
}
