package src.S0302.Nivel3;

public class DolarAustraliano implements ICambioMoneda {

    @Override
    public void conversor(double precio) {
        precio = precio * 1.52960;
        System.out.println("AUD " +  precio);
    }
}
