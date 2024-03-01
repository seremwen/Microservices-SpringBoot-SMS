package zw.nseremwe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.nseremwe.model.Departments;
@Repository
public interface DepartmentRepository extends JpaRepository<Departments, Integer> {
}
