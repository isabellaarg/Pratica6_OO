package Exercicio2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nomeEmpresa = JOptionPane.showInputDialog("Digite o nome da empresa: ");
        String cnpj = JOptionPane.showInputDialog("Digite o cnpj da empresa: ");
        int qtdDeFunc = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de funcionarios da empresa: "));
        Empresa empresa = new Empresa(nomeEmpresa, cnpj, qtdDeFunc);


        Funcionario func = null;
        ArrayList<Funcionario> funcionario = new ArrayList<>();
        for (int i=0; i <5; i++){
            String nome = JOptionPane.showInputDialog("Digite o nome do funcionario: ");

            String email = JOptionPane.showInputDialog("Digite o email do funcionario: ");

            String telefone = JOptionPane.showInputDialog("Digite o telefone do funcionario: ");

            String departamento = JOptionPane.showInputDialog("Digite o departamento: ");

            double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do funcionario: "));

            String dataDeEntrada = JOptionPane.showInputDialog("Digite a data de entrada: ");

            String rg = JOptionPane.showInputDialog("Digite o rg do funcionario: ");
            boolean funcionarioEstaNaEmpresa = Boolean.parseBoolean(JOptionPane.showInputDialog("Digite true para sim ou false para não se o funcionario trabalha na empresa"));

            func = new Funcionario(nome, email, telefone, departamento, salario, dataDeEntrada, rg, funcionarioEstaNaEmpresa);

            funcionario.add(func);

            empresa.adicionarFuncionario(func);
        }
        for (int i=0; i <2; i++) {
            funcionario.get(i).mostrarDados();
        }



    }
}
