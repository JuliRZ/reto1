package Principal;
import Modelo.*;
import Vistas.*;

public class Main {
public static void main(String[] args) {
        Conexion conexionDB=new Conexion();
        Login login = new Login();
        login.setVisible(true);
    }
}