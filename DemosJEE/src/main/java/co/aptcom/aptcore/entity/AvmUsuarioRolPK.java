package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the avm_usuario_rol database table.
 * 
 */
@Embeddable
public class AvmUsuarioRolPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="usuario_id", insertable=false, updatable=false)
	private int usuarioId;

	@Column(name="rol_id", insertable=false, updatable=false)
	private int rolId;

	@Column(name="perfil_id", insertable=false, updatable=false)
	private int perfilId;

	public AvmUsuarioRolPK() {
	}
	public int getUsuarioId() {
		return this.usuarioId;
	}
	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}
	public int getRolId() {
		return this.rolId;
	}
	public void setRolId(int rolId) {
		this.rolId = rolId;
	}
	public int getPerfilId() {
		return this.perfilId;
	}
	public void setPerfilId(int perfilId) {
		this.perfilId = perfilId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AvmUsuarioRolPK)) {
			return false;
		}
		AvmUsuarioRolPK castOther = (AvmUsuarioRolPK)other;
		return 
			(this.usuarioId == castOther.usuarioId)
			&& (this.rolId == castOther.rolId)
			&& (this.perfilId == castOther.perfilId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.usuarioId;
		hash = hash * prime + this.rolId;
		hash = hash * prime + this.perfilId;
		
		return hash;
	}
}