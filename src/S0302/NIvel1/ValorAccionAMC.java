package src.S0302.NIvel1;

public class ValorAccionAMC extends ObservadorCambio{
    private double valorAccionAMC = 13.05;

    public ValorAccionAMC(SubjectBrokersInteractive sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }

    @Override
    public void actualizar() {
        System.out.println("AMC: " + "precio inicio dia: " + valorAccionAMC + ", \n     precio al momento: " + (sujeto.getValorAccion() + valorAccionAMC)  + " $, tendencia: " + (sujeto.getTendencia()));
    }
}
