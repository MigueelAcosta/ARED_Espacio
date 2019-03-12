package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.GrupoClase;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-20T18:30:34")
@StaticMetamodel(TipoDanza.class)
public class TipoDanza_ { 

    public static volatile SingularAttribute<TipoDanza, String> descripcion;
    public static volatile SingularAttribute<TipoDanza, Integer> id;
    public static volatile SingularAttribute<TipoDanza, String> nombre;
    public static volatile ListAttribute<TipoDanza, GrupoClase> grupoClaseList;
    public static volatile SingularAttribute<TipoDanza, Boolean> activo;

}