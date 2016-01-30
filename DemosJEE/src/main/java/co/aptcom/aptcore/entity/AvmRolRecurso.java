package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the avm_rol_recurso database table.
 * 
 */
@Entity
@Table(name="avm_rol_recurso")
@NamedQuery(name="AvmRolRecurso.findAll", query="SELECT a FROM AvmRolRecurso a")
public class AvmRolRecurso implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AvmRolRecursoPK id;

	private String activo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_creacion")
	private Date fechaCreacion;

	@Column(name="usuario_creacion")
	private int usuarioCreacion;

	//bi-directional many-to-one association to AvmRol
	@ManyToOne
	@JoinColumn(name="rol_id")
	private AvmRol avmRol;

	//bi-directional many-to-one association to AvmRecurso
	@ManyToOne
	@JoinColumn(name="recurso_id")
	private AvmRecurso avmRecurso;

	public AvmRolRecurso() {
	}

	public AvmRolRecursoPK getId() {
		return this.id;
	}

	public void setId(AvmRolRecursoPK id) {
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

	public AvmRol getAvmRol() {
		return this.avmRol;
	}

	public void setAvmRol(AvmRol avmRol) {
		this.avmRol = avmRol;
	}

	public AvmRecurso getAvmRecurso() {
		return this.avmRecurso;
	}

	public void setAvmRecurso(AvmRecurso avmRecurso) {
		this.avmRecurso = avmRecurso;
	}

}