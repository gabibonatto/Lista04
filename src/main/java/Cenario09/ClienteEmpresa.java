package src.main.java.Cenario09;

public class ClienteEmpresa extends Cliente {
    private String CNPJ;
    private String inscEstadual;
    private int anoFundacao;

    public ClienteEmpresa(String nome, String telefone, String email, Endereco endereco, double vlrMaxCredito, String CNPJ, String inscEstadual, int anoFundacao) {
        super(nome, telefone, email, endereco, vlrMaxCredito);
        this.CNPJ = CNPJ;
        this.inscEstadual = inscEstadual;
        this.anoFundacao = anoFundacao;
    }

    @Override
    public void emprestar(double valor) {
        if (vlrEmprestado + valor <= vlrMaxCredito) {
            vlrEmprestado += valor;
        } else {
            System.out.println("Limite de crédito excedido!");
        }
    }

    @Override
    public double devolver(double valor) {
        if (vlrEmprestado - valor >= 0) {
            vlrEmprestado -= valor;
            return valor;
        } else {
            double valorDevolvido = vlrEmprestado;
            vlrEmprestado = 0;
            return valorDevolvido;
        }
    }

    @Override
    public double getSaldo() {
        return vlrMaxCredito - vlrEmprestado;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
}

