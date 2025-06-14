package hackathon.model;

import java.util.ArrayList;
import java.util.List;

public class Banca {
    private List<Jurado> jurados;

    public Banca() {
        this.jurados = new ArrayList<>();
    }

    public void adicionarJurado(Jurado jurado) {
        jurados.add(jurado);
    }

    public List<Jurado> getJurados() {
        return jurados;
    }
}