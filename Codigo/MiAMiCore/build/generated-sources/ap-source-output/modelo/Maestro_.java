package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.GrupoClase;
import modelo.Pagodesalario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-20T18:30:34")
@StaticMetamodel(Maestro.class)
public class Maestro_ { 

    public static volatile SingularAttribute<Maestro, String> apellidos;
    public static volatile SingularAttribute<Maestro, String> correo;
    public static volatile ListAttribute<Maestro, Pagodesalario> pagodesalarioList;
    public static volatile SingularAttribute<Maestro, Integer> id;
    public static volatile SingularAttribute<Maestro, String> telefono;
    public static volatile SingularAttribute<Maestro, String> nombre;
    public static volatile ListAttribute<Maestro, GrupoClase> grupoClaseList;
    public static volatile SingularAttribute<Maestro, Boolean> activo;

}