package org.example.mapper;

import org.apache.ibatis.annotations.Insert;
import org.example.entity.Books;
import org.example.entity.Student;

import java.awt.print.Book;

public interface BookMapper {
    @Insert("insert into student(name,sex,grade)values(#{name},#{sex},#{grade})")
    int addStudent(Student student);
    @Insert("insert into book(title,`desc`,price)values(#{title},#{desc},#{price})")
    int addBook(Books books);


}
