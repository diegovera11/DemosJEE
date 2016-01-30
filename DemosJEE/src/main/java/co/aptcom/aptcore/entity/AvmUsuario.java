package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the avm_usuario database table.
 * 
 */
@Entity
@Table(name="avm_usuario")
@NamedQuery(name="AvmUsuario.findAll", query="SELECT a FROM AvmUsuario a")
public class AvmUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="usuario_id")
	private int usuarioId;

	private int estado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_reacion")
	private Date fechaReacion;

	@Column(name="otro_nombre")
	private String otroNombre;

	private String password;

	@Column(name="primer_apellido")
	private String primerApellido;

	@Column(name="primer_nombre")
	private String primerNombre;

	@Column(name="segundo_apellido")
	private String segundoApellido;

	private String username;

	@Column(name="usuario_creacion")
	private int usuarioCreacion;

	//bi-directional many-to-one association to AvmUsuarioRol
	@OneToMany(mappedBy="avmUsuario")
	private List<AvmUsuarioRol> avmUsuarioRols;

	public AvmUsuario() {
	}

	public int getUsuarioId() {
		return this.usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Date getFechaReacion() {
		return this.fechaReacion;
	}

	public void setFechaReacion(Date fechaReacion) {
		this.fechaReacion = fechaReacion;
	}

	public String getOtroNombre() {
		return this.otroNombre;
	}

	public void setOtroNombre(String otroNombre) {
		this.otroNombre = otroNombre;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPrimerApellido() {
		return this.primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getPrimerNombre() {
		return this.primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoApellido() {
		return this.segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
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
		avmUsuarioRol.setAvmUsuario(this);

		return avmUsuarioRol;
	}

	public AvmUsuarioRol removeAvmUsuarioRol(AvmUsuarioRol avmUsuarioRol) {
		getAvmUsuarioRols().remove(avmUsuarioRol);
		avmUsuarioRol.setAvmUsuario(null);

		return avmUsuarioRol;
	}

}