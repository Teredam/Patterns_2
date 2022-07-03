package src.S0302.NIvel2;

public class TiendaZapato {

    void conectandoPago(PagoCallback callback){
        System.out.println("Procesando pago......");

        callback.procesoPago();

    }
}
