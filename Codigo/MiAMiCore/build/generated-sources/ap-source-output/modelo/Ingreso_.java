package modelo;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Inscripcion;
import modelo.Mensualidad;
import modelo.Promociones;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-20T18:30:34")
@StaticMetamodel(Ingreso.class)
public class Ingreso_ { 

    public static volatile SingularAttribute<Ingreso, String> descripcion;
    public static volatile SingularAttribute<Ingreso, Date> fecha;
    public static volatile SingularAttribute<Ingreso, BigDecimal> monto;
    public static volatile ListAttribute<Ingreso, Inscripcion> inscripcionList;
    public static volatile ListAttribute<Ingreso, Mensualidad> mensualidadList;
    public static volatile SingularAttribute<Ingreso, Integer> id;
    public static volatile SingularAttribute<Ingreso, Promociones> idPromocion;

}