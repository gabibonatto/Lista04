package src.main.java.Cenario02;

public class Programa {
    
    public static void main(String[] args) {

        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto(2, 5);

        double distanciaPonto1ParaPonto2 = ponto1.calcularDistancia(ponto2);
        System.out.println("Distância de ponto1 a ponto2: " + distanciaPonto1ParaPonto2);

        Ponto coordenadasNovoPonto = new Ponto(7, 2);
        double distanciaPonto2ParaCoordenadas = ponto2.calcularDistancia(coordenadasNovoPonto);
        System.out.println("Distância de ponto2 às coordenadas (7,2): " + distanciaPonto2ParaCoordenadas);

        ponto1.setX(10);
        ponto1.setY(3);
    }

}
