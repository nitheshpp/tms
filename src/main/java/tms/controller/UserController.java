package tms.controller;

import java.util.List;








import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import tms.ResourceNotFoundException.ResourceNotFoundException;
import tms.dao.TaskListUserRepository;
import tms.model.CResultTaskListUser;

import tms.model.TaskListUser;
import tms.service.UserServiceInterface;



@RestController
public class UserController 

{

	
	//@Autowired
	//private UserServiceInterface tms;
	
	@Autowired
	
	private TaskListUserRepository ulr;
	private UserServiceInterface tms;
	
	
	
	
	/**********************ManageUser*****************************/
	
	// getuser rest ui -------------------------------------------------------------------------------------	
	/*
	
		@GetMapping("/getUser")
		List<TaskListUser> getUserDetails()
		{
			List<TaskListUser> l =tms.getUserDetails();
			return l;
			
		}
		
	*/	
	
		
		 @GetMapping("/getUser")
			
		public List<TaskListUser> getUserDetails()
			{
		    	 return ulr.findAll();
				
			}
	
		 
		
			
		     
	
		 
// adduser rest ui -------------------------------------------------------------------------------------	
	/*
	 * 
	
	@PutMapping("/addUser/{id}")
	public CResultTaskListUser addUser(@RequestBody TaskListUser c)
	{
		
		System.out.println("You can add users here ");
		CResultTaskListUser x = tms.addUser(c);
		return x;
		
	}

	
		
	*/
	
	
	
	@PutMapping("/addUser")
	public TaskListUser addUser(@RequestBody TaskListUser c)
	{
		
		System.out.println("You can craete user list here ");
		return ulr.save(c);
		
	}
	

	
	
	
// get particular task rest ui -------------------------------------------------------------------------------------	
	
	
	
	/*
	@GetMapping("/User")
	
	public CResultTaskListUser getOneUser(@RequestParam("x") int userid)
	{
		
		CResultTaskListUser x = tms.getOneUser(userid);
		return x;	
	}
	
*/
	
     
     
	
    
	@GetMapping("/User/{userid}")
	public ResponseEntity<TaskListUser> getOneUser(@PathVariable Long userid)
	     
	{
TaskListUser t = ulr.findById(userid).
orElseThrow(() -> new ResourceNotFoundException("User not exist with id :" + userid));
return ResponseEntity.ok(t);
		}
		
	
		
	
	
	// update task rest ui -------------------------------------------------------------------------------------
	
	/*
	@PostMapping("/update")
	public  CResultTaskListUser updateUser(@RequestBody TaskListUser c) {
	
		      System.out.println("from Client" +c.getId());
		      
         CResultTaskListUser x = tms.updateUser(c);
		return x;
		
		
	}
	
	*/
	
	@PostMapping("/Update/{id}")
	public ResponseEntity<TaskListUser> updateUser(@PathVariable Long id, @RequestBody TaskListUser tlu)
	
	{
		 
		TaskListUser t = ulr.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Users not exist with userid :" + id));
		
		t.setUserName(tlu.getUserName());
		
		
		t.setPasswordHash(tlu.getPasswordHash());
		
		t.setManager(tlu.isManager());
		
		t.setAdministrator(tlu.isAdministrator());
		
		t.setMobileNo(tlu.getMobileNo());
		
		TaskListUser updatedTask = ulr.save(t);
		
		return ResponseEntity.ok(updatedTask);

	
		
	}
	
	
	
}
