package zw.nseremwe.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import zw.nseremwe.model.Gender;

import java.time.LocalDate;
@Data
@Builder
public class StudentsRequest {
    @NotBlank(message = "Member Id is required, cannot be null on empty.")
    private String studentId;

    @NotBlank(message = "First Name is required, cannot be null on empty.")
    private String firstName;
    @NotBlank(message = "Last Name is required, cannot be null on empty.")
    private String lastName;
    @NotBlank(message = "National Id is required, cannot be null on empty.")
    private String nationalId;
    @NotNull(message = "D.O.B is required, cannot be null on empty.")
    private LocalDate dob;
    @NotNull(message = "Gender is required, cannot be null on empty.")
    private Gender gender;
    @NotNull(message = "Address is required, cannot be null.")
    private String address;
    private String email;
    @NotBlank(message = "Phone number is required, cannot be null on empty.")
    private String mobilePhone;
}
