package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the apt_role_user database table.
 * 
 */
@Embeddable
public class RoleUserPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="user_id", insertable=false, updatable=false)
	private int userId;

	@Column(name="role_id", insertable=false, updatable=false)
	private int roleId;

	@Column(name="profile_id", insertable=false, updatable=false)
	private int profileId;

	public RoleUserPK() {
	}
	public int getUserId() {
		return this.userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getRoleId() {
		return this.roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getProfileId() {
		return this.profileId;
	}
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RoleUserPK)) {
			return false;
		}
		RoleUserPK castOther = (RoleUserPK)other;
		return 
			(this.userId == castOther.userId)
			&& (this.roleId == castOther.roleId)
			&& (this.profileId == castOther.profileId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId;
		hash = hash * prime + this.roleId;
		hash = hash * prime + this.profileId;
		
		return hash;
	}
}