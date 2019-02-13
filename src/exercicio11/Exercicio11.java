package exercicio11;

public class Exercicio11 {

    public static void main(String[] args) {
        
        Alunos aluno = new Alunos();
        Funcionarios funcionario = new Funcionarios();
        Dvds dvd = new Dvds();
        
        aluno.registroAluno();
        aluno.status();
        aluno.alterarCurso();
        aluno.status();
        
        funcionario.registroFuncionario();
        funcionario.status();
        funcionario.alterarIdade();
        funcionario.status();
       
        dvd.registroDvd();
        dvd.status();
        dvd.alterar();
        dvd.status();
    }
    
}
