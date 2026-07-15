package com.tarak.demo.studentserver;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *becuse jpa repo has a lot of abstract methods
 * so here we make our class to interface
 * JpaRepository
 *
 * H2 store data in RAM
 *
 */


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {



//    public Studentex save(Studentex student) {
//        System.out.println("StudentRepository save");
//        return student;
//    }
}
