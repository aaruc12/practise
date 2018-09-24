package com.example.demo.inter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Student;

public interface StudRepo extends JpaRepository<Student,Integer> {

}
//public interface StudRepo extends CrudRepository<Student,Integer> {

//}

