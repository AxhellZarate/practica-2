import java.util.Comparator;

public class Usuario extends Persona{
    private TipoUsuario tipoUsuario;

    public Usuario(String nombre, int edad, String correo, TipoUsuario tipoUsuario) {
        super(nombre, edad, correo);
        generarCodigo("U");
        this.tipoUsuario = tipoUsuario;

    }

    public Usuario(String nombre, int edad, String correo) {
        super(nombre, edad, correo);
        this.tipoUsuario = TipoUsuario.NORMAL;
    }

    public static Comparator<Usuario> nameComparator =new Comparator<Usuario>() {
        @Override
        public int compare(Usuario o1, Usuario o2) {
            return 0;
        }
    };

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public static Comparator<Usuario> getNameComparator() {
        return nameComparator;
    }

    public static void setNameComparator(Comparator<Usuario> nameComparator) {
        Usuario.nameComparator = nameComparator;
    }
}
