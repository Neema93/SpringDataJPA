package com.demo.demo.course;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager em;
    public void save(Course course){
        em.merge(course);
    }
    public Course findById(long id){
       return em.find(Course.class, id);
    }
    public void deleteById(long id){
        Course course = em.find(Course.class, id);
        em.remove(course);
     }

}
