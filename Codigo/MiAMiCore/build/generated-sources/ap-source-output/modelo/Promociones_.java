package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Ingreso;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-20T18:30:34")
@StaticMetamodel(Promociones.class)
public class Promociones_ { 

    public static volatile SingularAttribute<Promociones, String> descripcion;
    public static volatile ListAttribute<Promociones, Ingreso> ingresoList;
    public static volatile SingularAttribute<Promociones, String> aplicaPara;
    public static volatile SingularAttribute<Promociones, Integer> porcentajeDescuento;
    public static volatile SingularAttribute<Promociones, String> titulo;
    public static volatile SingularAttribute<Promociones, Integer> id;
    public static volatile SingularAttribute<Promociones, Boolean> activo;

}