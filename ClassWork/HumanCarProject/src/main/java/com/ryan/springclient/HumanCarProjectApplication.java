package com.ryan.springclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ryan.entity.Car;
import com.ryan.entity.Human;
import com.ryan.persistence.CarDao;
import com.ryan.persistence.HumanDao;

@SpringBootApplication(scanBasePackages = "com.ryan")
@EntityScan(basePackages = "com.ryan.entity")
@EnableJpaRepositories(basePackages = "com.ryan.persistence")
public class HumanCarProjectApplication implements CommandLineRunner {
	
	@Autowired
	private HumanDao humanDao;
	
	@Autowired
	private CarDao carDao;

	public static void main(String[] args) {
		SpringApplication.run(HumanCarProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		Car c1 = new Car("C1", "Honda", "JX1454G");
		Car c2 = new Car("C2", "BMW", "HF4163F");
		Car c3 = new Car("C3", "Mercedes", "SE2159D");
		
		Human h1 = new Human("H1", "Ryan");
		h1.setCar(c3);
		Human h2 = new Human("H2", "Katie");
		h2.setCar(c2);
		Human h3 = new Human("H3", "Conor");
		h3.setCar(c1);
		
		carDao.save(c1);
		carDao.save(c2);
		carDao.save(c3);
		
		humanDao.save(h1);
		humanDao.save(h2);
		humanDao.save(h3);
		
		
		
		System.out.println("Table created and items added!");
		*/
		
		System.out.println("~~~~~~~~~~~~");
		Human human = humanDao.getById("H1");
		System.out.println(human);
		System.out.println("~~~~~~~~~~~~");
	}

}
