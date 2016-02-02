package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the apt_role_resource database table.
 * 
 */
@Entity
@Table(name="apt_role_resource")
@NamedQuery(name="RoleResource.findAll", query="SELECT r FROM RoleResource r")
public class RoleResource implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RoleResourcePK id;

	private String active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="creation_date")
	private Date creationDate;

	@Column(name="creation_user")
	private int creationUser;

	//bi-directional many-to-one association to Resource
	@ManyToOne
	@JoinColumn(name="resource_id")
	private Resource Resource;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role Role;

	public RoleResource() {
	}

	public RoleResourcePK getId() {
		return this.id;
	}

	public void setId(RoleResourcePK id) {
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

	public Resource getResource() {
		return this.Resource;
	}

	public void setResource(Resource Resource) {
		this.Resource = Resource;
	}

	public Role getRole() {
		return this.Role;
	}

	public void setRole(Role Role) {
		this.Role = Role;
	}

}