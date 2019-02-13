package exercicio11;

import javax.swing.JOptionPane;

public class Funcionarios {
    
    private String nome;
    private int registro;
    private String departamento;
    private int idade;

    
    
    
    
    public Funcionarios(String nome, int registro, String departamento, int idade) {
        this.nome = nome;
        this.registro = registro;
        this.departamento = departamento;
        this.idade = idade;
    }
    public Funcionarios() {
    }

    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    public void registroFuncionario(){
        this.setNome(JOptionPane.showInputDialog("Digite o nome do funcionario:"));
        this.setRegistro(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de registro:")));
        this.setDepartamento(JOptionPane.showInputDialog("Digite o nome do departamento:"));
        this.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do funcionario:")));
    }
    public void status(){
        JOptionPane.showMessageDialog(null, "Nome: "+this.getNome() + "\n" +
                                            "Registro: "+this.getRegistro() + "\n" +
                                            "Departamento: "  +this.getDepartamento() + "\n" +
                                            "Idade: " + this.getIdade());
    }
    public void alterarIdade(){
        this.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade atual do funcionario:")));
    }
    
}
