package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Asistencia;
import modelo.GrupoClase;
import modelo.Inscripcion;
import modelo.Mensualidad;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-20T18:30:34")
@StaticMetamodel(Alumno.class)
public class Alumno_ { 

    public static volatile SingularAttribute<Alumno, String> apellidos;
    public static volatile SingularAttribute<Alumno, Date> fechaNacimiento;
    public static volatile ListAttribute<Alumno, Inscripcion> inscripcionList;
    public static volatile ListAttribute<Alumno, Mensualidad> mensualidadList;
    public static volatile SingularAttribute<Alumno, String> telefonoEmergencia;
    public static volatile SingularAttribute<Alumno, String> nombre;
    public static volatile SingularAttribute<Alumno, Date> fechaInscripcion;
    public static volatile ListAttribute<Alumno, Asistencia> asistenciaList;
    public static volatile SingularAttribute<Alumno, String> tipoSangre;
    public static volatile SingularAttribute<Alumno, Date> diapago;
    public static volatile SingularAttribute<Alumno, String> foto;
    public static volatile SingularAttribute<Alumno, String> correo;
    public static volatile SingularAttribute<Alumno, Integer> id;
    public static volatile SingularAttribute<Alumno, String> telefono;
    public static volatile ListAttribute<Alumno, GrupoClase> grupoClaseList;
    public static volatile SingularAttribute<Alumno, Boolean> activo;

}