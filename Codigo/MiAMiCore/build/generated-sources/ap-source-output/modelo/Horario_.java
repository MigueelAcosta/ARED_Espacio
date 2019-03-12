package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.GrupoClase;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-20T18:30:34")
@StaticMetamodel(Horario.class)
public class Horario_ { 

    public static volatile SingularAttribute<Horario, GrupoClase> idGrupoClase;
    public static volatile SingularAttribute<Horario, Date> horafinal;
    public static volatile SingularAttribute<Horario, Integer> id;
    public static volatile SingularAttribute<Horario, Date> horainicio;
    public static volatile SingularAttribute<Horario, String> dia;

}