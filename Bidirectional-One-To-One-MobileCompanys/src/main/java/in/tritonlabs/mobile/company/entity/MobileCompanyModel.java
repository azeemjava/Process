package in.tritonlabs.mobile.company.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "mobile_company_model")
public class MobileCompanyModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;

	@Column(name = "model_name")
	private String modelName;

	@Column(name = "date")
	private String date;

	@OneToOne(cascade =  CascadeType.ALL)
	@JoinColumn(name="mobile_company_id_fkey",referencedColumnName = "id")
	MobileCompany mobilecompany;


	public MobileCompany getMobilecompany() {
		return mobilecompany;
	}

	public void setMobilecompany(MobileCompany mobilecompany) {
		this.mobilecompany = mobilecompany;
	}

	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
