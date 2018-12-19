package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="PERSON_SEQ")
	@SequenceGenerator(name="PERSON_SEQ",sequenceName="person_sequence",allocationSize=1)
	private Long id;
	private String firstName;
	private String lastName;
	private int age;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
}