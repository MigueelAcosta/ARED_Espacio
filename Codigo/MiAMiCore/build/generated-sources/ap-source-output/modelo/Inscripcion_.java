package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Alumno;
import modelo.Ingreso;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-20T18:30:34")
@StaticMetamodel(Inscripcion.class)
public class Inscripcion_ { 

    public static volatile SingularAttribute<Inscripcion, Alumno> idalumno;
    public static volatile SingularAttribute<Inscripcion, Integer> id;
    public static volatile SingularAttribute<Inscripcion, Ingreso> idingreso;

}