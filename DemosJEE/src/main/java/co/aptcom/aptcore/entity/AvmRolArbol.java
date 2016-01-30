package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the avm_rol_arbol database table.
 * 
 */
@Entity
@Table(name="avm_rol_arbol")
@NamedQuery(name="AvmRolArbol.findAll", query="SELECT a FROM AvmRolArbol a")
public class AvmRolArbol implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AvmRolArbolPK id;

	private String activo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_creacion")
	private Date fechaCreacion;

	@Column(name="usuario_creacion")
	private int usuarioCreacion;

	//bi-directional many-to-one association to AvmRol
	@ManyToOne
	@JoinColumn(name="rol_padre_id")
	private AvmRol avmRol1;

	//bi-directional many-to-one association to AvmRol
	@ManyToOne
	@JoinColumn(name="rol_hijo_id")
	private AvmRol avmRol2;

	public AvmRolArbol() {
	}

	public AvmRolArbolPK getId() {
		return this.id;
	}

	public void setId(AvmRolArbolPK id) {
		this.id = id;
	}

	public String getActivo() {
		return this.activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public int getUsuarioCreacion() {
		return this.usuarioCreacion;
	}

	public void setUsuarioCreacion(int usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public AvmRol getAvmRol1() {
		return this.avmRol1;
	}

	public void setAvmRol1(AvmRol avmRol1) {
		this.avmRol1 = avmRol1;
	}

	public AvmRol getAvmRol2() {
		return this.avmRol2;
	}

	public void setAvmRol2(AvmRol avmRol2) {
		this.avmRol2 = avmRol2;
	}

}