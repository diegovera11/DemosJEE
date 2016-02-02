package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the apt_profile database table.
 * 
 */
@Entity
@Table(name="apt_profile")
@NamedQuery(name="Profile.findAll", query="SELECT p FROM Profile p")
public class Profile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="profile_id")
	private int profileId;

	private String active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="creation_date")
	private Date creationDate;

	@Column(name="creation_user")
	private int creationUser;

	@Lob
	private String description;

	@Column(name="profile_name")
	private String profileName;

	//bi-directional many-to-one association to RoleUser
	@OneToMany(mappedBy="Profile")
	private List<RoleUser> RoleUsers;

	public Profile() {
	}

	public int getProfileId() {
		return this.profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
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

	public String getProfileName() {
		return this.profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public List<RoleUser> getRoleUsers() {
		return this.RoleUsers;
	}

	public void setRoleUsers(List<RoleUser> RoleUsers) {
		this.RoleUsers = RoleUsers;
	}

	public RoleUser addRoleUser(RoleUser RoleUser) {
		getRoleUsers().add(RoleUser);
		RoleUser.setProfile(this);

		return RoleUser;
	}

	public RoleUser removeRoleUser(RoleUser RoleUser) {
		getRoleUsers().remove(RoleUser);
		RoleUser.setProfile(null);

		return RoleUser;
	}

}