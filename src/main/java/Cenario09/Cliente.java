package src.main.java.Cenario09;

public abstract class Cliente {
    protected String nome;
    protected String telefone;
    protected String email;
    protected Endereco endereco;
    protected double vlrMaxCredito;
    protected double vlrEmprestado;

    public Cliente(String nome, String telefone, String email, Endereco endereco, double vlrMaxCredito) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.vlrMaxCredito = vlrMaxCredito;
        this.vlrEmprestado = 0;
    }

    public abstract void emprestar(double valor);

    public abstract double devolver(double valor);

    public abstract double getSaldo();

    // Getters e setters omitidos para brevidade
}

