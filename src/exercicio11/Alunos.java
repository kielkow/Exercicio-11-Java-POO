package exercicio11;

import javax.swing.JOptionPane;

public class Alunos {
    
    private String nome;
    private int matricula;
    private String curso;

    
    
    
    public Alunos(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    public Alunos() {
    }

    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
    public void registroAluno(){
        this.setNome(JOptionPane.showInputDialog("Digite o nome do aluno:"));
        this.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de matricula:")));
        this.setCurso(JOptionPane.showInputDialog("Digite o nome do curso:"));
    }
    public void status(){
        JOptionPane.showMessageDialog(null, "Nome: "+this.getNome() + "\n" +
                                            "Matricula: "+this.getMatricula() + "\n" +
                                            "Curso: "  +this.getCurso()               );
    }
    public void alterarCurso(){
        this.setCurso(JOptionPane.showInputDialog("Digite o nome do novo curso:"));
    }
    
}
