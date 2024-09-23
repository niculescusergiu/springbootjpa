package se.lexicon.springbootjpa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.springbootjpa.entity.Student;
import se.lexicon.springbootjpa.entity.repository.StudentRepository;

@DataJpaTest
public class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    @Transactional
    public void testSaveAndFindById() {
        //1. Arrange
        Student student = new Student("Sergiu", "Niculescu", "niculescusergiu00@gmail.com");

        //2. Act
        Student savedStudent = studentRepository.save(student);

        //Assert
        Assertions.assertNotNull(savedStudent);
        Assertions.assertNotNull(savedStudent.getId());


    }
}
