package com.example.demo.courses;
import com.example.demo.constants.RestRelated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(RestRelated.API_V1+"/courses")
public class CourseController {

    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<Course> getCourses(){
        return this.courseService.getCourses();
    }


    @PostMapping
    public void addCourse(@RequestBody Course course){
        this.courseService.newCourse(course);
    }

    @DeleteMapping(path = "{courseId}")
    public void deleteCourse(@PathVariable("courseId") long id){
        this.courseService.deleteCourse(id);
    }


}
