package com.tunedapps.reg.demo;

import com.tunedapps.reg.entites.Gender;
import com.tunedapps.reg.entites.Student;
import com.tunedapps.reg.repository.Repository;
import com.tunedapps.reg.repository.RepositoryImpl;
import com.tunedapps.reg.repository.StudentsIdGenerator;

public class Demo {

    public static void main(String[] args) {
        Repository<Long, Student> studentRepository = new RepositoryImpl<>(new StudentsIdGenerator());

        Long id = studentRepository.create(Student.builder().gender(Gender.MALE).build());

        Student student = studentRepository.findById(id);
        System.out.println(student);
    }
}
