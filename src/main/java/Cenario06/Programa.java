package src.main.java.Cenario06;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        Calendar dataVoo = new GregorianCalendar(2024, Calendar.MAY, 14, 10, 30);

        Passagem passagem = new Passagem(25, "Econômica", dataVoo);

        Aeronave aeronave = new Aeronave("ABC123", "Boeing 737", 200);

        Passageiro passageiro = new Passageiro("Marcos", "123456", "B1234", passagem);

        Tripulacao tripulante = new Tripulacao("Gabi", "654321", "A789", "F9876");

        List<String> idiomasComissario = new ArrayList<>();
        idiomasComissario.add("Inglês");
        idiomasComissario.add("Espanhol");

        Comissario comissario = new Comissario("Ana", "987654", "B456", "C6543", idiomasComissario);

        Comandante comandante = new Comandante("Pedro", "456789", "C123", "D5432", 5000);

        System.out.println("Informações do Passageiro:");
        System.out.println("Nome: " + passageiro.getNome());
        System.out.println("RG: " + passageiro.getRg());
        System.out.println("Identificador de Bagagem: " + passageiro.getIdentificadorBagagem());
        System.out.println("Número do Assento: " + passageiro.getPassagem().getNumeroAssento());
        System.out.println("Classe do Assento: " + passageiro.getPassagem().getClasseAssento());
        System.out.println("Data do Voo: " + passageiro.getPassagem().getDataVoo().getTime());

        System.out.println("\nInformações do Comandante:");
        System.out.println("Nome: " + comandante.getNome());
        System.out.println("RG: " + comandante.getRg());
        System.out.println("Identificação Aeronáutica: " + comandante.getIdentificacaoAeronautica());
        System.out.println("Matrícula do Funcionário: " + comandante.getMatriculaFuncionario());
        System.out.println("Total de Horas de Voo: " + comandante.getTotalHorasVoo());

        System.out.println("\nInformações do Comissário:");
        System.out.println("Nome: " + comissario.getNome());
        System.out.println("RG: " + comissario.getRg());
        System.out.println("Identificação Aeronáutica: " + comissario.getIdentificacaoAeronautica());
        System.out.println("Matrícula do Funcionário: " + comissario.getMatriculaFuncionario());
        System.out.println("Idiomas de Fluência: " + comissario.getIdiomas());

        System.out.println("\nInformações da Aeronave:");
        System.out.println("Código: " + aeronave.getCodigo());
        System.out.println("Tipo: " + aeronave.getTipo());
        System.out.println("Quantidade de Assentos: " + aeronave.getQuantidadeAssentos());
    }

    @Override
    public String toString() {
        return "Programa []";
    }
}