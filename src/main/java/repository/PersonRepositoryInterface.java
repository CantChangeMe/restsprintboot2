package repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import model.Person;

public interface PersonRepositoryInterface extends CrudRepository<Person,Long> {
	List<Person> findByAge(int age);
	List<Person> findByfirstName(String firstName);
}
