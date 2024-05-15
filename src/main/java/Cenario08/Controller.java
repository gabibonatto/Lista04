package src.main.java.Cenario08;

class Controller {
    private Agenda agenda;

    public Controller() {
        agenda = new Agenda();
    }

    public void adicionarContatoPessoal(int codigo, String nome, String telefone, String aniversario) {
        ContatoPessoal contato = new ContatoPessoal(codigo, nome, telefone, aniversario);
        agenda.adicionar(contato);
    }

    public void adicionarContatoComercial(int codigo, String nome, String telefone, String cnpj) {
        ContatoComercial contato = new ContatoComercial(codigo, nome, telefone, cnpj);
        agenda.adicionar(contato);
    }

    public void excluirContato(int codigo) {
        agenda.excluirContato(codigo);
    }

    public Contato consultarContato(int codigo) {
        return agenda.getContato(codigo);
    }

    public String listarContatos() {
        return agenda.listarContatos();
    }
}