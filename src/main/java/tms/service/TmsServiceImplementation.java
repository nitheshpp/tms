package tms.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tms.dao.TaskListItemsRepository;
import tms.model.CResultListItems;

import tms.model.TaskListItems;




@Service
public class TmsServiceImplementation implements TmsServiceInterface

{
	
	@Autowired
	TaskListItemsRepository tr;

	@Override
	public CResultListItems createTaskList(TaskListItems c) {
		
		CResultListItems c1 =new CResultListItems(0, c, "failed due to user");
		try {
			tr.save(c);
			c1.setStatus(1);
			c1.setReason("success");
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			System.out.println("if if fails we think why");
		}
		return c1;
			
	}

	
	
	
	
	@Override
	public List<TaskListItems> getAllDetails() {
		
		return tr.findAll();
	}
	
	
	
	

	@Override
	public CResultListItems getOneTask(int userid) {
		
		CResultListItems c1 =new CResultListItems(0, null, "failed due to user");
		Optional<TaskListItems> c = tr.findById((long) userid);
		if(c.isPresent())
		{
			TaskListItems x = c.get();
			c1.setReason("success");
			c1.setStatus(1);
			c1.setContent(x);
		}
		else
			System.out.println("did not get the object");	
		
		
		return c1;
	}

	

	
	
		
	

	
}
