package com.demo.demo.course;

public class Course {
    private Long id;
    private String Name;
    private String Author;
    
    
    public Course(Long id, String name, String author) {
        this.id = id;
        Name = name;
        Author = author;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return Name;
    }
    public String getAuthor() {
        return Author;
    }
    @Override
    public String toString() {
        return "Course [id=" + id + ", Name=" + Name + ", Author=" + Author + "]";
    }
    
}
