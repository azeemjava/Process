package in.tritonlabs.student.exams.entity;

import javax.persistence.Id;

public class ExaminationStudent {
	
	public long getExamId() {
		return examId;
	}
	public void setExamId(long examId) {
		this.examId = examId;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	
	

	private long examId; 
	
	
	private long studentId;
	

}
