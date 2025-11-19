public class CuentaCorriente {
    private double saldo;
    private int contadorReintegros,numIngreso;
// Constructor
    public CuentaCorriente(double saldoInicial){
    saldo=10.20;
    }

    private void setSaldo(double saldo) throws Miexception {
        if (saldo<0){
            throw new Miexception("Saldo no válido");

        }
    }

    private static void Retirar(){

    }


}
