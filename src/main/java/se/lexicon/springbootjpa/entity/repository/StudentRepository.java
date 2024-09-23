package se.lexicon.springbootjpa.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import se.lexicon.springbootjpa.entity.Student;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

    //select * from student where first_name = ?
    List<Student> findByFirstName (String firstName);

    @Query("select s from Student s where s.firstName = :firstName")
    List <Student> findStudentByFullName(@Param("firstName") String name);

    //find students by their name containing a certain name
    //select * from student where first_name like %name%;
    List<Student> findByFirstNameContaining(String name);

    //find student by creation date after a certain date
    List<Student> findByCreateDateAfter(LocalDateTime createDate);

    //find student by email (case-sensitive)
    Optional<Student> findByEmailIgnoreCase(String email);

    //find students by status true
    //select * from student where status = true;
    List<Student> findByStatusTrue();

    @Modifying
    //update the student status to true by student id
    @Query ("update Student s set s.status = true where s.id = :id")
    void updateStudentStatusToTrue (@Param("studentId") Long id);

    //find student by course id
    List<Student> findByCourse_Id(Long courseId);
}
