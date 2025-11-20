public class CuentaCorriente {
    private double saldo;
    private int contadorReintegros,numIngreso;
    private double dineroFisico;
    // Constructor
    public CuentaCorriente(double saldoInicial){
        saldo=saldoInicial;
    }

    private void setSaldo(double saldo) throws Miexception {
        if (saldo<0){
            throw new Miexception("Saldo no válido");

        }
    }

    public void retirar(double cantidad) throws Miexception {
        if (cantidad<0){
            throw new Miexception("No puedes retirar una cantidad menor de 0");
        }
        if (cantidad>saldo){
            throw new Miexception("No puedes retirar una cantidad mayor a la que tienes en tu cuenta");
        }
        saldo-=cantidad;
        contadorReintegros++;
    }
}
