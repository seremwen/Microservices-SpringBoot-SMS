package zw.nseremwe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Departments {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
}
