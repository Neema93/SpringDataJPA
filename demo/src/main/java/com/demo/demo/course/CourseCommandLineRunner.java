package com.demo.demo.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class CourseCommandLineRunner  implements CommandLineRunner{
//    @Autowired
//     private CourseJdbcRepository repository;
    @Autowired
    private CourseJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {

        repository.insert(new Course(1L, "Learn Java Basic" ,"Neema"));
        repository.insert(new Course(2L, "Learn Java Advance" ,"Neema"));
        repository.insert(new Course(3L, "Learn Spring boot" ,"Neema"));
        repository.deleteById(3L);
        System.out.println(repository.findById(2L));
    }
    
}