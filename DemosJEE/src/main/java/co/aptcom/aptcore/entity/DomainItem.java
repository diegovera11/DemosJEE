package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the apt_domain_item database table.
 * 
 */
@Entity
@Table(name="apt_domain_item")
@NamedQuery(name="DomainItem.findAll", query="SELECT d FROM DomainItem d")
public class DomainItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="item_id")
	private int itemId;

	private String active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="creation_date")
	private Date creationDate;

	@Column(name="creation_user")
	private int creationUser;

	@Temporal(TemporalType.DATE)
	@Column(name="date_value")
	private Date dateValue;

	@Lob
	private String description;

	@Column(name="item_name")
	private String itemName;

	@Column(name="numeric_value")
	private BigDecimal numericValue;

	@Column(name="string_value")
	private String stringValue;

	//bi-directional many-to-one association to Domain
	@ManyToOne
	@JoinColumn(name="domain_id")
	private Domain Domain;

	//bi-directional many-to-one association to Resource
	@OneToMany(mappedBy="DomainItem")
	private List<Resource> Resources;

	public DomainItem() {
	}

	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
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

	public Date getDateValue() {
		return this.dateValue;
	}

	public void setDateValue(Date dateValue) {
		this.dateValue = dateValue;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public BigDecimal getNumericValue() {
		return this.numericValue;
	}

	public void setNumericValue(BigDecimal numericValue) {
		this.numericValue = numericValue;
	}

	public String getStringValue() {
		return this.stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	public Domain getDomain() {
		return this.Domain;
	}

	public void setDomain(Domain Domain) {
		this.Domain = Domain;
	}

	public List<Resource> getResources() {
		return this.Resources;
	}

	public void setResources(List<Resource> Resources) {
		this.Resources = Resources;
	}

	public Resource addResource(Resource Resource) {
		getResources().add(Resource);
		Resource.setDomainItem(this);

		return Resource;
	}

	public Resource removeResource(Resource Resource) {
		getResources().remove(Resource);
		Resource.setDomainItem(null);

		return Resource;
	}

}