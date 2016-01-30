package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the avm_menu database table.
 * 
 */
@Entity
@Table(name="avm_menu")
@NamedQuery(name="AvmMenu.findAll", query="SELECT a FROM AvmMenu a")
public class AvmMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="menu_id")
	private int menuId;

	private String activo;

	@Lob
	private String descripcion;

	private String estilo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_creacion")
	private Date fechaCreacion;

	private String label;

	private int orden;

	@Column(name="usuario_creacion")
	private int usuarioCreacion;

	//bi-directional many-to-one association to AvmModulo
	@ManyToOne
	@JoinColumn(name="modulo_id")
	private AvmModulo avmModulo;

	public AvmMenu() {
	}

	public int getMenuId() {
		return this.menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
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

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getOrden() {
		return this.orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public int getUsuarioCreacion() {
		return this.usuarioCreacion;
	}

	public void setUsuarioCreacion(int usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public AvmModulo getAvmModulo() {
		return this.avmModulo;
	}

	public void setAvmModulo(AvmModulo avmModulo) {
		this.avmModulo = avmModulo;
	}

}