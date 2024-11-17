public class Usuariounico {
    private String usuario;
    private static Usuariounico usuariounico;
    private Usuariounico(String usuario){
        this.usuario=usuario;
        System.out.println("El usuario único es: " + this.usuario);

    }
    public static Usuariounico getInstance(String usuario){
        if (usuariounico==null){
            usuariounico = new Usuariounico(usuario);
        }else {
            System.out.println("No se puede crear nuevo usuario " + usuario + ", porque ya existe un objeto en la clase Usuariounico.");
        }
        return usuariounico;

    }
    public String getUsuario(){
        return usuario;
    }


}
