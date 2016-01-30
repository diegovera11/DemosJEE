package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the avm_rol database table.
 * 
 */
@Entity
@Table(name="avm_rol")
@NamedQuery(name="AvmRol.findAll", query="SELECT a FROM AvmRol a")
public class AvmRol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="rol_id")
	private int rolId;

	private String activo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_creacion")
	private Date fechaCreacion;

	@Lob
	@Column(name="rol_descripcion")
	private String rolDescripcion;

	@Column(name="rol_nombre")
	private String rolNombre;

	@Column(name="usuario_creacion")
	private int usuarioCreacion;

	//bi-directional many-to-one association to AvmRolArbol
	@OneToMany(mappedBy="avmRol1")
	private List<AvmRolArbol> avmRolArbols1;

	//bi-directional many-to-one association to AvmRolArbol
	@OneToMany(mappedBy="avmRol2")
	private List<AvmRolArbol> avmRolArbols2;

	//bi-directional many-to-one association to AvmRolRecurso
	@OneToMany(mappedBy="avmRol")
	private List<AvmRolRecurso> avmRolRecursos;

	//bi-directional many-to-one association to AvmUsuarioRol
	@OneToMany(mappedBy="avmRol")
	private List<AvmUsuarioRol> avmUsuarioRols;

	public AvmRol() {
	}

	public int getRolId() {
		return this.rolId;
	}

	public void setRolId(int rolId) {
		this.rolId = rolId;
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

	public String getRolDescripcion() {
		return this.rolDescripcion;
	}

	public void setRolDescripcion(String rolDescripcion) {
		this.rolDescripcion = rolDescripcion;
	}

	public String getRolNombre() {
		return this.rolNombre;
	}

	public void setRolNombre(String rolNombre) {
		this.rolNombre = rolNombre;
	}

	public int getUsuarioCreacion() {
		return this.usuarioCreacion;
	}

	public void setUsuarioCreacion(int usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public List<AvmRolArbol> getAvmRolArbols1() {
		return this.avmRolArbols1;
	}

	public void setAvmRolArbols1(List<AvmRolArbol> avmRolArbols1) {
		this.avmRolArbols1 = avmRolArbols1;
	}

	public AvmRolArbol addAvmRolArbols1(AvmRolArbol avmRolArbols1) {
		getAvmRolArbols1().add(avmRolArbols1);
		avmRolArbols1.setAvmRol1(this);

		return avmRolArbols1;
	}

	public AvmRolArbol removeAvmRolArbols1(AvmRolArbol avmRolArbols1) {
		getAvmRolArbols1().remove(avmRolArbols1);
		avmRolArbols1.setAvmRol1(null);

		return avmRolArbols1;
	}

	public List<AvmRolArbol> getAvmRolArbols2() {
		return this.avmRolArbols2;
	}

	public void setAvmRolArbols2(List<AvmRolArbol> avmRolArbols2) {
		this.avmRolArbols2 = avmRolArbols2;
	}

	public AvmRolArbol addAvmRolArbols2(AvmRolArbol avmRolArbols2) {
		getAvmRolArbols2().add(avmRolArbols2);
		avmRolArbols2.setAvmRol2(this);

		return avmRolArbols2;
	}

	public AvmRolArbol removeAvmRolArbols2(AvmRolArbol avmRolArbols2) {
		getAvmRolArbols2().remove(avmRolArbols2);
		avmRolArbols2.setAvmRol2(null);

		return avmRolArbols2;
	}

	public List<AvmRolRecurso> getAvmRolRecursos() {
		return this.avmRolRecursos;
	}

	public void setAvmRolRecursos(List<AvmRolRecurso> avmRolRecursos) {
		this.avmRolRecursos = avmRolRecursos;
	}

	public AvmRolRecurso addAvmRolRecurso(AvmRolRecurso avmRolRecurso) {
		getAvmRolRecursos().add(avmRolRecurso);
		avmRolRecurso.setAvmRol(this);

		return avmRolRecurso;
	}

	public AvmRolRecurso removeAvmRolRecurso(AvmRolRecurso avmRolRecurso) {
		getAvmRolRecursos().remove(avmRolRecurso);
		avmRolRecurso.setAvmRol(null);

		return avmRolRecurso;
	}

	public List<AvmUsuarioRol> getAvmUsuarioRols() {
		return this.avmUsuarioRols;
	}

	public void setAvmUsuarioRols(List<AvmUsuarioRol> avmUsuarioRols) {
		this.avmUsuarioRols = avmUsuarioRols;
	}

	public AvmUsuarioRol addAvmUsuarioRol(AvmUsuarioRol avmUsuarioRol) {
		getAvmUsuarioRols().add(avmUsuarioRol);
		avmUsuarioRol.setAvmRol(this);

		return avmUsuarioRol;
	}

	public AvmUsuarioRol removeAvmUsuarioRol(AvmUsuarioRol avmUsuarioRol) {
		getAvmUsuarioRols().remove(avmUsuarioRol);
		avmUsuarioRol.setAvmRol(null);

		return avmUsuarioRol;
	}

}