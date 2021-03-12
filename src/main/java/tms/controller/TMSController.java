package tms.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tms.model.CResultListItems;
import tms.model.CResultTaskListUser;
import tms.model.TaskListItems;
import tms.model.TaskListUser;

@RestController
public class TMSController {
	/******************************************************* nithesh **********************************************/
	
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
