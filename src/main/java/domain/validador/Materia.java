package domain.validador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia() {
        this.correlativas = new ArrayList<>();
    }
    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){return this.nombre;}

    public boolean esCorrelativa(Materia correlativa){
        return this.correlativas.contains(correlativa);
    }
    public void agregarCorrelativa(Materia ... correlativas){
         Collections.addAll(this.correlativas, correlativas);
    }




}
