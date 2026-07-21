    package com.tarak.demo.studentserver.repository;


    import com.tarak.demo.studentserver.entity.Student;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;

    import java.util.Optional;

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

        boolean existsByEmail(String email);
//        Optional<Student> findByEmail(String email);
        //    public Studentex save(Studentex student) {
    //        System.out.println("StudentRepository save");
    //        return student;
    //    }


    }
