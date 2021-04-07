package com.mehul.JPA.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

//import com.mehul.JPA.jdbc.entitty.Person;

//@Repository
public class PersonJdbcDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/*
	 * public List<Person> findAll() { return
	 * jdbcTemplate.query("Select * from person;", new
	 * BeanPropertyRowMapper(Person.class)); }
	 * 
	 * public Person findById(int id) { return
	 * jdbcTemplate.queryForObject("Select * from person where id= ?", new Object[]
	 * { id }, new BeanPropertyRowMapper<Person>(Person.class)); }
	 * 
	 * public List<Person> findByLocation(String location) { return
	 * jdbcTemplate.query("Select * from person where location= ?", new Object[] {
	 * location }, new BeanPropertyRowMapper<Person>(Person.class)); }
	 */
	/*
	 * public int deleteById(int id) { return
	 * jdbcTemplate.update("delete from person where id= ?", new Object[] { id }); }
	 * 
	 * public int save(Person person) { return jdbcTemplate.
	 * update("INSERT INTO PERSON(ID,NAME,LOCATION,BIRTH_DATE) VALUES (?,?,?,?)",
	 * new Object[] { person.getId(), person.getName(), person.getLocation(), new
	 * Timestamp(person.getBirthDate().getTime()) }); }
	 * 
	 * public int update(Person person) { return jdbcTemplate.
	 * update("UPDATE PERSON SET NAME = ? ,LOCATION = ? ,BIRTH_DATE = ? WHERE ID = ?"
	 * , new Object[] { person.getName(), person.getLocation(), new
	 * Timestamp(person.getBirthDate().getTime()), person.getId() }); }
	 */
}
