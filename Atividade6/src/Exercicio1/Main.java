package Exercicio1;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Solicita os dados da rede social ao usuário
        String dataCriacao = JOptionPane.showInputDialog("Informe a data de criação da rede social");
        String nomeUsuario = JOptionPane.showInputDialog("Informe o nome do usuario");
        String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento");
        String senha = JOptionPane.showInputDialog("Informe a senha");

        // Cria o objeto da rede social
        RedeSocial redeSocial = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento,senha);
        Publicacao publi1;

        ArrayList<Publicacao> publi = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            String dataPublicacao = JOptionPane.showInputDialog("Informe a data da publicação: ");
            String textoPublicacao = JOptionPane.showInputDialog("Informe o texto: ");
            String linkMidia = JOptionPane.showInputDialog("Informe o link: ");
            publi1 = new Publicacao(dataPublicacao, textoPublicacao, linkMidia);
            publi.add(publi1);

        }
        redeSocial.imprimePublicaco();


    }
}
