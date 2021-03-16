package tms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import tms.dao.TaskListItemsRepository;
import tms.dao.UserRepository;
import tms.model.CResultListItems;
import tms.model.CResultTaskListUser;
import tms.model.TaskListItems;
import tms.model.TaskListUser;

@Service
public class TmsServiceImplementation implements TmsServiceInterface {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private TaskListItemsRepository tasklistitemsrepository;
	
	@Override
	public CResultTaskListUser getUser(long id) {
		// TODO Auto-generated method stub
		CResultTaskListUser c1 =new CResultTaskListUser(0, null, "failed due to user");
		Optional<TaskListUser> c = userRepository.findById(id);
		if(c.isPresent())
		{
			TaskListUser x = c.get();
			c1.setReason("success");
			c1.setStatus(1);
			c1.setContent(x);
		}
		else
			System.out.println("did not get the object");	
		
		
		return c1;
	}

	@Override
	public CResultListItems updateTask(TaskListItems u) {
		TaskListItems c = null;
		// TODO Auto-generated method stub
		CResultListItems c1 =new CResultListItems(0,c,"failed due to user");
		if(tasklistitemsrepository.existsById(c.getId()))
		{
			tasklistitemsrepository.save(c);
			c1.setStatus(1);
			c1.setReason("success");
		}
		return c1;
	}

	@Override
	public CResultListItems deleteTask(TaskListItems d) {
		// TODO Auto-generated method stub
		CResultListItems c1 =new CResultListItems(0, null, "failed due to user");
		try {
			tasklistitemsrepository.deleteTask(d);
			c1.setStatus(1);
			c1.setReason("success");
		} catch (EmptyResultDataAccessException e) 
		{
			
		}
		return null;

	}

	
}
