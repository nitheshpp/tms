package tms.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class Runable implements CommandLineRunner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Runable.class, args);
	}
	@Autowired
	TaskListItemsRepository tlir;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

}
