package modelo;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Alumno;
import modelo.Asistencia;
import modelo.Horario;
import modelo.Maestro;
import modelo.Mensualidad;
import modelo.TipoDanza;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-20T18:30:34")
@StaticMetamodel(GrupoClase.class)
public class GrupoClase_ { 

    public static volatile SingularAttribute<GrupoClase, Boolean> terminado;
    public static volatile SingularAttribute<GrupoClase, Float> porcentajeGananciaMaestro;
    public static volatile SingularAttribute<GrupoClase, TipoDanza> idTipoDanza;
    public static volatile SingularAttribute<GrupoClase, Maestro> idMaestro;
    public static volatile SingularAttribute<GrupoClase, String> fechaTermino;
    public static volatile ListAttribute<GrupoClase, Mensualidad> mensualidadList;
    public static volatile ListAttribute<GrupoClase, Alumno> alumnoList;
    public static volatile SingularAttribute<GrupoClase, Integer> id;
    public static volatile SingularAttribute<GrupoClase, BigDecimal> costoMensual;
    public static volatile ListAttribute<GrupoClase, Asistencia> asistenciaList;
    public static volatile SingularAttribute<GrupoClase, Boolean> activo;
    public static volatile ListAttribute<GrupoClase, Horario> horarioList;

}