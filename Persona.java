import java.util.Objects;

public class Persona {
    private String nombre;
    private int edad;
    private String correo;
    private int correlativo = 0;
    private String codigo;
    private static int ultimoCorrelativo = 10001;

    public void generarCodigo(String tipo){
        String correlativo = tipo+(ultimoCorrelativo+getCorrelativo());
        ultimoCorrelativo += 1;
        this.setCodigo(correlativo);
    }

    public Persona(String nombre, int edad, String correo) {
        if (nombre == null || correo == null || edad<0){
            throw new RedSocialException("El nombre y el correo no pueden ser nulos y las edades no pueden sernegativas");
        }
        generarCodigo("-");
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return nombre + " " + codigo + " " + edad + "(" + correo + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(correo, persona.correo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, correo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(int correlativo) {
        this.correlativo = correlativo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public static int getUltimoCorrelativo() {
        return ultimoCorrelativo;
    }

    public static void setUltimoCorrelativo(int ultimoCorrelativo) {
        Persona.ultimoCorrelativo = ultimoCorrelativo;
    }
}
