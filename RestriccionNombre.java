public class RestriccionNombre implements TipoRestriccion{

    private char letra;

    public RestriccionNombre(char letra) {
        this.letra = letra;
    }

    @Override
    public boolean valida(Persona p) {
        return (p.getNombre().charAt(0)==this.letra);
    }
}
