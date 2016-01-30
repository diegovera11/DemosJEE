package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the avm_opcion database table.
 * 
 */
@Entity
@Table(name="avm_opcion")
@NamedQuery(name="AvmOpcion.findAll", query="SELECT a FROM AvmOpcion a")
public class AvmOpcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="opc_id")
	private int opcId;

	private String activo;

	@Lob
	private String descripcion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_creacion")
	private Date fechaCreacion;

	private String label;

	@Column(name="menu_id")
	private int menuId;

	@Column(name="opc_padre_id")
	private int opcPadreId;

	private int orden;

	@Column(name="url_destino")
	private String urlDestino;

	@Column(name="usuario_creacion")
	private int usuarioCreacion;

	//bi-directional many-to-one association to AvmRecurso
	@ManyToOne
	@JoinColumn(name="recurso_id")
	private AvmRecurso avmRecurso;

	public AvmOpcion() {
	}

	public int getOpcId() {
		return this.opcId;
	}

	public void setOpcId(int opcId) {
		this.opcId = opcId;
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

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getMenuId() {
		return this.menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public int getOpcPadreId() {
		return this.opcPadreId;
	}

	public void setOpcPadreId(int opcPadreId) {
		this.opcPadreId = opcPadreId;
	}

	public int getOrden() {
		return this.orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public String getUrlDestino() {
		return this.urlDestino;
	}

	public void setUrlDestino(String urlDestino) {
		this.urlDestino = urlDestino;
	}

	public int getUsuarioCreacion() {
		return this.usuarioCreacion;
	}

	public void setUsuarioCreacion(int usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public AvmRecurso getAvmRecurso() {
		return this.avmRecurso;
	}

	public void setAvmRecurso(AvmRecurso avmRecurso) {
		this.avmRecurso = avmRecurso;
	}

}