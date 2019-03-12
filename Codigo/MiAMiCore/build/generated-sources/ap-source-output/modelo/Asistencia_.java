package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Alumno;
import modelo.GrupoClase;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-20T18:30:34")
@StaticMetamodel(Asistencia.class)
public class Asistencia_ { 

    public static volatile SingularAttribute<Asistencia, Alumno> idAlumno;
    public static volatile SingularAttribute<Asistencia, GrupoClase> idGrupoClase;
    public static volatile SingularAttribute<Asistencia, Integer> id;
    public static volatile SingularAttribute<Asistencia, Date> dia;

}