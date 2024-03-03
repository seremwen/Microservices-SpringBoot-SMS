package zw.nseremwe.service;

import zw.nseremwe.dto.StudentsRequest;
import zw.nseremwe.dto.StudentsResponse;

public interface StudentService {
    StudentsResponse create(StudentsRequest studentsRequest);
}
