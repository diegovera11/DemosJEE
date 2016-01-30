package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the avm_item_tipo database table.
 * 
 */
@Entity
@Table(name="avm_item_tipo")
@NamedQuery(name="AvmItemTipo.findAll", query="SELECT a FROM AvmItemTipo a")
public class AvmItemTipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="item_tipo_id")
	private int itemTipoId;

	private String activo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_creacion")
	private Date fechaCreacion;

	@Lob
	@Column(name="item_tipo_descripcion")
	private String itemTipoDescripcion;

	@Column(name="item_tipo_nombre")
	private String itemTipoNombre;

	@Column(name="usuario_creacion")
	private int usuarioCreacion;

	@Column(name="valor_cadena")
	private String valorCadena;

	@Temporal(TemporalType.DATE)
	@Column(name="valor_fecha")
	private Date valorFecha;

	@Column(name="valor_numerico")
	private BigDecimal valorNumerico;

	//bi-directional many-to-one association to AvmTipo
	@ManyToOne
	@JoinColumn(name="tipo_id")
	private AvmTipo avmTipo;

	//bi-directional many-to-one association to AvmRecurso
	@OneToMany(mappedBy="avmItemTipo")
	private List<AvmRecurso> avmRecursos;

	public AvmItemTipo() {
	}

	public int getItemTipoId() {
		return this.itemTipoId;
	}

	public void setItemTipoId(int itemTipoId) {
		this.itemTipoId = itemTipoId;
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

	public String getItemTipoDescripcion() {
		return this.itemTipoDescripcion;
	}

	public void setItemTipoDescripcion(String itemTipoDescripcion) {
		this.itemTipoDescripcion = itemTipoDescripcion;
	}

	public String getItemTipoNombre() {
		return this.itemTipoNombre;
	}

	public void setItemTipoNombre(String itemTipoNombre) {
		this.itemTipoNombre = itemTipoNombre;
	}

	public int getUsuarioCreacion() {
		return this.usuarioCreacion;
	}

	public void setUsuarioCreacion(int usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public String getValorCadena() {
		return this.valorCadena;
	}

	public void setValorCadena(String valorCadena) {
		this.valorCadena = valorCadena;
	}

	public Date getValorFecha() {
		return this.valorFecha;
	}

	public void setValorFecha(Date valorFecha) {
		this.valorFecha = valorFecha;
	}

	public BigDecimal getValorNumerico() {
		return this.valorNumerico;
	}

	public void setValorNumerico(BigDecimal valorNumerico) {
		this.valorNumerico = valorNumerico;
	}

	public AvmTipo getAvmTipo() {
		return this.avmTipo;
	}

	public void setAvmTipo(AvmTipo avmTipo) {
		this.avmTipo = avmTipo;
	}

	public List<AvmRecurso> getAvmRecursos() {
		return this.avmRecursos;
	}

	public void setAvmRecursos(List<AvmRecurso> avmRecursos) {
		this.avmRecursos = avmRecursos;
	}

	public AvmRecurso addAvmRecurso(AvmRecurso avmRecurso) {
		getAvmRecursos().add(avmRecurso);
		avmRecurso.setAvmItemTipo(this);

		return avmRecurso;
	}

	public AvmRecurso removeAvmRecurso(AvmRecurso avmRecurso) {
		getAvmRecursos().remove(avmRecurso);
		avmRecurso.setAvmItemTipo(null);

		return avmRecurso;
	}

}