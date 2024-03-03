package zw.nseremwe.courseservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseResponse {
    private Integer id;
    private Integer departmentId;
    private String name;
    private String duration;
}
