package src.S0302.Nivel3;

public class CambioMonedaDI implements IProcesarCambio {

    private ICambioMoneda moneda;

    public CambioMonedaDI(ICambioMoneda euro) {
        this.moneda = euro;
    }

    @Override
    public void procesarCambio(double precio) {
        this.moneda.conversor(precio);
    }
}
