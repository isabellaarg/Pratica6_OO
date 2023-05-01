package Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario[] funcionario = new Funcionario[5];
        funcionario[0] = new Funcionario("Harry", "harrystyles@gmail.com","997165555", "Analista de teste", 2500.00, "12/02/2020", "5555555", true);
        
        funcionario[1] = new Funcionario("Louis", "louistom@gmail.com","987744455", "Desenvolvedor", 5000.00, "12/03/2020", "8899855", true);
        funcionario[2] = new Funcionario("Zayn", "zaynmalik@gmail.com","9411155544", "UX/UI design", 3500.00, "21/04/2018", "5444585", false);
        funcionario[3] = new Funcionario("Niall", "irishmate@gmail.com","9987441144", "Analista de dados", 4500.00, "14/02/2022", "22554169", true);
        funcionario[4] = new Funcionario("Liam", "liampayne@gmail.com","9986666333", "Desenvolvedor front end", 3500.00, "05/05/2021", "89745615", true);



        for (int i=0; i <funcionario.length; i++){
            System.out.println("Funcionario " + (i+1) + ":" + "\nNome: " + funcionario[i].getNome() + "\nDepartamento: " + funcionario[i].getDepartamento() + "\nTrabalha na empresa?: " + funcionario[i].isFuncionarioEstaNaEmpresa() );
            System.out.println("---------------------------------------");
        }

        //revisar que se puede hacer aqui
        Empresa empresa = new Empresa("Minha Empresa", "123456789", 5);
        empresa.adicionarFuncionario(funcionario[0]);
        empresa.adicionarFuncionario(funcionario[1]);
        empresa.adicionarFuncionario(funcionario[2]);
        empresa.adicionarFuncionario(funcionario[3]);
        empresa.adicionarFuncionario(funcionario[4]);
        //**for (int i = 0; i < funcionario.length; i++) {
            //empresa.adicionarFuncionario(funcionario[i]);
        //}
    }
}
