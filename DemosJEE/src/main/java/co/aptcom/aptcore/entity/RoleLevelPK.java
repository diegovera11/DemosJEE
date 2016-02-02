package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the apt_role_level database table.
 * 
 */
@Embeddable
public class RoleLevelPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="parent_rol_id", insertable=false, updatable=false)
	private int parentRolId;

	@Column(name="child_rol_id", insertable=false, updatable=false)
	private int childRolId;

	public RoleLevelPK() {
	}
	public int getParentRolId() {
		return this.parentRolId;
	}
	public void setParentRolId(int parentRolId) {
		this.parentRolId = parentRolId;
	}
	public int getChildRolId() {
		return this.childRolId;
	}
	public void setChildRolId(int childRolId) {
		this.childRolId = childRolId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RoleLevelPK)) {
			return false;
		}
		RoleLevelPK castOther = (RoleLevelPK)other;
		return 
			(this.parentRolId == castOther.parentRolId)
			&& (this.childRolId == castOther.childRolId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.parentRolId;
		hash = hash * prime + this.childRolId;
		
		return hash;
	}
}