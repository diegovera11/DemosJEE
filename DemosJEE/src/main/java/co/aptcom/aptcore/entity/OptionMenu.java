package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the apt_option_menu database table.
 * 
 */
@Entity
@Table(name="apt_option_menu")
@NamedQuery(name="OptionMenu.findAll", query="SELECT o FROM OptionMenu o")
public class OptionMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="option_id")
	private int optionId;

	private String active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="creation_date")
	private Date creationDate;

	@Column(name="creation_user")
	private int creationUser;

	@Lob
	private String description;

	private String label;

	@Column(name="menu_id")
	private int menuId;

	@Column(name="option_order")
	private int optionOrder;

	@Column(name="parent_option_id")
	private int parentOptionId;

	@Column(name="url_destination")
	private String urlDestination;

	//bi-directional many-to-one association to Resource
	@ManyToOne
	@JoinColumn(name="resource_id")
	private Resource Resource;

	public OptionMenu() {
	}

	public int getOptionId() {
		return this.optionId;
	}

	public void setOptionId(int optionId) {
		this.optionId = optionId;
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

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getMenuId() {
		return this.menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public int getOptionOrder() {
		return this.optionOrder;
	}

	public void setOptionOrder(int optionOrder) {
		this.optionOrder = optionOrder;
	}

	public int getParentOptionId() {
		return this.parentOptionId;
	}

	public void setParentOptionId(int parentOptionId) {
		this.parentOptionId = parentOptionId;
	}

	public String getUrlDestination() {
		return this.urlDestination;
	}

	public void setUrlDestination(String urlDestination) {
		this.urlDestination = urlDestination;
	}

	public Resource getResource() {
		return this.Resource;
	}

	public void setResource(Resource Resource) {
		this.Resource = Resource;
	}

}