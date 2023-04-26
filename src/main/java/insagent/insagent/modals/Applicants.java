package insagent.insagent.modals;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "applicants")
public class Applicants {

	enum Status {
		UW, Rejected, Approved,
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer applicantId;

	private String policyOwner;
	private String lifeInsured;
	private String prdType;
	private Integer applicantionId;
	private String date;
	private Long sumAssured;
	private Status status;
	
	public Applicants() {
		super();
	}

	public Applicants(Integer applicantId, String policyOwner, String lifeInsured, String prdType,
			Integer applicantionId, String date, Long sumAssured, Status status) {
		super();
		this.applicantId = applicantId;
		this.policyOwner = policyOwner;
		this.lifeInsured = lifeInsured;
		this.prdType = prdType;
		this.applicantionId = applicantionId;
		this.date = date;
		this.sumAssured = sumAssured;
		this.status = status;
	}

	public Integer getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(Integer applicantId) {
		this.applicantId = applicantId;
	}

	public String getPolicyOwner() {
		return policyOwner;
	}

	public void setPolicyOwner(String policyOwner) {
		this.policyOwner = policyOwner;
	}

	public String getLifeInsured() {
		return lifeInsured;
	}

	public void setLifeInsured(String lifeInsured) {
		this.lifeInsured = lifeInsured;
	}

	public String getPrdType() {
		return prdType;
	}

	public void setPrdType(String prdType) {
		this.prdType = prdType;
	}

	public Integer getApplicantionId() {
		return applicantionId;
	}

	public void setApplicantionId(Integer applicantionId) {
		this.applicantionId = applicantionId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Long getSumAssured() {
		return sumAssured;
	}

	public void setSumAssured(Long sumAssured) {
		this.sumAssured = sumAssured;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Applicants [applicantId=" + applicantId + ", policyOwner=" + policyOwner + ", lifeInsured="
				+ lifeInsured + ", prdType=" + prdType + ", applicantionId=" + applicantionId + ", date=" + date
				+ ", sumAssured=" + sumAssured + ", status=" + status + "]";
	}
	
}
