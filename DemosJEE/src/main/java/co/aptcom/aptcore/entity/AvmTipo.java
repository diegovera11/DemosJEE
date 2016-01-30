package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the avm_tipo database table.
 * 
 */
@Entity
@Table(name="avm_tipo")
@NamedQuery(name="AvmTipo.findAll", query="SELECT a FROM AvmTipo a")
public class AvmTipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="tipo_id")
	private int tipoId;

	private String activo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_creacion")
	private Date fechaCreacion;

	private String funcion;

	@Column(name="tipo_nombre")
	private String tipoNombre;

	@Column(name="usuario_creacion")
	private int usuarioCreacion;

	//bi-directional many-to-one association to AvmItemTipo
	@OneToMany(mappedBy="avmTipo")
	private List<AvmItemTipo> avmItemTipos;

	public AvmTipo() {
	}

	public int getTipoId() {
		return this.tipoId;
	}

	public void setTipoId(int tipoId) {
		this.tipoId = tipoId;
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

	public String getFuncion() {
		return this.funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	public String getTipoNombre() {
		return this.tipoNombre;
	}

	public void setTipoNombre(String tipoNombre) {
		this.tipoNombre = tipoNombre;
	}

	public int getUsuarioCreacion() {
		return this.usuarioCreacion;
	}

	public void setUsuarioCreacion(int usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public List<AvmItemTipo> getAvmItemTipos() {
		return this.avmItemTipos;
	}

	public void setAvmItemTipos(List<AvmItemTipo> avmItemTipos) {
		this.avmItemTipos = avmItemTipos;
	}

	public AvmItemTipo addAvmItemTipo(AvmItemTipo avmItemTipo) {
		getAvmItemTipos().add(avmItemTipo);
		avmItemTipo.setAvmTipo(this);

		return avmItemTipo;
	}

	public AvmItemTipo removeAvmItemTipo(AvmItemTipo avmItemTipo) {
		getAvmItemTipos().remove(avmItemTipo);
		avmItemTipo.setAvmTipo(null);

		return avmItemTipo;
	}

}