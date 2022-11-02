package in.tritonlabs.templates.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import in.tritonlabs.templates.entity.Templates;

@Repository
public interface ITemplatesRepositroy extends JpaRepository<Templates,Long>{

}
