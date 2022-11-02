package in.tritonlabs.templates.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.tritonlabs.templates.entity.Question;

@Repository
public interface IQuestionRepositroy extends JpaRepository<Question,Long> {

}
