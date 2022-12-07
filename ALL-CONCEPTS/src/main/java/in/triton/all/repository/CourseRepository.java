package in.triton.all.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.triton.all.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
