package hackathon.model;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nome;
    private List<Aluno> alunos;

    public Equipe(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public String getNome() {
        return nome;
    }
}