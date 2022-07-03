package src.S0302.NIvel2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TiendaZapato tiendaZapato = new TiendaZapato();

        switch (menu()){
            case 0:
                System.out.println("Hasta luego");
                break;
            case 1:
                tiendaZapato.conectandoPago(new PagoTarjetaCredito());
                break;
            case 2:
                tiendaZapato.conectandoPago(new PagoPaypal());
                break;
            case 3:
                tiendaZapato.conectandoPago(new PagoDeudaCuentaBancaria());
                break;
        }
    }
    public static byte menu(){
        Scanner entrada = new Scanner(System.in);
        byte opcion;
        final byte MINIMO = 0;
        final byte MAXIMO = 3;

        do {
            System.out.println("\nMENú PRINCIPAL");
            System.out.println("Escoge el tipo de pago: \n");
            System.out.println("1. Tarjeta de Crédito");
            System.out.println("2. PAYPAL.");
            System.out.println("3. Deuda Cuenta Bancaria.");
            System.out.println("0. SALIR.\n");
            opcion = entrada.nextByte();
            if(opcion < MINIMO || opcion > MAXIMO){
                System.out.println("Selecciona una opcion entre 0 y 3");
            }

        }while (opcion < MINIMO || opcion > MAXIMO);
            return opcion;
    }

}
