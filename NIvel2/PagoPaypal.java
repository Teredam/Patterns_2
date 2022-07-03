package src.S0302.NIvel2;

public class PagoPaypal implements PagoCallback {
    @Override
    public void procesoPago() {
        System.out.println("Pago con PAYPAL realizado correctamente.");
    }
}
