package src.S0302.Nivel3;

public class InyectorDolarAmericano implements IInyectorCambio {
    @Override
    public IProcesarCambio getProcesarCambio() {
        return new CambioMonedaDI(new DolarAmericano());
    }
}
