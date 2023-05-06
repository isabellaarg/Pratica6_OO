package Exercicio3;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Adicionando 10 objetos da classe Artigo em um ArrayList
        ArrayList<Artigo> artigos = new ArrayList<>();
        artigos.add(new Artigo("Título 1", "Resumo 1", "Autor 1"));
        artigos.add(new Artigo("Título 2", "Resumo 2", "Autor 2"));
        artigos.add(new Artigo("Título 3", "Resumo 3", "Autor 3"));
        artigos.add(new Artigo("Título 4", "Resumo 4", "Autor 4"));
        artigos.add(new Artigo("Título 5", "Resumo 5", "Autor 5"));
        artigos.add(new Artigo("Título 6", "Resumo 6", "Autor 6"));
        artigos.add(new Artigo("Título 7", "Resumo 7", "Autor 7"));
        artigos.add(new Artigo("Título 8", "Resumo 8", "Autor 8"));
        artigos.add(new Artigo("Título 9", "Resumo 9", "Autor 9"));
        artigos.add(new Artigo("Título 10", "Resumo 10", "Autor 10"));

        // Criando um objeto do tipo Edicao e adicionando todos os artigos
        Edicao edicao = new Edicao(1, 1, "01/01/2023", 1000);
        edicao.adicionaArtigos(artigos);

        // Criando um objeto do tipo RevistaCientifica e adicionando a Edicao
        RevistaCientifica revista = new RevistaCientifica("Revista Teste", 1234567890, "Mensal");
        revista.adicionaEdicao(edicao);
    }
}
