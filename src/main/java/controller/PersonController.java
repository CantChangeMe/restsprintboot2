package controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Person;
import service.PersonInfoService;

@RestController
@RequestMapping("/persons")
public class PersonController {
	@Autowired
	PersonInfoService service;
	
	@GetMapping("/all")
	public List<Person> getAllEmp(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Person> getEmp(@PathVariable("id") Long id){
		return service.getPerson(id);
	}
}
