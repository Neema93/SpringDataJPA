package com.demo.demo.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long>{
    
}
