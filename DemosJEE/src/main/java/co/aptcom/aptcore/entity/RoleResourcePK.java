package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the apt_role_resource database table.
 * 
 */
@Embeddable
public class RoleResourcePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="role_id", insertable=false, updatable=false)
	private int roleId;

	@Column(name="resource_id", insertable=false, updatable=false)
	private int resourceId;

	public RoleResourcePK() {
	}
	public int getRoleId() {
		return this.roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getResourceId() {
		return this.resourceId;
	}
	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RoleResourcePK)) {
			return false;
		}
		RoleResourcePK castOther = (RoleResourcePK)other;
		return 
			(this.roleId == castOther.roleId)
			&& (this.resourceId == castOther.resourceId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.roleId;
		hash = hash * prime + this.resourceId;
		
		return hash;
	}
}