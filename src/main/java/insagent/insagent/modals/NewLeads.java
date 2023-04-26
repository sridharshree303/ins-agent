package insagent.insagent.modals;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "newleads")
public class NewLeads {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer leadId;
	
	private String name;
	private String lastContacted;
	private String product;
	private String email;
	private String contact;
	private LeadStage leadStage;
	
	//default constructor
	public NewLeads() {
		super();
	}
	
	//parameterized constructor
	public NewLeads(Integer leadId, String name, String lastContacted, String product, String email, String contact,
			LeadStage leadStage) {
		super();
		this.leadId = leadId;
		this.name = name;
		this.lastContacted = lastContacted;
		this.product = product;
		this.email = email;
		this.contact = contact;
		this.leadStage = leadStage;
	}
	
	public Integer getLeadId() {
		return leadId;
	}
	public void setLeadId(Integer leadId) {
		this.leadId = leadId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastContacted() {
		return lastContacted;
	}
	public void setLastContacted(String lastContacted) {
		this.lastContacted = lastContacted;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public LeadStage getLeadStage() {
		return leadStage;
	}
	public void setLeadStage(LeadStage leadStage) {
		this.leadStage = leadStage;
	}

	@Override
	public String toString() {
		return "NewLeads [leadId=" + leadId + ", name=" + name + ", lastContacted=" + lastContacted + ", Product="
				+ product + ", email=" + email + ", contact=" + contact + ", leadStage=" + leadStage + "]";
	}
	
}
