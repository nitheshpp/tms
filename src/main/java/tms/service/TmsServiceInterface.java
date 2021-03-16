package tms.service;

import java.util.List;

import tms.model.CResultListItems;
import tms.model.CResultTaskListUser;
import tms.model.TaskListItems;
import tms.model.TaskListUser;

public interface TmsServiceInterface {

	CResultTaskListUser getUser(long id);

	CResultTaskListUser addUser(TaskListUser c);

	CResultTaskListUser updateUser(TaskListUser u);

	CResultListItems createTask(TaskListItems c);
	
//	fetchTaskListForManager()
//	adduser();
}