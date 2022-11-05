package in.tritonlabs.exams.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.tritonlabs.exams.entity.Template;

@Repository
public interface ITemplateRepository extends JpaRepository<Template,Long> {

}
