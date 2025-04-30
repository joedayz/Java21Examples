package pe.joedayz.interfaces;

public class Persona implements Cloneable {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Sobrescribimos el método clone()
    @Override
    public Persona clone() {
        try {
            return (Persona) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("No se puede clonar", e);
        }
    }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', edad=" + edad + '}';
    }

    public static void main(String[] args) {
        Persona original = new Persona("José", 30);
        Persona clon = original.clone();

        System.out.println("Original: " + original);
        System.out.println("Clon:     " + clon);
    }
}
