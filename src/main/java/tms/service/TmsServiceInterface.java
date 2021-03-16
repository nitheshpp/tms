package tms.service;

import tms.model.CResultListItems;
import tms.model.CResultTaskListUser;
import tms.model.TaskListItems;

public interface TmsServiceInterface {
	
	CResultTaskListUser getUser(long id);

	CResultListItems updateTask(TaskListItems u);

	CResultListItems deleteTask(TaskListItems d);
//	fetchTaskListForManager()
//	adduser();
}
