package src.S0302.NIvel2;

public class PagoDeudaCuentaBancaria implements PagoCallback {
    @Override
    public void procesoPago() {
        System.out.println("Pago con deuda en cuenta bancaria realizado correctamente");
    }
}
