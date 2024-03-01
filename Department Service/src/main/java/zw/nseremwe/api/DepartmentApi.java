package zw.nseremwe.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zw.nseremwe.dto.DepartmentRequest;
import zw.nseremwe.dto.DepartmentResponse;
import zw.nseremwe.service.DepartmentService;

@RestController
@RequestMapping("/api/v1/departments")
public class DepartmentApi {
    private final DepartmentService departmentService;

    public DepartmentApi(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
    @PostMapping("/create")
    public ResponseEntity<DepartmentResponse> create(@RequestBody DepartmentRequest departmentRequest) {
        return new ResponseEntity<>(departmentService.create(departmentRequest), HttpStatus.CREATED);
    }

}
