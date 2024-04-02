package domain.validador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombreCompleto;
    private String legajo;
    private List<Materia> materiasAprobadas;
    private List<Materia> materiasAInscribir;

    // getters y constructores para los atributos de tipo lista

    public Alumno() {
        this.materiasAprobadas = new ArrayList<>();
        this.materiasAInscribir = new ArrayList<>();
    }
    public List<Materia> getMateriasAInscribir() {
        return materiasAInscribir;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = new ArrayList<>();
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    /////////////////
    public void agregarMateriasAprobadas(Materia ... materias){
        Collections.addAll(this.materiasAprobadas, materias);
    }
}
