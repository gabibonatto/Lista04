package src.main.java.Cenario09;

public class ClientePessoa extends Cliente {
    private String CPF;
    private double peso;
    private double altura;

    public ClientePessoa(String nome, String telefone, String email, Endereco endereco, double vlrMaxCredito, String CPF, double peso, double altura) {
        super(nome, telefone, email, endereco, vlrMaxCredito);
        this.CPF = CPF;
        this.peso = peso;
        this.altura = altura;
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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
