import java.util.Scanner;

public class Principal {

    public static String ayuda = "¿Que acción quiere realizar? (Puede retirar, ingresar o ver tu saldo o salir)";
    public static String retiro= "¿Cuanto desea retirar?";
    public static String hecho= "La acción ha sido realizada ¿quiere hacer alguna más?";

   public static void main() {
        CuentaCorriente c = new CuentaCorriente(6.7);
        Scanner scanner = new Scanner(System.in);
        boolean iniciar = true;

        while (iniciar) {
            System.out.print("> ");
            String accion = scanner.nextLine();
            switch (accion) {
                case "Retirar":
                    System.out.println(retiro);

            }
        }


    }

}
