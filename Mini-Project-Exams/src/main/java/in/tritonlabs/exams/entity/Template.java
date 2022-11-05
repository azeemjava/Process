package in.tritonlabs.exams.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "template")
public class Template {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private long id;
	private String templateName;
	private int totalMark;

	@OneToMany(mappedBy = "template", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("template")
	private List<Questions> quetsions;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public int getTotalMark() {
		return totalMark;
	}

	public void setTotalMark(int totalMark) {
		this.totalMark = totalMark;
	}

	public List<Questions> getQuetsions() {
		return quetsions;
	}

	public void setQuetsions(List<Questions> quetsions) {
		this.quetsions = quetsions;
	}

}
