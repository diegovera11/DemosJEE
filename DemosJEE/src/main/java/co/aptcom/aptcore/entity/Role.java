package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the apt_role database table.
 * 
 */
@Entity
@Table(name="apt_role")
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="role_id")
	private int roleId;

	private String active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="creation_date")
	private Date creationDate;

	@Column(name="creation_user")
	private int creationUser;

	@Lob
	private String description;

	@Column(name="role_name")
	private String roleName;

	//bi-directional many-to-one association to RoleLevel
	@OneToMany(mappedBy="Role1")
	private List<RoleLevel> RoleLevels1;

	//bi-directional many-to-one association to RoleLevel
	@OneToMany(mappedBy="Role2")
	private List<RoleLevel> RoleLevels2;

	//bi-directional many-to-one association to RoleResource
	@OneToMany(mappedBy="Role")
	private List<RoleResource> RoleResources;

	//bi-directional many-to-one association to RoleUser
	@OneToMany(mappedBy="Role")
	private List<RoleUser> RoleUsers;

	public Role() {
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<RoleLevel> getRoleLevels1() {
		return this.RoleLevels1;
	}

	public void setRoleLevels1(List<RoleLevel> RoleLevels1) {
		this.RoleLevels1 = RoleLevels1;
	}

	public RoleLevel addRoleLevels1(RoleLevel RoleLevels1) {
		getRoleLevels1().add(RoleLevels1);
		RoleLevels1.setRole1(this);

		return RoleLevels1;
	}

	public RoleLevel removeRoleLevels1(RoleLevel RoleLevels1) {
		getRoleLevels1().remove(RoleLevels1);
		RoleLevels1.setRole1(null);

		return RoleLevels1;
	}

	public List<RoleLevel> getRoleLevels2() {
		return this.RoleLevels2;
	}

	public void setRoleLevels2(List<RoleLevel> RoleLevels2) {
		this.RoleLevels2 = RoleLevels2;
	}

	public RoleLevel addRoleLevels2(RoleLevel RoleLevels2) {
		getRoleLevels2().add(RoleLevels2);
		RoleLevels2.setRole2(this);

		return RoleLevels2;
	}

	public RoleLevel removeRoleLevels2(RoleLevel RoleLevels2) {
		getRoleLevels2().remove(RoleLevels2);
		RoleLevels2.setRole2(null);

		return RoleLevels2;
	}

	public List<RoleResource> getRoleResources() {
		return this.RoleResources;
	}

	public void setRoleResources(List<RoleResource> RoleResources) {
		this.RoleResources = RoleResources;
	}

	public RoleResource addRoleResource(RoleResource RoleResource) {
		getRoleResources().add(RoleResource);
		RoleResource.setRole(this);

		return RoleResource;
	}

	public RoleResource removeRoleResource(RoleResource RoleResource) {
		getRoleResources().remove(RoleResource);
		RoleResource.setRole(null);

		return RoleResource;
	}

	public List<RoleUser> getRoleUsers() {
		return this.RoleUsers;
	}

	public void setRoleUsers(List<RoleUser> RoleUsers) {
		this.RoleUsers = RoleUsers;
	}

	public RoleUser addRoleUser(RoleUser RoleUser) {
		getRoleUsers().add(RoleUser);
		RoleUser.setRole(this);

		return RoleUser;
	}

	public RoleUser removeRoleUser(RoleUser RoleUser) {
		getRoleUsers().remove(RoleUser);
		RoleUser.setRole(null);

		return RoleUser;
	}

}