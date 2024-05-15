package src.main.java.Cenario06;

import java.util.Calendar;

class Passagem {
    private int numeroAssento;
    private String classeAssento;
    private Calendar dataVoo;

    public Passagem(int numeroAssento, String classeAssento, Calendar dataVoo) {
        this.numeroAssento = numeroAssento;
        this.classeAssento = classeAssento;
        this.dataVoo = dataVoo;
    }

    // Getters e setters
    public int getNumeroAssento() {
        return numeroAssento;
    }

    public String getClasseAssento() {
        return classeAssento;
    }

    public Calendar getDataVoo() {
        return dataVoo;
    }
}
