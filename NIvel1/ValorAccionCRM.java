package src.S0302.NIvel1;

public class ValorAccionCRM extends ObservadorCambio{
    private double valorAccionCRM = 171.48;

    public ValorAccionCRM(SubjectBrokersInteractive sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }

    @Override
    public void actualizar() {
        System.out.println("CRM: " + "precio inicio dia: " + valorAccionCRM + ", \n     precio al momento: " + (sujeto.getValorAccion() + valorAccionCRM)  + " $, tendencia: " + (sujeto.getTendencia()));
    }
}
