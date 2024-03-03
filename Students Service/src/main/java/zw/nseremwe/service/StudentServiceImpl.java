package zw.nseremwe.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zw.nseremwe.dto.StudentsRequest;
import zw.nseremwe.dto.StudentsResponse;
import zw.nseremwe.model.Students;
import zw.nseremwe.repository.StudentRepository;

@Slf4j
@Service
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    public StudentServiceImpl(StudentRepository studentRepository, ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }
//    @Transactional
    @Override
    public StudentsResponse create(StudentsRequest studentsRequest) {
        log.info("Creating student: {}", studentsRequest);
        Students students =modelMapper.map(studentsRequest, Students.class);
        Students saved =studentRepository.save(students);
        return modelMapper.map(saved,StudentsResponse.class);
    }

}
