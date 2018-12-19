package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Person;
import repository.PersonRepositoryInterface;

@Service
public class PersonInfoService {
	
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	PersonRepositoryInterface repository;
	public PersonInfoService() {
	}
	
	public Optional<Person> getPerson(Long id) {
			return repository.findById(id);	
	}
	public List<Person> getAll(){
		return (List<Person>) repository.findAll();
	}
}
