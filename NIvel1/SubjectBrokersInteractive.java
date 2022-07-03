package src.S0302.NIvel1;

import java.util.ArrayList;
import java.util.List;

public class SubjectBrokersInteractive {

    private List<ObservadorCambio> observadores = new ArrayList<ObservadorCambio>();
    private double valorAccion;
    private String tendencia;

    public double getValorAccion() {
        return valorAccion;
    }

    public void setValorAccion(double valorAccion) {
        this.valorAccion = valorAccion;
    }

    public String getTendencia() {
        return tendencia;
    }

    public void setTendencia(String tendencia) {
        this.tendencia = tendencia;
        notificarTodosObservadores();
    }

    public void agregar(ObservadorCambio observador){
        observadores.add(observador);
    }
    public void notificarTodosObservadores(){
        observadores.forEach(x -> x.actualizar());
    }
}
