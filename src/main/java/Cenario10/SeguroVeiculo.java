package src.main.java.Cenario10;

public class SeguroVeiculo extends Seguro {
    private double vlrFranquia;
    private boolean temCarroReserva;
    private boolean cobreVidros;

    public SeguroVeiculo(String apolice, Segurado segurado, double vlrApolice, LocalDate dtaInicio, LocalDate dtaFim, double vlrFranquia, boolean temCarroReserva, boolean cobreVidros) {
        super(apolice, segurado, vlrApolice, dtaInicio, dtaFim);
        this.vlrFranquia = vlrFranquia;
        this.temCarroReserva = temCarroReserva;
        this.cobreVidros = cobreVidros;
    }

    public double getVlrFranquia() {
        return vlrFranquia;
    }

    public void setVlrFranquia(double vlrFranquia) {
        this.vlrFranquia = vlrFranquia;
    }

    public boolean isTemCarroReserva() {
        return temCarroReserva;
    }

    public void setTemCarroReserva(boolean temCarroReserva) {
        this.temCarroReserva = temCarroReserva;
    }

    public boolean isCobreVidros() {
        return cobreVidros;
    }

    public void setCobreVidros(boolean cobreVidros) {
        this.cobreVidros = cobreVidros;
    }

    @Override
    public String getDados() {
        return "Seguro Veículo: Apólice: " + getApolice() + ", Segurado: " + getSegurado() +
                ", Valor Apólice: " + getVlrApolice() + ", Data Início: " + getDtaInicio() +
                ", Data Fim: " + getDtaFim() + ", Valor Franquia: " + vlrFranquia +
                ", Tem Carro Reserva: " + temCarroReserva + ", Cobre Vidros: " + cobreVidros;
    }
}

