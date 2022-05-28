public class RestriccionEdad implements TipoRestriccion{

    private int edadMinima;

    public RestriccionEdad(int edadMinima) {
        if (edadMinima<0){
            throw new RedSocialException("La edad minima no puede ser negativa");
        }
        this.edadMinima = edadMinima;
    }

    @Override
    public boolean valida(Persona p) {
        return (p.getEdad()>this.edadMinima);
    }
}
