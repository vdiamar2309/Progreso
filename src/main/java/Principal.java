import MiEntradaSalida.MiEntradaSalida;

import java.util.Scanner;

public class Principal {

    public static String ayuda = "¿Que acción quiere realizar? (Puede retirar, ingresar o ver tu saldo o salir)";
    public static String retiro = "¿Cuanto desea retirar?";
    public static String hecho = "La acción ha sido realizada ¿quiere hacer alguna más?";

    static void main() {
        CuentaCorriente c = new CuentaCorriente(6);
        Scanner scanner = new Scanner(System.in);
        boolean iniciar = true;
        System.out.println("Bienvenido al Banco");
        System.out.println("Escribe man para abrir la ayuda");
        while (iniciar) {
            System.out.print("> ");
            String accion = scanner.nextLine();
            switch (accion) {
                case "man":
                    System.out.println(ayuda);
                    break;
                case "retirar":
                    int banco = MiEntradaSalida.solicitarEntero(retiro);
                    double saldo = banco;
                    try {
                        c.retirar(saldo);
                        System.out.println(hecho);
                    } catch (Miexception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "ingresar":
                    int
            }
        }
    }
}
