package tms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tms.dao.TaskListItemsRepository;
import tms.dao.UserRepository;
import tms.exception.ResourceNotFoundException;
import tms.model.CResultListItems;
import tms.model.CResultTaskListUser;
import tms.model.TaskListItems;
import tms.model.TaskListUser;


@RestController
public class TMSController {
	/******************************************************* nithesh **********************************************/
	private UserRepository userRepository;
	/*Login*/
	
	
	/*viewTask*/
	
	
	@GetMapping("/viewTask1")
	public CResultListItems fetchAllTaskByOwnerID(@RequestParam("ownerId") Long id){
	return null ;
//	if(session.manger) {
//		mangerRepository;
//	}
//	if(user) {
//		userRepository;
//	}
	}
	@PutMapping("/AsignTak")
	public CResultListItems AssignTask(@RequestBody TaskListItems c,List<TaskListUser> u){
			return null ;
		}
	@GetMapping("/getUser")
	public CResultTaskListUser editUser(){
		return null ;
	}

		
	/******************************************************* naveen **********************************************/
	
/*viewProfile*/
	
	@GetMapping("/viewProfile")
		public CResultTaskListUser viewProfile(){
		return (CResultTaskListUser) userRepository.findAll() ; 
		
	}
	
	@PostMapping("/updateTask")
	public ResponseEntity<TaskListUser> UpdateTask(@PathVariable Long id,@RequestBody TaskListUser c){
		TaskListUser user = userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User does not exist with TaskListItems:" + c));
		
		user.setPasswordHash(c.getPasswordHash());
		user.setMobileNo(c.getMobileNo());
		user.setUserName(c.getUserName());
		
		TaskListUser updateduser = userRepository.save(user);
		return ResponseEntity.ok(updateduser);
	}
	
	@DeleteMapping("/deleteTask")
	public ResponseEntity<Map<String, Boolean>> deleteTask(@RequestParam("x") int taskID,@PathVariable Long id){
		TaskListUser user = userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User not exist with id :" + id));
		
		userRepository.delete(user);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	/******************************************************* Krati+Ayushi **********************************************/
	
	
	
	/********************AccountSetting**************************/
	
	@PostMapping("/ChangePasswordByManager")
	public CResultTaskListUser ChangeUserDetail(@RequestBody TaskListUser c){
		
//		if(isMAnger(session.usetID)) {
//			tlur.updat();
//		}
//		if(isUser()) {
//			tlur.updat();
//		}
//			
		
		
		return null ;
	}
	
	
	
	
	
	/**********************ManageTask*****************************/
	
	@PutMapping("/CrateTask")
	public CResultListItems CreateTask(@RequestBody TaskListItems c){
		return null ;
	}

	
	
	/**********************ManageUser*****************************/
	
	
	
	@PutMapping("/addUser")
	
	public CResultTaskListUser addEditUser(@RequestBody TaskListUser c){
		return null ;
//		adduser();
	}
	
//	@PutMapping("editUser")
//	public CResultTaskListUser editUser(TaskListUser u){
//		return null ;
//	}
//	
	@GetMapping("getUser")
	public CResultTaskListUser getUser(){
		return null ;
	}

}
