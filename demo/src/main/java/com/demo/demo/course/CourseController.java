package com.demo.demo.course;

// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @GetMapping("/Course")
    public List<Course>  retriveAllCourses(){
        return Arrays.asList(
            new Course(1L,"Learn Spring", "Neema"),
            new Course(2L,"Learn Java", "Neema")
            );

    }
}
