package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the avm_rol_arbol database table.
 * 
 */
@Embeddable
public class AvmRolArbolPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="rol_padre_id", insertable=false, updatable=false)
	private int rolPadreId;

	@Column(name="rol_hijo_id", insertable=false, updatable=false)
	private int rolHijoId;

	public AvmRolArbolPK() {
	}
	public int getRolPadreId() {
		return this.rolPadreId;
	}
	public void setRolPadreId(int rolPadreId) {
		this.rolPadreId = rolPadreId;
	}
	public int getRolHijoId() {
		return this.rolHijoId;
	}
	public void setRolHijoId(int rolHijoId) {
		this.rolHijoId = rolHijoId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AvmRolArbolPK)) {
			return false;
		}
		AvmRolArbolPK castOther = (AvmRolArbolPK)other;
		return 
			(this.rolPadreId == castOther.rolPadreId)
			&& (this.rolHijoId == castOther.rolHijoId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.rolPadreId;
		hash = hash * prime + this.rolHijoId;
		
		return hash;
	}
}