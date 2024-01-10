package EjemploIntegrado;

public class Main {
    public static void main(String[] args) {

        Animal perro = new Animal();
        perro.setRaza("doberman");
        perro.cazar();
        perro.desplazarse();
        perro.alimentarse();
        perro.jugar();

        System.out.println();

        Humano persona = new Humano();
        persona.setCedula(1040031390);
        persona.alimentarse();
        persona.desplazarse();
        persona.jugar();
        persona.razonar();

        System.out.println();

        Hombre andres = new Hombre();
        andres.setCedula(1111111111);
        andres.setNombre("andres camilo");
        andres.razonar();
        andres.desplazarse();
        andres.jugar();
        andres.trabajar(andres.getNombre(), andres.getCedula());

        System.out.println();
    }
}
