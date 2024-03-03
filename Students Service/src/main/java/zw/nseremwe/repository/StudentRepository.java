package zw.nseremwe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.nseremwe.dto.StudentsDto;
import zw.nseremwe.model.Students;

public interface StudentRepository extends JpaRepository<Students,Long> {
}
