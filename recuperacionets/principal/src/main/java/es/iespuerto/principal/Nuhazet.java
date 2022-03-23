package es.iespuerto.principal;

/**
 * Clase Nuhazet
 */
public class Nuhazet {
    private String nombre;
    private String apellido1;
    private String apellido2;

    /**
     * Constructor por defecto
     */
    public Nuhazet() {
        this.nombre="Nuhazet";
        this.apellido1="Correa";
        this.apellido2="Wololo";
    }

    /**
     * Constructor con un parámetros
     * @param parametro1 parámetro String para el nombre 
     */
    public Nuhazet(String parametro1) {
        this.nombre = parametro1;
    }

    /**
     * Constructor con dos parámetros
     * @param parametro1 parámetro String para el nombre 
     * @param parámetro2 parámetro String para el nombre 
     */
    public Nuhazet(String parametro1, String parametro2) {
        this.nombre = parametro1;
        this.apellido1 = parametro2;
    }


    /**
     * Constructor con tres parámetros
     * @param parametro1 parámetro String para el nombre 
     * @param parámetro2 parámetro String para el nombre 
     * @param parámetro3 parámetro String para el nombre 
     */
    public Nuhazet(String parametro1, String parametro2, String parametro3) {
        this.nombre = parametro1;
        this.apellido1 = parametro2;
        this.apellido2 = parametro3;
    }

    /**
     * Método que realizará la validación de las propiedades de la clase
     */
    public void ValidarNombre(){

    }




}
