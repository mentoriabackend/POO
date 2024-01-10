package Herencia;

public class Ingeniero extends Profesion{

    private String nombreObra;

    public Ingeniero(String nombre, int sueldoBase, String nombreObra) {
        super(nombre, sueldoBase);
        this.nombreObra= nombreObra;
    }

    @Override
    public int calcularSueldo(){
        return getSueldoBase() * 7;
    }
}
