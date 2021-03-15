package tms.service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tms.dao.TaskListUserRepository;

import tms.model.CResultTaskListUser;

import tms.model.TaskListUser;



@Service
public class UserServiceImplementation implements UserServiceInterface

{

	
	@Autowired
	TaskListUserRepository tr;

	@Override
	public CResultTaskListUser addUser(TaskListUser c) {
		
		CResultTaskListUser c1 =new CResultTaskListUser(0, c, "failed due to user");
		
		try {
			tr.save(c);
			c1.setStatus(1);
			c1.setReason("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("if if fails we think why");
		}
		return c1;
	}

	
	
	
	@Override
	public List<TaskListUser> getUserDetails() {
		
		return tr.findAll();
	}

	
	
	
	@Override
	public CResultTaskListUser getOneUser(int userid) {
		
		CResultTaskListUser c1 =new CResultTaskListUser(0, null, "failed due to user");
		Optional<TaskListUser> c = tr.findById((long) userid);
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
	public CResultTaskListUser updateUser(TaskListUser c) {
	
		
			
		CResultTaskListUser c1 =new CResultTaskListUser(0, c, "failed due to user");
			
			if(tr.existsById(c.getId()))
				
			{
				tr.save(c);
				c1.setStatus(1);
				c1.setReason("success");
			}
			
			return c1;
		}

		
		
		
		
	




	
}

