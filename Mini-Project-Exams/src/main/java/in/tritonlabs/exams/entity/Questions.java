package in.tritonlabs.exams.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "questions")
public class Questions {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private long id;
	private String question;
	private long wheightage;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "temp_id", referencedColumnName = "id")
	@JsonBackReference
	@JsonIgnoreProperties("quetsions")
	private Template template;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public long getWheightage() {
		return wheightage;
	}

	public void setWheightage(long wheightage) {
		this.wheightage = wheightage;
	}

	public Template getTemplate() {
		return template;
	}

	public void setTemplate(Template template) {
		this.template = template;
	}

}
