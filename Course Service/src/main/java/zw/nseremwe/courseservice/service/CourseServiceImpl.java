package zw.nseremwe.courseservice.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import zw.nseremwe.courseservice.dto.CourseRequest;
import zw.nseremwe.courseservice.dto.CourseResponse;
import zw.nseremwe.courseservice.repository.CourseRepository;

@Slf4j
@Service
public class CourseServiceImpl implements  CourseService{
    private final CourseRepository courseRepository;
    private final ModelMapper modelMapper;

    public CourseServiceImpl(CourseRepository courseRepository, ModelMapper modelMapper) {
        this.courseRepository = courseRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CourseResponse create(CourseRequest courseRequest) {
        return null;
    }
}
