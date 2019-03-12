package modelo;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Gastovariable;
import modelo.Pagodesalario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-20T18:30:34")
@StaticMetamodel(Egreso.class)
public class Egreso_ { 

    public static volatile SingularAttribute<Egreso, String> descripcion;
    public static volatile SingularAttribute<Egreso, Date> fecha;
    public static volatile SingularAttribute<Egreso, BigDecimal> monto;
    public static volatile SingularAttribute<Egreso, Pagodesalario> pagodesalario;
    public static volatile SingularAttribute<Egreso, Integer> id;
    public static volatile ListAttribute<Egreso, Gastovariable> gastovariableList;

}