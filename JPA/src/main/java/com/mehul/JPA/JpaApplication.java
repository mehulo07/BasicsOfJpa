package com.mehul.JPA;

import java.util.Date;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mehul.JPA.JPARepo.PersonJPARepository;
import com.mehul.JPA.jdbc.entitty.Person;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

	@Autowired
	private PersonJPARepository personJPARepo;

	private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		logger.info("All Users -> {} :", personJdbcDao.findAll());
		// logger.info("data of 10001 id -> {}", personJPARepo.findById(10001));
		logger.info("data of 10001 id -> {}", personJPARepo.save(new Person("Mehul Mawana", "Canada", new Date())));
		// logger.info("data of 10001 id -> {}", personJdbcDao.findByLocation("Vyara"));
		// logger.info("data of 10001 id -> {}", personJPARepo.save(new Person("Mehul
		// Mawana","Canada",new Date())));
		//logger.info("data of 10001 id -> {}", personJPARepo.save(new Person(1, "Prutha Mawana", "Canada", new Date())));

		Person deletePerson = new Person("Parth Soni", "India", new Date());
		deletePerson = personJPARepo.save(deletePerson);
		logger.info("Parth Soni-> {}", deletePerson);
		logger.info("find Parrth -> {}", personJPARepo.findById(deletePerson.getId()));
		/*
		 * personJPARepo.deleteById(deletePerson.getId());
		 * logger.info("find Parrth -> {}",
		 * personJPARepo.findById(deletePerson.getId()));
		 */
		
		logger.info("find All -> {}", personJPARepo.findAll());
		logger.info("find All -> {}", personJPARepo.findAll());
	}

}
