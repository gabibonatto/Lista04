package src.main.java.Cenario08;

import java.util.ArrayList;
import java.util.List;

class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionar(Contato contato) {
        contatos.add(contato);
    }

    public Contato getContato(int codigo) {
        for (Contato contato : contatos) {
            if (contato.getCodigo() == codigo) {
                return contato;
            }
        }
        return null;
    }

    public void excluirContato(int codigo) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getCodigo() == codigo) {
                contatos.remove(i);
                return;
            }
        }
    }

    public String listarContatos() {
        StringBuilder sb = new StringBuilder();
        for (Contato contato : contatos) {
            sb.append(contato.toString()).append("\n");
        }
        return sb.toString();
    }
}
