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
import tms.service.TmsServiceInterface;


@RestController
public class TMSController {
	/******************************************************* nithesh **********************************************/
	private TmsServiceInterface s;
	
//	private UserRepository userRepository;
	
//	private TaskListItemsRepository tasklistitemsrepository;
	
	
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
	public CResultTaskListUser getUser(@RequestParam("x") long id)
	{
		
		 CResultTaskListUser x = s.getUser(id);
		return x;
	}
	
	@PostMapping("/updateTask")
	public CResultListItems editUser(@RequestBody TaskListItems u){
		
		   System.out.println("inside update");
		   CResultListItems x = s.updateTask(u);
			return x;
		}
	
	@DeleteMapping("/deleteTask")
	public CResultListItems deleteTask(@RequestBody TaskListItems u){
		System.out.println("delete");
		   CResultListItems x = s.deleteTask(u);
			return x;
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
