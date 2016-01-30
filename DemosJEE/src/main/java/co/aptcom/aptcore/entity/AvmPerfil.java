package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the avm_perfil database table.
 * 
 */
@Entity
@Table(name="avm_perfil")
@NamedQuery(name="AvmPerfil.findAll", query="SELECT a FROM AvmPerfil a")
public class AvmPerfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="perfil_id")
	private int perfilId;

	private String activo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_creacion")
	private Date fechaCreacion;

	private String nombre;

	@Column(name="usuario_creacion")
	private int usuarioCreacion;

	//bi-directional many-to-one association to AvmUsuarioRol
	@OneToMany(mappedBy="avmPerfil")
	private List<AvmUsuarioRol> avmUsuarioRols;

	public AvmPerfil() {
	}

	public int getPerfilId() {
		return this.perfilId;
	}

	public void setPerfilId(int perfilId) {
		this.perfilId = perfilId;
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

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getUsuarioCreacion() {
		return this.usuarioCreacion;
	}

	public void setUsuarioCreacion(int usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public List<AvmUsuarioRol> getAvmUsuarioRols() {
		return this.avmUsuarioRols;
	}

	public void setAvmUsuarioRols(List<AvmUsuarioRol> avmUsuarioRols) {
		this.avmUsuarioRols = avmUsuarioRols;
	}

	public AvmUsuarioRol addAvmUsuarioRol(AvmUsuarioRol avmUsuarioRol) {
		getAvmUsuarioRols().add(avmUsuarioRol);
		avmUsuarioRol.setAvmPerfil(this);

		return avmUsuarioRol;
	}

	public AvmUsuarioRol removeAvmUsuarioRol(AvmUsuarioRol avmUsuarioRol) {
		getAvmUsuarioRols().remove(avmUsuarioRol);
		avmUsuarioRol.setAvmPerfil(null);

		return avmUsuarioRol;
	}

}