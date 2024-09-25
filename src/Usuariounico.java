public class Usuariounico {
    private String usuario;
    private static Usuariounico usuariounico;
    private Usuariounico(String usuario){
        this.usuario=usuario;
        System.out.println("El usuario único es: " + this.usuario);

    }
    public static Usuariounico getUsuario(String usuario){
        if (usuariounico==null){
            usuariounico = new Usuariounico(usuario);
        }else {
            System.out.println("El usuario esta repetido");
        }
        return usuariounico;

    }


}
