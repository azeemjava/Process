package in.triton.unidirectional.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.triton.unidirectional.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
