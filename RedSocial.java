import java.util.ArrayList;
import java.util.List;

public class RedSocial {
    protected List<Persona> red;

    protected int buscar (Persona p){
        return red.indexOf(p);
    }

    public void darAlta(Usuario user){
        if (red == null){
            red = new ArrayList<>();
        }
        if (user == null){
            throw new RedSocialException("El usuario que deseas añadir es nulo");
        }
        if (buscar(user) == -1){
            red.add(user);
        }
    }

    public List<Persona> getRed() {
        return red;
    }

    public void setRed(List<Persona> red) {
        this.red = red;
    }
    
}
