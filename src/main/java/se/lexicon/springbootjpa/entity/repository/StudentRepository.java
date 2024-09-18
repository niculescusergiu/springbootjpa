package se.lexicon.springbootjpa.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.lexicon.springbootjpa.entity.Student;

public interface StudentRepository extends JpaRepository<Student, String> {

}
