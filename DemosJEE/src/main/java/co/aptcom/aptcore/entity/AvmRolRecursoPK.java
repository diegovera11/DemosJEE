package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the avm_rol_recurso database table.
 * 
 */
@Embeddable
public class AvmRolRecursoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="rol_id", insertable=false, updatable=false)
	private int rolId;

	@Column(name="recurso_id", insertable=false, updatable=false)
	private int recursoId;

	public AvmRolRecursoPK() {
	}
	public int getRolId() {
		return this.rolId;
	}
	public void setRolId(int rolId) {
		this.rolId = rolId;
	}
	public int getRecursoId() {
		return this.recursoId;
	}
	public void setRecursoId(int recursoId) {
		this.recursoId = recursoId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AvmRolRecursoPK)) {
			return false;
		}
		AvmRolRecursoPK castOther = (AvmRolRecursoPK)other;
		return 
			(this.rolId == castOther.rolId)
			&& (this.recursoId == castOther.recursoId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.rolId;
		hash = hash * prime + this.recursoId;
		
		return hash;
	}
}