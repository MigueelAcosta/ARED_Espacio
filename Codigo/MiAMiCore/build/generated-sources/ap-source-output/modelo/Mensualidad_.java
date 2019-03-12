package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Alumno;
import modelo.GrupoClase;
import modelo.Ingreso;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-20T18:30:34")
@StaticMetamodel(Mensualidad.class)
public class Mensualidad_ { 

    public static volatile SingularAttribute<Mensualidad, Alumno> idalumno;
    public static volatile SingularAttribute<Mensualidad, Integer> id;
    public static volatile SingularAttribute<Mensualidad, Ingreso> idingreso;
    public static volatile ListAttribute<Mensualidad, GrupoClase> grupoClaseList;

}