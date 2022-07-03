package src.S0302.NIvel2;

public class PagoTarjetaCredito implements PagoCallback {
    @Override
    public void procesoPago() {
        System.out.println("Pago con Tarjeta de Crédito realizado correctamente.");
    }
}
