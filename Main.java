import menu.Login;
import menu.MenuUtama;

public class Main {

    public static void main(String[] args) {

        if (Login.login()) {

            MenuUtama.tampilMenu();

        }

    }

}