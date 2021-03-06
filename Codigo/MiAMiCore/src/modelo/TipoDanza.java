/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author macbookpro
 */
@Entity
@Table(name = "tipoDanza")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoDanza.findAll", query = "SELECT t FROM TipoDanza t WHERE t.activo = 1")
    , @NamedQuery(name = "TipoDanza.findById", query = "SELECT t FROM TipoDanza t WHERE t.id = :id")
    , @NamedQuery(name = "TipoDanza.findByDescripcion", query = "SELECT t FROM TipoDanza t WHERE t.descripcion = :descripcion")
    , @NamedQuery(name = "TipoDanza.findByNombre", query = "SELECT t FROM TipoDanza t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TipoDanza.findByActivo", query = "SELECT t FROM TipoDanza t WHERE t.activo = :activo")})
public class TipoDanza implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "activo")
    private boolean activo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoDanza")
    private List<GrupoClase> grupoClaseList;

    public TipoDanza() {
    }

    public TipoDanza(Integer id) {
        this.id = id;
    }

    public TipoDanza(Integer id, String descripcion, String nombre, boolean activo) {
        this.id = id;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.activo = activo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @XmlTransient
    public List<GrupoClase> getGrupoClaseList() {
        return grupoClaseList;
    }

    public void setGrupoClaseList(List<GrupoClase> grupoClaseList) {
        this.grupoClaseList = grupoClaseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDanza)) {
            return false;
        }
        TipoDanza other = (TipoDanza) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.TipoDanza[ id=" + id + " ]";
    }
    
}
