package com.demo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.demo.entity.Course;

public interface CourseSpringDataRepository extends JpaRepository<Course, Long>{
    
}
