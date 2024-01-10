package Herencia;

public class Profesion {

    private String nombre;
    private int sueldoBase;

    public Profesion(String nombre, int sueldoBase){
        this.nombre=nombre;
        this.sueldoBase=sueldoBase;
    }

    public int calcularPensionMensual(){
        return sueldoBase -10;
    }

    public int calcularSueldo(){
        return sueldoBase - 1000;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
}
