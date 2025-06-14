package hackathon.model;

public class Projeto {
    private String nome;
    private Equipe equipe;
    private double notaFinal;

    public Projeto(String nome, Equipe equipe) {
        this.nome = nome;
        this.equipe = equipe;
    }

    public String getNome() {
        return nome;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setNotaFinal(double nota) {
        this.notaFinal = nota;
    }

    public double getNotaFinal() {
        return notaFinal;
    }
}