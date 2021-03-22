package tms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tms.dao.TaskListItemsRepository;
import tms.dao.TaskListUserRepository;
import tms.exception.ResourceNotFoundException;
import tms.model.CResultListItems;
import tms.model.CResultTaskListUser;
import tms.model.TaskListItems;
import tms.model.TaskListUser;
import tms.service.TmsServiceInterface;
@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/api/")
public class TMSController {
	
	@Autowired
	private TmsServiceInterface s;
	
	@Autowired
	private TaskListUserRepository tasklistuserRepository;
	
	@Autowired
	private TaskListItemsRepository tasklistitemRepository;
	
	@GetMapping("/users")
	public List<TaskListUser> getUsers(){
		return tasklistuserRepository.findAll();
	}
	
	// get user by id rest api
		@GetMapping("/users/{id}")
		public ResponseEntity<TaskListUser> getUserById(@PathVariable Long id) {
			TaskListUser user = tasklistuserRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("user not exist with id :" + id));
			return ResponseEntity.ok(user);
		}
	
	/*@GetMapping("/getUser")
	public CResultTaskListUser getUser(@RequestParam("x") long id)
	{
		
		 CResultTaskListUser x = s.getUser(id);
		return x;
	}*/
	
	// create user rest api
		@PostMapping("/users")
		public TaskListUser createUser(@RequestBody TaskListUser user) {
			return tasklistuserRepository.save(user);
		}
	
  /* @PutMapping("/addUser")
	
	public CResultTaskListUser addEditUser(@RequestBody TaskListUser c){
	   System.out.println("inside add");
	   CResultTaskListUser x = s.addUser(c);
		return x;
	}*/
   
// update user rest api
	
	@PutMapping("/users/{id}")
	public ResponseEntity<TaskListUser> updateUser(@PathVariable Long id, @RequestBody TaskListUser userDetails){
		TaskListUser user = tasklistuserRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("user not exist with id :" + id));
		
		user.setUserName(userDetails.getUserName());
		user.setPasswordHash(userDetails.getPasswordHash());
		user.setMobileNo(userDetails.getMobileNo());
		user.setManager(userDetails.isManager());
		user.setAdministrator(userDetails.isAdministrator());
		
		TaskListUser updatedUser = tasklistuserRepository.save(user);
		return ResponseEntity.ok(updatedUser);
	}
	
	// delete users rest api
		@DeleteMapping("/users/{id}")
		public ResponseEntity<Map<String, Boolean>> deleteUser(@PathVariable Long id){
			TaskListUser user = tasklistuserRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("User not exist with id :" + id));
			
			tasklistuserRepository.delete(user);
			Map<String, Boolean> response = new HashMap<>();
			response.put("deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
		}
   
  /* @PutMapping("/updateUser")
	public CResultTaskListUser editUser(@RequestBody TaskListUser u){
		
	   System.out.println("inside update");
	   CResultTaskListUser x = s.updateUser(u);
		return x;
	}*/
   
// create user rest api
		@PostMapping("/tasks")
		public TaskListItems createTask(@RequestBody TaskListItems user) {
			return tasklistitemRepository.save(user);
		}
   
		@GetMapping("/tasks")
		public List<TaskListItems> getTasks(){
			return tasklistitemRepository.findAll();
		}
		
		
  /* @PutMapping("/createTask")
	public CResultListItems CreateTask(@RequestBody TaskListItems c){
	   System.out.println("inside create");
	   CResultListItems x=s.createTask(c);
		return x;
	}*/
	
	/******************************************************* nithesh **********************************************/
	
	/*Login*/
	
	
	/*viewTask*/
	
	
//	@GetMapping("/viewTask1")
//	public CResultListItems fetchAllTaskByOwnerID(@RequestParam("ownerId") Long id){
//	return null ;
//	if(session.manger) {
//		mangerRepository;
//	}
//	if(user) {
//		userRepository;
//	}
//	}
//	@PutMapping("/AsignTak")
//public CResultListItems AssignTask(@RequestBody TaskListItems c,List<TaskListUser> u){
		//	return null ;
	//	}
//	@GetMapping("/getUser")
//	public CResultTaskListUser editUser(){
	//	return null ;
//	} 

		
	/******************************************************* naveen **********************************************/
	
/*viewProfile*/
	
	//@GetMapping("/viewProfile")
	/*	public CResultTaskListUser viewProfile(){
		return null ;
	}
	
	@PostMapping("/updateTask")
	public CResultListItems UpdateTask(@RequestBody TaskListItems c){
		return null ;
	}
	
	@DeleteMapping("/deleteTask")
public CResultListItems deleteTask(@RequestParam("x") int taskID){
		return null ;
	}
	
	/******************************************************* Krati+Ayushi **********************************************/
	
	
	
	/********************AccountSetting**************************/
	
/*	@PostMapping("/ChangePasswordByManager")
	public CResultTaskListUser ChangeUserDetail(@RequestBody TaskListUser c){
		
//		if(isMAnger(session.usetID)) {
//			tlur.updat();
//		}
//		if(isUser()) {
//			tlur.updat();
//		}
//			
		
		
		return null ;
	}*/
	
	
	
	
	
	/**********************ManageTask*****************************/
	
	/*@PutMapping("/CrateTask")
	public CResultListItems CreateTask(@RequestBody TaskListItems c){
		return null ;
	}*/

	
	
	/**********************ManageUser*****************************/
	
	
	
//	@PutMapping("/addUser")
	
//	public CResultTaskListUser addEditUser(@RequestBody TaskListUser c){
//		return null ;
//		adduser();
//	}
	
//	@PutMapping("editUser")
//	public CResultTaskListUser editUser(TaskListUser u){
//		return null ;
//	}
//	
	
//		return null ;
//	}

   
   
}