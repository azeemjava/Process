package in.tritonlabs.templates.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "templates")
public class Templates {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private long id;

	@Column(name = "templates_name")
	private String templatesName;

	@Column(name = "total_mark")
	private long totalMark;

	@OneToMany(mappedBy = "templates", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("templates")
	private List<Question> question;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTemplatesName() {
		return templatesName;
	}

	public void setTemplatesName(String templatesName) {
		this.templatesName = templatesName;
	}

	public long getTotalMark() {
		return totalMark;
	}

	public void setTotalMark(long totalMark) {
		this.totalMark = totalMark;
	}

	public List<Question> getQuestion() {
		return question;
	}

	public void setQuestion(List<Question> question) {
		this.question = question;
	}

	

}
