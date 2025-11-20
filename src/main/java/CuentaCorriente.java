public class   CuentaCorriente {
    private double saldo;
    private int contadorReintegros,numIngreso;
    public double dineroFisico;
    // Constructor
    public CuentaCorriente(double saldoInicial){
        saldo=saldoInicial;
        dineroFisico=0;
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
        saldo=dineroFisico;
        saldo-=cantidad;
        contadorReintegros++;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) throws Miexception{
        if (cantidad<0){
            throw new Miexception("No puedes ingresar una cantidad menor de 0");
        }
        if (cantidad>dineroFisico){
            throw new Miexception("No puedes ingresar una cantidad mayor a la que tienes");
        }
        numIngreso++;
    }

}
