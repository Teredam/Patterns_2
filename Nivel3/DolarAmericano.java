package src.S0302.Nivel3;

public class DolarAmericano implements ICambioMoneda {

    @Override
    public void conversor(double precio) {
        precio = precio * 1.04265;
        System.out.println("USD " +  precio);
    }

}
