package zw.nseremwe.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import zw.nseremwe.model.Gender;

import java.time.LocalDate;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentsResponse {
    private String studentId;
    private String firstName;
    private String lastName;
    private String nationalId;
    private LocalDate dob;
    private Gender gender;
    private String address;
    private String email;
    private String mobilePhone;
}
