import java.util.ArrayList;
import java.util.List;

public class Ejecuta {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Nestor",24,"nrafael1@contoso.com");
        Usuario user2 = new Usuario("JUan",12,"JUan@contoso.com");
        Usuario user3 = new Usuario("Marcos",6,"Marcos@contoso.com",TipoUsuario.VIP);
        Usuario user4 = new Usuario ("martin",9,"martin@contoso.com",TipoUsuario.VIP);
        Usuario user5 = new Usuario ("Roland",12,"Roland@contoso.com",TipoUsuario.SUPERVIP);
        Usuario user6 = new Usuario ("Miguel",15,"Miguel@contoso.com",TipoUsuario.SUPERVIP);
        Usuario user7 = new Usuario ("julian",6,"julian@contoso.com",TipoUsuario.NORMAL);
        Usuario user8 = new Usuario ("Carla",9,"Carla@contoso.com",TipoUsuario.VIP);

        List<Usuario> listaAdm1 = new ArrayList<>();
        listaAdm1.add(user1);
        listaAdm1.add(user4);
        listaAdm1.add(user5);

        List<Usuario> listaAdm2 = new ArrayList<>();
        listaAdm2.add(user2);
        listaAdm2.add(user6);

        List<Usuario> listaAdm3 = new ArrayList<>();
        listaAdm3.add(user3);
        listaAdm3.add(user7);
        listaAdm3.add(user8);


        Administrador adm1 = new Administrador("Luis",12,"Luis@contoso.com", listaAdm1);
        Administrador adm2 = new Administrador("santiago",15,"santiago@contoso.com",listaAdm2);
        Administrador adm3 = new Administrador("jaime",17,"jaime@contoso.com",listaAdm3);

        System.out.println(listaAdm1);
    }
}
