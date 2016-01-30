package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the avm_modulo database table.
 * 
 */
@Entity
@Table(name="avm_modulo")
@NamedQuery(name="AvmModulo.findAll", query="SELECT a FROM AvmModulo a")
public class AvmModulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="modulo_id")
	private int moduloId;

	private String activo;

	@Lob
	private String descripcion;

	private String estilo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_creacion")
	private Date fechaCreacion;

	private String nombre;

	@Column(name="usuario_creacion")
	private int usuarioCreacion;

	//bi-directional many-to-one association to AvmMenu
	@OneToMany(mappedBy="avmModulo")
	private List<AvmMenu> avmMenus;

	public AvmModulo() {
	}

	public int getModuloId() {
		return this.moduloId;
	}

	public void setModuloId(int moduloId) {
		this.moduloId = moduloId;
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

	public String getEstilo() {
		return this.estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
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

	public List<AvmMenu> getAvmMenus() {
		return this.avmMenus;
	}

	public void setAvmMenus(List<AvmMenu> avmMenus) {
		this.avmMenus = avmMenus;
	}

	public AvmMenu addAvmMenus(AvmMenu avmMenus) {
		getAvmMenus().add(avmMenus);
		avmMenus.setAvmModulo(this);

		return avmMenus;
	}

	public AvmMenu removeAvmMenus(AvmMenu avmMenus) {
		getAvmMenus().remove(avmMenus);
		avmMenus.setAvmModulo(null);

		return avmMenus;
	}

}