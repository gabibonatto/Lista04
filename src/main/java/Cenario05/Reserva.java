import java.util.Date;

public class Reserva {
    private String responsavel;
    private int quantidadePessoas;
    private Date dataReserva;
    private double valorTotal;
    
    public String getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }
    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }
    public Date getDataReserva() {
        return dataReserva;
    }
    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

}
