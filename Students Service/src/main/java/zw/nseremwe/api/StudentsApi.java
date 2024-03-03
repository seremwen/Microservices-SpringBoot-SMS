package zw.nseremwe.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zw.nseremwe.dto.StudentsRequest;
import zw.nseremwe.dto.StudentsResponse;
import zw.nseremwe.service.StudentService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/students")
public class StudentsApi {

    private final StudentService studentService;

    @PostMapping("/create")
    public ResponseEntity<StudentsResponse> create(@RequestBody StudentsRequest studentsRequest) {
        return new ResponseEntity<>(studentService.create(studentsRequest), HttpStatus.CREATED);
    }
}
