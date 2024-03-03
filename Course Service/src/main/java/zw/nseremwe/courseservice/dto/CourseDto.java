package zw.nseremwe.courseservice.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseDto {
    private Integer id;
    private Integer departmentId;
    private String name;
    private String duration;
}
