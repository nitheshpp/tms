package tms.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import tms.dao.TaskListAssignTaskRepository;
import tms.dao.TaskListItemsRepository;
import tms.dao.TaskListUserRepository;
import tms.model.CResultListItems;
import tms.model.CResultTaskListAssignment;
import tms.model.CResultTaskListUser;
import tms.model.TaskListAssignment;
import tms.model.TaskListAssignmentId;
import tms.model.TaskListItems;
import tms.model.TaskListUser;

@Service
public class TmsServiceImplementation implements TmsServiceInterface {

	@Autowired
	private TaskListItemsRepository tlir;
	@Autowired
	private TaskListUserRepository tlur;
	@Autowired
	private TaskListAssignTaskRepository tlar;
	
	@Override
	public CResultListItems login(String userName, String password) {
		// TODO Auto-generated method stub
		CResultListItems cri = new CResultListItems(0, null, "Faied To Login");
		
		Optional<TaskListUser> user =tlur.findByuserName(userName);
		if(user.isPresent()) {
		
			TaskListUser tempObj = user.get();
			if(tempObj.getPasswordHash().equals(password)) {
//				ListUser.add(tempObj);
				System.out.println("password");
				cri.setStatus(1);
				cri.setContent(fetchTaskList(tempObj.getId()).getContent());
				cri.setReason("Login Successfull");
				
			}
		}
		return cri;
	}

	
	@Override
	public CResultListItems fetchTaskList(long ownerUserId) {
		// TODO Auto-generated method stub
		CResultListItems cri = new CResultListItems(0, null, "Failed");
		List<TaskListItems> ListTaskItem = tlir.findByownerUserId(ownerUserId);
		
//		for (TaskListItems taskListItems : ListTaskItem) {
//			System.out.println(taskListItems.getSubject());
//		}
		if(!ListTaskItem.isEmpty()) {
			cri.setReason("successfull");
			cri.setContent(ListTaskItem);
			cri.setStatus(1);
		}
		
		return cri;
	}


	@Override
	public CResultTaskListUser getAllUser() {
		// TODO Auto-generated method stub
		CResultTaskListUser cru = new CResultTaskListUser(0, null, "Faied To Get All User ");
		List<TaskListUser> ListUser = new LinkedList<TaskListUser>();
		ListUser= tlur.findAll();
		cru.setContent(ListUser);
		cru.setReason("successfull");
		cru.setStatus(1);
		return cru;
	}


	@Override
	public CResultTaskListAssignment assignTask(Long ownerId, Long taskId) {
		// TODO Auto-generated method stub
		CResultTaskListAssignment cra = new CResultTaskListAssignment(0, "Failed");
		
		
		Optional<TaskListUser> findUser =tlur.findById(ownerId);
		TaskListUser user =findUser.get();
		
		Optional<TaskListItems> findTask =tlir.findById(taskId);
		TaskListItems task =findTask.get();
		
		
		
		TaskListAssignmentId tlaId=new TaskListAssignmentId();
		tlaId.setAssignUserId(user);
		tlaId.setAssignTaskListId(task);
		TaskListAssignment tla = new TaskListAssignment();
		tla.setAssignId(tlaId);
		if(!tlar.equals(tla)) {
			
			tlar.save(tla);
			cra.setReason("Assigned Task");
			cra.setStatus(1);
		}
		
		return cra;
	}


	

	
}
