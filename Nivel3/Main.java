package src.S0302.Nivel3;

public class Main {
    public static void main(String[] args) {

        double precioArticulo1 = 125.35;
        double precioArticulo2 = 15.70;

        IInyectorCambio inyector = null;
        IProcesarCambio procesar = null;

        System.out.println("\nLa camiseta de Messi 10 cuesta : " + precioArticulo1 + " euros. \nEn dolar americano y " +
                "australiano cuesta: ");

        //Precios en dolar americano

        inyector = new InyectorDolarAmericano();
        procesar = inyector.getProcesarCambio();
        procesar.procesarCambio(precioArticulo1);

        //Precios en dolar australiano

        inyector = new InyectorDolarAustraliano();
        procesar = inyector.getProcesarCambio();
        procesar.procesarCambio(precioArticulo1);
        System.out.println("\n");

        System.out.println("\nLos calcetines de Messi cuestan : " + precioArticulo2 + " euros. \nEn dolar americano y " +
                "australiano cuesta: ");

        //Precios en dolar americano

        inyector = new InyectorDolarAmericano();
        procesar = inyector.getProcesarCambio();
        procesar.procesarCambio(precioArticulo2);

        //Precios en dolar australiano

        inyector = new InyectorDolarAustraliano();
        procesar = inyector.getProcesarCambio();
        procesar.procesarCambio(precioArticulo2);
    }
}
