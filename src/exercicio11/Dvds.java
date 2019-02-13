package exercicio11;

import javax.swing.JOptionPane;

public class Dvds {
    
    private String titulo;
    private String produtor;
    private int ano;
    private String sinopse;
    private double valor;
    private int classificacao;
    private String tipo;
    private String status;

    
    
    
    public Dvds(String titulo, String produtor, int ano, String sinopse, double valor, int classificacao, String tipo, String status) {
        this.titulo = titulo;
        this.produtor = produtor;
        this.ano = ano;
        this.sinopse = sinopse;
        this.valor = valor;
        this.classificacao = classificacao;
        this.tipo = tipo;
        this.status = status;
    }
    public Dvds() {
    }

    
    
    
    
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
     public void registroDvd(){
        this.setTitulo(JOptionPane.showInputDialog("Digite o nome do titulo:"));
        this.setProdutor(JOptionPane.showInputDialog("Digite o nome do Produtor:"));
        this.setSinopse(JOptionPane.showInputDialog("Digite a Sinopse:"));
        this.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de lançamento:")));
        this.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço (R$):")));
        this.setClassificacao(Integer.parseInt(JOptionPane.showInputDialog("Digite a classificação:")));
        this.setTipo(JOptionPane.showInputDialog("Digite o tipo:"));
        String s = JOptionPane.showInputDialog("O filme está alocado? ");
        if(s.equals("sim")){
            this.setStatus("indisponível");
        }
        else{
            this.setStatus("disponível");
        }
    }
    public void status(){
        JOptionPane.showMessageDialog(null, "Titulo: "+this.getTitulo() + "\n" +
                                            "Produtor: "+this.getProdutor() + "\n" +
                                            "Sinopse: "  +this.getSinopse() + "\n" +
                                            "Ano: " + this.getAno() + "\n" +
                                            "Preço: " + this.getValor() + "\n" +
                                            "Classificação: " + this.getClassificacao() + "\n" +
                                            "Tipo: " + this.getTipo() + "\n" +
                                            "Status: " + this.getStatus());
    }
    public void alterar(){
        this.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual: ")));
        this.setTipo(JOptionPane.showInputDialog("Digite o tipo do filme: "));
        this.setStatus(JOptionPane.showInputDialog("Digite o status do filme: "));
    }
    
}
