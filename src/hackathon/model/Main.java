package hackathon.model;

import hackathon.controller.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Equipes equipes = Equipes.getInstancia();
        Projetos projetos = Projetos.getInstancia();
        Apresentacoes apresentacoes = Apresentacoes.getInstancia();

        // Criar equipes
        for (int i = 1; i <= 2; i++) {
            Equipe equipe = new Equipe("Equipe " + i);
            for (int j = 1; j <= 5; j++) {
                equipe.adicionarAluno(new Aluno("Aluno" + j + "_Eq" + i));
            }
            equipes.adicionar(equipe);

            Projeto projeto = new Projeto("Projeto " + i, equipe);
            projetos.adicionar(projeto);

            Banca banca = new Banca();
            List<Double> notas = new ArrayList<>();
            for (int k = 1; k <= 4; k++) {
                banca.adicionarJurado(new Jurado("Jurado" + k + "_P" + i));
                notas.add(6.0 + i); // notas diferentes para projetos
            }

            Apresentacao apresentacao = new Apresentacao(projeto, banca, notas);
            double notaFinal = apresentacao.calcularNotaFinal();
            projeto.setNotaFinal(notaFinal);
            apresentacoes.adicionar(apresentacao);
        }

        // Filtrar e exibir projetos com nota >= 7
        projetos.getProjetos().stream()
            .filter(p -> p.getNotaFinal() >= 7)
            .forEach(p -> System.out.println(p.getNome() + ": Nota Final = " + p.getNotaFinal()));
    }
}