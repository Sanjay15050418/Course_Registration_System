package com.example.Course.Registration.System.controller;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegisteredStudents;
import com.example.Course.Registration.System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("courses")
    public List<Course> availableCourse(){
       return courseService.availableCourses();
    }
    @GetMapping("course/enrolled/students")
    public List<CourseRegisteredStudents> enrolledStudents(){
        return courseService.enrolledStudents();
    }
    @PostMapping("course/register")
    public String enrollCourses(@RequestParam("name") String name,
                                @RequestParam("emailId") String emailId,
                                @RequestParam("courseName") String courseName){
        courseService.enrolledStudents(name,emailId,courseName);
        return "Congratulations!! "+name+" Enrollment is Successfully done for Course "+courseName;

    }
}
