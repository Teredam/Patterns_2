package src.S0302.NIvel1;

public class ValorAccionTesla extends ObservadorCambio{

    private double valorAccionTesla = 686.80;

    public ValorAccionTesla(SubjectBrokersInteractive sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }

    @Override
    public void actualizar() {
        System.out.println("TESLA: " + "precio inicio dia: " + valorAccionTesla + ", \n       precio al momento: " + (sujeto.getValorAccion() + valorAccionTesla)  + " $, tendencia: " + (sujeto.getTendencia()));
    }
}
