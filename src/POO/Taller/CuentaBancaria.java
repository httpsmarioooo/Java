package POO.Taller;

public class CuentaBancaria {

    private String numeroCuenta;
    private String nombreTitular;
    private double saldo;
    private String tipoCuenta;

    // Constructor vacío
    public CuentaBancaria() {
        this.saldo = 0; // El saldo debe iniciar en 0
    }

    // Constructor con parámetros
    public CuentaBancaria(String numeroCuenta, String nombreTitular, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0; // Siempre empieza en 0
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso: $" + monto);
        } else {
            System.out.println("El monto debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso: $" + monto);
        } else {
            System.out.println("Monto inválido o fondos insuficientes.");
        }
    }

    public void mostrarDatos() {
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Titular: " + nombreTitular);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
        System.out.println("Saldo: $" + saldo);
        System.out.println("---------------------------");
    }

    // Getters y Setters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }


    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
}
