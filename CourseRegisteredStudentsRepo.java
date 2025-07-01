package com.example.Course.Registration.System.repository;

import com.example.Course.Registration.System.model.CourseRegisteredStudents;
import org.hibernate.query.criteria.JpaDerivedRoot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegisteredStudentsRepo extends JpaRepository<CourseRegisteredStudents,Integer> {
}
