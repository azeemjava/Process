package in.tritonlabs.exams.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.tritonlabs.exams.entity.Questions;

@Repository
public interface IQuestionRepository extends JpaRepository<Questions,Long> {

}
