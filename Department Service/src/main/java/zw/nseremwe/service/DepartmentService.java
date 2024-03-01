package zw.nseremwe.service;

import zw.nseremwe.dto.DepartmentDto;
import zw.nseremwe.dto.DepartmentRequest;
import zw.nseremwe.dto.DepartmentResponse;
import zw.nseremwe.model.Departments;

import java.util.List;

public interface DepartmentService {

    List<DepartmentDto> getAll();
    DepartmentResponse create(DepartmentRequest departmentRequest);
}
