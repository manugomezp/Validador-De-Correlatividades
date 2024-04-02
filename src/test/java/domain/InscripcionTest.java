package domain;


import domain.validador.Alumno;
import domain.validador.Inscripcion;
import domain.validador.Materia;
import org.junit.Assert;
import org.junit.Test;

public class InscripcionTest {
    @Test

     public void inscripcionAceptadaConCorrelativas(){
    // materias correlativas aprobadas por el alumno
        Materia AyED       = new Materia();
        Materia Discreta   = new Materia();

    // materias a las que se quiere inscribir
        Materia PdP        = new Materia();
        Materia SSL        = new Materia();

        Inscripcion unaInscripcion = new Inscripcion();

        SSL.agregarCorrelativa(AyED, Discreta);
        PdP.agregarCorrelativa(AyED, Discreta);

        Alumno Manu = new Alumno();
        Manu.agregarMateriasAprobadas(AyED, Discreta);

        Assert.assertTrue("El alumno cumple con la/s correlativa/s necesarias y por lo tanto puede cursar la/s materia/s",unaInscripcion.aprobada(Manu));
    }

    @Test
    public void inscripcionAceptadaSinCorrelativas(){
        Materia AyED       = new Materia();
        Materia Discreta   = new Materia();

        Inscripcion unaInscripcion = new Inscripcion();

        Alumno Manu = new Alumno();
        Assert.assertTrue("El alumno puede cursar la/s materia/s ya que esta/s no tiene/n correlativa/s.",unaInscripcion.aprobada(Manu));

    }

    @Test
    public void inscripcionRechazada() {
        Materia AyED       = new Materia();
        Materia Discreta   = new Materia();
        // materia que quiere cursar
        Materia SSL        = new Materia();

        Inscripcion unaInscripcion = new Inscripcion();

        SSL.agregarCorrelativa(AyED, Discreta);

        Alumno Manu = new Alumno();
        Manu.agregarMateriasAprobadas(AyED);

        Assert.assertFalse("El alumno no cumple con la correlatividad.",unaInscripcion.aprobada(Manu));
    }
}

