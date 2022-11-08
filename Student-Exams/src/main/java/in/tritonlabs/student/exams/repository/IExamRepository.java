package in.tritonlabs.student.exams.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.tritonlabs.student.exams.entity.Exams;

@Repository
public interface IExamRepository extends JpaRepository<Exams, Long> {

	@Query(value="insert into exams_student values(?1,?2)",nativeQuery = true)
	public void createOfBoth(long examId,long studentId);

	
	
}
