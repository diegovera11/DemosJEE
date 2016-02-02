package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the apt_module database table.
 * 
 */
@Entity
@Table(name="apt_module")
@NamedQuery(name="Module.findAll", query="SELECT m FROM Module m")
public class Module implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="module_id")
	private int moduleId;

	private String active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="creation_date")
	private Date creationDate;

	@Column(name="creation_user")
	private int creationUser;

	@Column(name="css_style")
	private String cssStyle;

	@Lob
	private String description;

	@Column(name="module_name")
	private String moduleName;

	//bi-directional many-to-one association to Menu
	@OneToMany(mappedBy="Module")
	private List<Menu> Menus;

	public Module() {
	}

	public int getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
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

	public String getCssStyle() {
		return this.cssStyle;
	}

	public void setCssStyle(String cssStyle) {
		this.cssStyle = cssStyle;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getModuleName() {
		return this.moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public List<Menu> getMenus() {
		return this.Menus;
	}

	public void setMenus(List<Menu> Menus) {
		this.Menus = Menus;
	}

	public Menu addMenus(Menu Menus) {
		getMenus().add(Menus);
		Menus.setModule(this);

		return Menus;
	}

	public Menu removeMenus(Menu Menus) {
		getMenus().remove(Menus);
		Menus.setModule(null);

		return Menus;
	}

}