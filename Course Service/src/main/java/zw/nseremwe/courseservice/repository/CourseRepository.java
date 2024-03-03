package zw.nseremwe.courseservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.nseremwe.courseservice.model.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course,  Integer> {
}
