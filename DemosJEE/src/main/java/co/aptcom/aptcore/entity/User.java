package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the apt_user database table.
 * 
 */
@Entity
@Table(name="apt_user")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private int userId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="creation_date")
	private Date creationDate;

	@Column(name="creation_user")
	private int creationUser;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name1")
	private String lastName1;

	@Column(name="last_name2")
	private String lastName2;

	@Column(name="middle_name")
	private String middleName;

	private String password;

	@Column(name="status_id")
	private int statusId;

	private String username;

	//bi-directional many-to-one association to RoleUser
	@OneToMany(mappedBy="User")
	private List<RoleUser> RoleUsers;

	public User() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName1() {
		return this.lastName1;
	}

	public void setLastName1(String lastName1) {
		this.lastName1 = lastName1;
	}

	public String getLastName2() {
		return this.lastName2;
	}

	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStatusId() {
		return this.statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<RoleUser> getRoleUsers() {
		return this.RoleUsers;
	}

	public void setRoleUsers(List<RoleUser> RoleUsers) {
		this.RoleUsers = RoleUsers;
	}

	public RoleUser addRoleUser(RoleUser RoleUser) {
		getRoleUsers().add(RoleUser);
		RoleUser.setUser(this);

		return RoleUser;
	}

	public RoleUser removeRoleUser(RoleUser RoleUser) {
		getRoleUsers().remove(RoleUser);
		RoleUser.setUser(null);

		return RoleUser;
	}

}