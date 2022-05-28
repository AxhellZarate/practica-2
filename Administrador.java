import java.util.List;

public class Administrador extends Persona{
    private List<Usuario> usuario;

    public Administrador(String nombre, int edad, String correo, List<Usuario> usuario) {
        super(nombre, edad, correo);
        generarCodigo("A");
        this.usuario = usuario;

    }

    public double calcularAporte(Administrador adm){
        double aporte = 0d; 
        List<Usuario> usuarios = adm.getUsuario();
        for (int i =0; i< usuario.size(); i++) {
            if (usuarios.get(i).getTipoUsuario() == TipoUsuario.NORMAL) {
                aporte += 5d;
            } else if (usuarios.get(i).getTipoUsuario() == TipoUsuario.VIP) {
                aporte += 10d;
            } else if (usuarios.get(i).getTipoUsuario() == TipoUsuario.SUPERVIP) {
                aporte += 25d;
            }
        }
        return aporte;
    }

    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }
}
