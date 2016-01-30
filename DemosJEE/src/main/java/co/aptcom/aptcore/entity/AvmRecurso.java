package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the avm_recurso database table.
 * 
 */
@Entity
@Table(name="avm_recurso")
@NamedQuery(name="AvmRecurso.findAll", query="SELECT a FROM AvmRecurso a")
public class AvmRecurso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="recurso_id")
	private int recursoId;

	private String activo;

	@Lob
	private String descripcion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_creacion")
	private Date fechaCreacion;

	private String nombre;

	@Column(name="usuario_creacion")
	private int usuarioCreacion;

	//bi-directional many-to-one association to AvmOpcion
	@OneToMany(mappedBy="avmRecurso")
	private List<AvmOpcion> avmOpcions;

	//bi-directional many-to-one association to AvmItemTipo
	@ManyToOne
	@JoinColumn(name="tipo_recurso_id")
	private AvmItemTipo avmItemTipo;

	//bi-directional many-to-one association to AvmRolRecurso
	@OneToMany(mappedBy="avmRecurso")
	private List<AvmRolRecurso> avmRolRecursos;

	public AvmRecurso() {
	}

	public int getRecursoId() {
		return this.recursoId;
	}

	public void setRecursoId(int recursoId) {
		this.recursoId = recursoId;
	}

	public String getActivo() {
		return this.activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	public List<AvmOpcion> getAvmOpcions() {
		return this.avmOpcions;
	}

	public void setAvmOpcions(List<AvmOpcion> avmOpcions) {
		this.avmOpcions = avmOpcions;
	}

	public AvmOpcion addAvmOpcion(AvmOpcion avmOpcion) {
		getAvmOpcions().add(avmOpcion);
		avmOpcion.setAvmRecurso(this);

		return avmOpcion;
	}

	public AvmOpcion removeAvmOpcion(AvmOpcion avmOpcion) {
		getAvmOpcions().remove(avmOpcion);
		avmOpcion.setAvmRecurso(null);

		return avmOpcion;
	}

	public AvmItemTipo getAvmItemTipo() {
		return this.avmItemTipo;
	}

	public void setAvmItemTipo(AvmItemTipo avmItemTipo) {
		this.avmItemTipo = avmItemTipo;
	}

	public List<AvmRolRecurso> getAvmRolRecursos() {
		return this.avmRolRecursos;
	}

	public void setAvmRolRecursos(List<AvmRolRecurso> avmRolRecursos) {
		this.avmRolRecursos = avmRolRecursos;
	}

	public AvmRolRecurso addAvmRolRecurso(AvmRolRecurso avmRolRecurso) {
		getAvmRolRecursos().add(avmRolRecurso);
		avmRolRecurso.setAvmRecurso(this);

		return avmRolRecurso;
	}

	public AvmRolRecurso removeAvmRolRecurso(AvmRolRecurso avmRolRecurso) {
		getAvmRolRecursos().remove(avmRolRecurso);
		avmRolRecurso.setAvmRecurso(null);

		return avmRolRecurso;
	}

}