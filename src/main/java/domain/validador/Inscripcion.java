package domain.validador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    public boolean correlativasAprobadas(Alumno unAlumno, Materia unaMateria){
        List<Materia> correlativasQueAprobo = unAlumno.getMateriasAprobadas()
                .stream()
                .filter(a -> a.esCorrelativa(unaMateria))
                .toList();
        List<Materia> susCorrelativas = unaMateria.getCorrelativas();

        return correlativasQueAprobo == susCorrelativas;
    }

    public boolean aprobada(Alumno unAlumno){
       return  unAlumno.getMateriasAInscribir()
               .stream()
               .allMatch(materiaAInscribir -> this.correlativasAprobadas(unAlumno, materiaAInscribir));
    }

}
