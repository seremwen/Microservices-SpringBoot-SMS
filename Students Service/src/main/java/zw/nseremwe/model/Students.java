package zw.nseremwe.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Data
@Entity
public class Students {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long studentId;
        @Column(nullable = false)
        private String firstName;
        @Column(nullable = false)
        private String lastName;
        @Column(nullable = false, unique = true)
        private String nationalId;
        @Column(nullable = false)
        private LocalDate dob;
        @Enumerated(EnumType.STRING)
        private Gender gender;
        @Column(nullable = false)
        private String address;
        private String email;
        @Column(nullable = false)
        private String mobilePhone;
}
