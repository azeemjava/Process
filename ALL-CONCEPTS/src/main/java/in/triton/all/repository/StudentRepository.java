package in.triton.all.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.triton.all.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
