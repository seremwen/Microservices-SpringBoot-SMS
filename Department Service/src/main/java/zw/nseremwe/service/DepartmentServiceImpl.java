package zw.nseremwe.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import zw.nseremwe.dto.DepartmentDto;
import zw.nseremwe.dto.DepartmentRequest;
import zw.nseremwe.dto.DepartmentResponse;
import zw.nseremwe.model.Departments;
import zw.nseremwe.repository.DepartmentRepository;

import java.util.List;

@Service
@ComponentScan
@Slf4j
public class DepartmentServiceImpl implements DepartmentService{
    private final DepartmentRepository departmentRepository;

//    private final ModelMapper modelMapper;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
//        this.modelMapper = modelMapper;
    }

    @Override
    public List<DepartmentDto> getAll() {
        return null;
    }

    @Override
    public DepartmentResponse create(DepartmentRequest departmentRequest) {
        Departments departments = modelMapper.map(departmentRequest, Departments.class);
        Departments saved = departmentRepository.save(departments);
        log.info("Successfully updated member: {}", saved);
        return modelMapper.map(saved, DepartmentResponse.class);
    }
}
