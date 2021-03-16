package tms;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tms.dao.TaskListItemsRepository;
import tms.model.TaskListItems;



@SpringBootApplication
public class OnlywebserviceApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OnlywebserviceApplication.class, args);
	}
	@Autowired
	TaskListItemsRepository tlir;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<TaskListItems> i =tlir.findByCategoryStatus();
		if(!i.isEmpty()) {
			for (TaskListItems t : i) {
				System.out.println(t.getSubject());
			}
			
		}
	}

}
