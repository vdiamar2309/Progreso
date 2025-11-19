import java.util.Scanner;

public class Principal {

    public static String ayuda = "¿Que acción quiere realizar? (Puede retirar, ingresar o ver tu saldo o salir)";

    static void main() {
        CuentaCorriente c = new CuentaCorriente(6.7);
        Scanner scanner = new Scanner(System.in);
        boolean iniciar = true;

        while (iniciar) {
            System.out.print("> ");
            String accion = scanner.nextLine();


        }
    }


}
}
