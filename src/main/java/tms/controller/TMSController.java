package tms.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tms.model.CResultListItems;
import tms.model.CResultTaskListAssignment;
import tms.model.CResultTaskListUser;
import tms.model.TaskListItems;
import tms.model.TaskListUser;
import tms.service.TmsServiceInterface;

@RestController
public class TMSController {
	
	@Autowired
	private TmsServiceInterface tmsService;
	
	
	/******************************************************* nithesh **********************************************/
	
	/*Login*/
	@GetMapping("/Login")
	public CResultListItems login(@RequestParam("userName") String userName,@RequestParam("password") String password)
	{
		CResultListItems cri= tmsService.login(userName,password);
//		return cri;
		return cri;
	}
	
	/*viewTask*/
	
	
	@GetMapping("/viewTask1")
	public CResultListItems fetchAllTaskByOwnerID(@RequestParam("ownerId") Long id){
		CResultListItems cri=tmsService.fetchTaskList(id);
		
	return cri ;
//	if(session.manger) {
//		mangerRepository;
//	}
//	if(user) {
//		userRepository;
//	}
	}
	
	
//	@PutMapping(value="/AsignTak" , consumes = MediaType.APPLICATION_JSON_VALUE)
//	public CResultListItems AssignTask( @RequestBody TaskListItems listTask,@RequestBody List<TaskListUser> listUser){
//		CResultListItems cri = new CResultListItems(0, null, "Failed");
////		tmsService.assignTask
//		return cri ;
//		}
	
	
	@PutMapping("/AsignTak")
	public CResultTaskListAssignment AssignTask(@RequestParam("ownerId") Long ownerId,@RequestParam("taskId") Long taskId){
		CResultTaskListAssignment cra = new CResultTaskListAssignment();
		cra=tmsService.assignTask(ownerId,taskId);
		return cra ;
		}
	@GetMapping("/getUser2")
	public CResultTaskListUser editUser(){
		CResultTaskListUser cru=tmsService.getAllUser();
		return cru ;
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
