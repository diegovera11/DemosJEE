package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the avm_usuario_rol database table.
 * 
 */
@Entity
@Table(name="avm_usuario_rol")
@NamedQuery(name="AvmUsuarioRol.findAll", query="SELECT a FROM AvmUsuarioRol a")
public class AvmUsuarioRol implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AvmUsuarioRolPK id;

	private String activo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_creacion")
	private Date fechaCreacion;

	@Column(name="usuario_creacion")
	private int usuarioCreacion;

	//bi-directional many-to-one association to AvmPerfil
	@ManyToOne
	@JoinColumn(name="perfil_id")
	private AvmPerfil avmPerfil;

	//bi-directional many-to-one association to AvmRol
	@ManyToOne
	@JoinColumn(name="rol_id")
	private AvmRol avmRol;

	//bi-directional many-to-one association to AvmUsuario
	@ManyToOne
	@JoinColumn(name="usuario_id")
	private AvmUsuario avmUsuario;

	public AvmUsuarioRol() {
	}

	public AvmUsuarioRolPK getId() {
		return this.id;
	}

	public void setId(AvmUsuarioRolPK id) {
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

	public AvmPerfil getAvmPerfil() {
		return this.avmPerfil;
	}

	public void setAvmPerfil(AvmPerfil avmPerfil) {
		this.avmPerfil = avmPerfil;
	}

	public AvmRol getAvmRol() {
		return this.avmRol;
	}

	public void setAvmRol(AvmRol avmRol) {
		this.avmRol = avmRol;
	}

	public AvmUsuario getAvmUsuario() {
		return this.avmUsuario;
	}

	public void setAvmUsuario(AvmUsuario avmUsuario) {
		this.avmUsuario = avmUsuario;
	}

}