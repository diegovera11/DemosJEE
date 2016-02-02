package co.aptcom.aptcore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the apt_domain database table.
 * 
 */
@Entity
@Table(name="apt_domain")
@NamedQuery(name="Domain.findAll", query="SELECT d FROM Domain d")
public class Domain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="domain_id")
	private int domainId;

	private String active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="creation_date")
	private Date creationDate;

	@Column(name="creation_user")
	private int creationUser;

	@Column(name="domain_name")
	private String domainName;

	private String functionality;

	//bi-directional many-to-one association to DomainItem
	@OneToMany(mappedBy="Domain")
	private List<DomainItem> DomainItems;

	public Domain() {
	}

	public int getDomainId() {
		return this.domainId;
	}

	public void setDomainId(int domainId) {
		this.domainId = domainId;
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

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getFunctionality() {
		return this.functionality;
	}

	public void setFunctionality(String functionality) {
		this.functionality = functionality;
	}

	public List<DomainItem> getDomainItems() {
		return this.DomainItems;
	}

	public void setDomainItems(List<DomainItem> DomainItems) {
		this.DomainItems = DomainItems;
	}

	public DomainItem addDomainItem(DomainItem DomainItem) {
		getDomainItems().add(DomainItem);
		DomainItem.setDomain(this);

		return DomainItem;
	}

	public DomainItem removeDomainItem(DomainItem DomainItem) {
		getDomainItems().remove(DomainItem);
		DomainItem.setDomain(null);

		return DomainItem;
	}

}