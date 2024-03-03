package zw.nseremwe.dto;

import lombok.Data;
import zw.nseremwe.model.Gender;

import java.time.LocalDate;
@Data
public class StudentsDto {
    private String studentId;
    private String firstName;
    private String lastName;
    private String nationalId;
    private LocalDate dob;
    private Gender gender;
    private String address;
    private String email;
}
