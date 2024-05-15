package src.main.java.Cenario01;

import java.util.Arrays;

public class Programa {


    public static void main(String[] args) {

        Livro livro1 = new Livro("1598FHK", "Core Java 2", new String[]{"Cay S. Horstmann", "Gary Cornell"}, "0130819336", 2005);
        Livro livro2 = new Livro("9865PLO", "Java, Como programar", new String[]{"Harvey Deitel"}, "0130341517", 2015);

        System.out.println("Livro 1:");
        System.out.println("Código: " + livro1.getCodigo());
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autores: " + Arrays.toString(livro1.getAutores()));
        System.out.println("ISBN: " + livro1.getIsbn());
        System.out.println("Ano: " + livro1.getAno());

        System.out.println("\nLivro 2:");
        System.out.println("Código: " + livro2.getCodigo());
        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Autores: " + Arrays.toString(livro2.getAutores()));
        System.out.println("ISBN: " + livro2.getIsbn());
        System.out.println("Ano: " + livro2.getAno());
    }
    
}
