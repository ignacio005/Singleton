public class Main {
    public static void main(String[] args) {
        Usuariounico usuariounico1 = Usuariounico.getInstance("pep05");
        Usuariounico usuariounico2 = Usuariounico.getInstance("juan44");
        System.out.println(usuariounico1.getUsuario());
        System.out.println(usuariounico2.getUsuario());

    }
}