package in.tritonlabs.templates.request;

import java.util.List;

import in.tritonlabs.templates.entity.Question;

public class TemplatesRequest {

	private long id;
	private String templatesName;
	private long totalMark;
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
