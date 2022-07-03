package src.S0302.Nivel3;

public class InyectorDolarAustraliano implements IInyectorCambio {
    @Override
    public IProcesarCambio getProcesarCambio() {
        return new CambioMonedaDI(new DolarAustraliano());
    }
}
