package se.lexicon.springbootjpa;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.springbootjpa.entity.Address;
import se.lexicon.springbootjpa.entity.Student;
import se.lexicon.springbootjpa.entity.repository.AddressRepository;
import se.lexicon.springbootjpa.entity.repository.StudentRepository;

@Component
public class myCommandLineRunner implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public void run(String... args) throws Exception {
        Address address = new Address("Test Street", "Test City", "12345");
        //Address savedAddress = addressRepository.save(address);
        studentRepository.save(new Student("John", "Doe", "johndoe@test.se", address));


    }
}