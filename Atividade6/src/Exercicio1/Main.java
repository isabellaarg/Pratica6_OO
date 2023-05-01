package Exercicio1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Solicita os dados da rede social ao usuário
        String dataCriacao = JOptionPane.showInputDialog("Informe a data de criação da rede social");
        String nomeUsuario = JOptionPane.showInputDialog("Informe um nome do usuario");
        String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento");
        String senha = JOptionPane.showInputDialog("Informe a senha");

        // Cria o objeto da rede social
        RedeSocial redeSocial = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento,senha);

        // Cria dois objetos de publicação com dados inseridos pelo usuário
        String dataPubli1 = JOptionPane.showInputDialog("Informe a data da primeira publicação:");
        String textoPubli1 = JOptionPane.showInputDialog("Informe o texto da primeira publicação:");
        String linkMidia1 = JOptionPane.showInputDialog("Informe o link da mídia da primeira publicação:");
        Publicacao publi1 = new Publicacao(dataPubli1, textoPubli1, linkMidia1);

        String dataPubli2 = JOptionPane.showInputDialog("Informe a data da segunda publicação:");
        String textoPubli2 = JOptionPane.showInputDialog("Informe o texto da segunda publicação:");
        String linkMidia2 = JOptionPane.showInputDialog("Informe o link da mídia da segunda publicação:");
        Publicacao publi2 = new Publicacao(dataPubli2, textoPubli2, linkMidia2);

        redeSocial.inserePublicacao(publi1);
        redeSocial.inserePublicacao(publi2);
        redeSocial.imprimePublicaco();

        //JOptionPane.showMessageDialog(null, ""  , "Rede social", JOptionPane.INFORMATION_MESSAGE);

    }
}
