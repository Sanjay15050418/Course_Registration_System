package com.example.Course.Registration.System.service;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegisteredStudents;
import com.example.Course.Registration.System.repository.CourseRegisteredStudentsRepo;
import com.example.Course.Registration.System.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;
    @Autowired
    CourseRegisteredStudentsRepo courseRegisteredStudentsRepo;

    public List<Course> availableCourses() {
        return courseRepo.findAll();
    }

    public List<CourseRegisteredStudents> enrolledStudents() {
        return courseRegisteredStudentsRepo.findAll();
    }

    public void enrolledStudents(String name, String emailId, String courseName) {
        CourseRegisteredStudents courseRegisteredStudents = new CourseRegisteredStudents(name,emailId,courseName);
        courseRegisteredStudentsRepo.save(courseRegisteredStudents);
    }
}
