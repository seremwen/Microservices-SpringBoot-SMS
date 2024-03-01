package zw.nseremwe.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartmentRequest {
    private String name;
    private String description;
}
