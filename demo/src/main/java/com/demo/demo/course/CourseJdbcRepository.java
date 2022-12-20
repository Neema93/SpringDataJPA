package com.demo.demo.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class CourseJdbcRepository {
    @Autowired
   private JdbcTemplate springJdbcTemplate;

   private static String INSERT_QUERY = """
           insert into course(id, name, author) values(1, 'learn java', 'Neema');
           """;
   public void insert(){
    springJdbcTemplate.update(INSERT_QUERY);
   }

}
