package tms.service;

import tms.model.CResultListItems;
import tms.model.CResultTaskListAssignment;
import tms.model.CResultTaskListUser;

public interface TmsServiceInterface {

	CResultListItems login(String userName, String password);

	CResultListItems fetchTaskList(long ownerUserId);

	CResultTaskListUser getAllUser();

	CResultTaskListAssignment assignTask(Long ownerId, Long taskId);
	
//	fetchTaskListForManager()
//	adduser();
}
