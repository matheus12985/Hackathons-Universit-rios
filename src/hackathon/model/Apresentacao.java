package hackathon.model;

import java.util.List;

public class Apresentacao {
    private Projeto projeto;
    private Banca banca;
    private List<Double> notas;

    public Apresentacao(Projeto projeto, Banca banca, List<Double> notas) {
        this.projeto = projeto;
        this.banca = banca;
        this.notas = notas;
    }

    public double calcularNotaFinal() {
        return notas.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }
}