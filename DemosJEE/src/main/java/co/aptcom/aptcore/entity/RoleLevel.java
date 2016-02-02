package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the apt_role_level database table.
 * 
 */
@Entity
@Table(name="apt_role_level")
@NamedQuery(name="RoleLevel.findAll", query="SELECT r FROM RoleLevel r")
public class RoleLevel implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RoleLevelPK id;

	private String active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="creation_date")
	private Date creationDate;

	@Column(name="creation_user")
	private int creationUser;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="parent_rol_id")
	private Role Role1;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="child_rol_id")
	private Role Role2;

	public RoleLevel() {
	}

	public RoleLevelPK getId() {
		return this.id;
	}

	public void setId(RoleLevelPK id) {
		this.id = id;
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public int getCreationUser() {
		return this.creationUser;
	}

	public void setCreationUser(int creationUser) {
		this.creationUser = creationUser;
	}

	public Role getRole1() {
		return this.Role1;
	}

	public void setRole1(Role Role1) {
		this.Role1 = Role1;
	}

	public Role getRole2() {
		return this.Role2;
	}

	public void setRole2(Role Role2) {
		this.Role2 = Role2;
	}

}