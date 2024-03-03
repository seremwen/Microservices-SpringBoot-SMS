package zw.nseremwe.courseservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import zw.nseremwe.courseservice.dto.CourseRequest;
import zw.nseremwe.courseservice.dto.CourseResponse;


public interface CourseService {
    CourseResponse create(CourseRequest courseRequest);
}
