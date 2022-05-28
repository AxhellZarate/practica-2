import java.util.ArrayList;

public class RedSocialConRestriccion extends RedSocial {
    private TipoRestriccion restriccion;

    public RedSocialConRestriccion(TipoRestriccion restriccion) {
        this.restriccion = restriccion;
    }

    public void darAlta(Usuario user){
        if (red == null){
            red = new ArrayList<>();
        }
        if (user == null){
            throw new RedSocialException("El usuario que deseas añadir es nulo");
        }
        if (restriccion.valida(user)){
            if (buscar(user) == -1){
                red.add(user);
            }
        }
    }
}
