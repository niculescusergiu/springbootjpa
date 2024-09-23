package se.lexicon.springbootjpa.entity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.springbootjpa.entity.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

}
