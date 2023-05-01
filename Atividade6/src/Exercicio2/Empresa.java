package Exercicio2;

public class Empresa {
    private String nomeEmpresa;
    private String cnpj;
    private int qtde_de_funcionario;
    Funcionario[] funcionarios;
    Funcionario func;

    public Empresa(String nomeEmpresa, String cnpj, int qtde_de_funcionario, Funcionario[] funcionarios) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.qtde_de_funcionario = 0;
        this.funcionarios = new Funcionario[qtde_de_funcionario];
    }

    public Empresa(String nomeEmpresa, String cnpj, int qtde_de_funcionario) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.qtde_de_funcionario = qtde_de_funcionario;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getQtde_de_funcionario() {
        return qtde_de_funcionario;
    }

    public void setQtde_de_funcionario(int qtde_de_funcionario) {
        this.qtde_de_funcionario = qtde_de_funcionario;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
    public void adicionarFuncionario(Funcionario funcionario) {
        for (int i = 0; i < qtde_de_funcionario; i++) {
            if (funcionarios[i] == null) {
                funcionarios[i] = funcionario;
                break;
            }
        }
    }
}
