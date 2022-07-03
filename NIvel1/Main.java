package src.S0302.NIvel1;

public class Main {

    static SubjectBrokersInteractive subject = new SubjectBrokersInteractive(); //ceamos una insancia del sujeto

    public static void main(String[] args) {

        //Creamos instancia de los observadores pasando el sujeto en analisis
        new ValorAccionTesla(subject);
        new ValorAccionAMC(subject);
        new ValorAccionCRM(subject);

        //Para verificar cambiamos el estado de sujeto

        System.out.println("");

        notificar(1, "Estable");
        notificar(- 13, "Baja");
        notificar(171, "Alcista");
    }

    public static void notificar(int comportamientoAccion, String tendencia) {

        System.out.println("COTIZACION...\n");
        subject.setValorAccion(comportamientoAccion);
        subject.setTendencia(tendencia);
        System.out.println("\n");

    }
}
