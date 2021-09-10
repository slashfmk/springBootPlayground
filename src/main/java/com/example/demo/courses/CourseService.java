package com.example.demo.courses;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    public List<Course> getCourses (){
        return courseRepository.findAll();
    }

    public void newCourse(Course course){
        Optional<Course> courseFound = this.courseRepository.findCourseByTitle(course.getTitle());

        if(courseFound.isPresent()){
            throw new IllegalStateException("The course already exists");
        }

        this.courseRepository.save(course);
    }

    public void  deleteCourse(long id){
        boolean isCourseFound = this.courseRepository.existsById(id);

        if(!isCourseFound){
            throw new IllegalStateException("Course with id "+id+" doesn't exist");
        }

        this.courseRepository.deleteById(id);
    }

}
