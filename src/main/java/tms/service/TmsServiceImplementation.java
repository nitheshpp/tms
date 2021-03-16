package tms.service;

import java.util.List;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tms.model.CResultListItems;
import tms.model.CResultTaskListUser;
import tms.model.TaskListItems;
import tms.model.TaskListUser;
import tms.dao.TaskListItemsRepository;
import tms.dao.TaskListUserRepository;


@Service
public class TmsServiceImplementation implements TmsServiceInterface {

	@Autowired
	private TaskListUserRepository ar;
	
	@Autowired
	private TaskListItemsRepository ar1;
	
	@Override
	public CResultTaskListUser getUser(long id) {
		// TODO Auto-generated method stub
		CResultTaskListUser c1 =new CResultTaskListUser(0, null, "failed due to user");
		Optional<TaskListUser> c = ar.findById(id);
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
	public CResultTaskListUser addUser(TaskListUser c) {
		// TODO Auto-generated method stub
		CResultTaskListUser c1 =new CResultTaskListUser(0, c, "failed due to user");
		//CResult c1 =new CResult(1, 'c', 500);
		try {
			ar.save(c);
			c1.setStatus(1);
			c1.setReason("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("if if fails we think why");
		}
		return c1;
	}


	@Override
	public CResultTaskListUser updateUser(TaskListUser c2) {
		// TODO Auto-generated method stub
		CResultTaskListUser c1 =new CResultTaskListUser(0, c2, "failed due to user");
		if(ar.existsById(c2.getId()))
		{
			ar.save(c2);
			c1.setStatus(1);
			c1.setReason("success");
		}
		return c1;
	}


	
	
	@Override
	public CResultListItems createTask(TaskListItems c) {
		// TODO Auto-generated method stub
		CResultListItems c1=new CResultListItems(0, c, "failed due to user");
		try {
			ar1.save(c);
			c1.setStatus(1);
			c1.setReason("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("if if fails we think why");
		}
		return c1;
	}
	
	
	
	

	
}