package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the apt_resource database table.
 * 
 */
@Entity
@Table(name="apt_resource")
@NamedQuery(name="Resource.findAll", query="SELECT r FROM Resource r")
public class Resource implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="resource_id")
	private int resourceId;

	private String active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="creation_date")
	private Date creationDate;

	@Column(name="creation_user")
	private int creationUser;

	@Lob
	private String description;

	@Column(name="resource_name")
	private String resourceName;

	//bi-directional many-to-one association to OptionMenu
	@OneToMany(mappedBy="Resource")
	private List<OptionMenu> OptionMenus;

	//bi-directional many-to-one association to DomainItem
	@ManyToOne
	@JoinColumn(name="type_resource_id")
	private DomainItem DomainItem;

	//bi-directional many-to-one association to RoleResource
	@OneToMany(mappedBy="Resource")
	private List<RoleResource> RoleResources;

	public Resource() {
	}

	public int getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
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

	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public List<OptionMenu> getOptionMenus() {
		return this.OptionMenus;
	}

	public void setOptionMenus(List<OptionMenu> OptionMenus) {
		this.OptionMenus = OptionMenus;
	}

	public OptionMenu addOptionMenus(OptionMenu OptionMenus) {
		getOptionMenus().add(OptionMenus);
		OptionMenus.setResource(this);

		return OptionMenus;
	}

	public OptionMenu removeOptionMenus(OptionMenu OptionMenus) {
		getOptionMenus().remove(OptionMenus);
		OptionMenus.setResource(null);

		return OptionMenus;
	}

	public DomainItem getDomainItem() {
		return this.DomainItem;
	}

	public void setDomainItem(DomainItem DomainItem) {
		this.DomainItem = DomainItem;
	}

	public List<RoleResource> getRoleResources() {
		return this.RoleResources;
	}

	public void setRoleResources(List<RoleResource> RoleResources) {
		this.RoleResources = RoleResources;
	}

	public RoleResource addRoleResource(RoleResource RoleResource) {
		getRoleResources().add(RoleResource);
		RoleResource.setResource(this);

		return RoleResource;
	}

	public RoleResource removeRoleResource(RoleResource RoleResource) {
		getRoleResources().remove(RoleResource);
		RoleResource.setResource(null);

		return RoleResource;
	}

}