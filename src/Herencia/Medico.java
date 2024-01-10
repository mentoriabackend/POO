package Herencia;

public class Medico extends Profesion{

    private String nombreHospital;
    private String tarjetaProfesional;


    public Medico(String nombre, int sueldoBase,String nombreHospital, String tarjetaProfesional) {
        super(nombre, sueldoBase);
        this.nombreHospital= nombreHospital;
        this.tarjetaProfesional= tarjetaProfesional;
    }

    public String getNombreHospital() {
        return nombreHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public String getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setTarjetaProfesional(String tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }


    @Override
    public int calcularSueldo(){
        return getSueldoBase() * 10;
    }

}

