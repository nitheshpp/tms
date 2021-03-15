package tms.service;

import java.util.List;


import tms.model.CResultListItems;
import tms.model.CResultTaskListUser;
import tms.model.TaskListItems;
import tms.model.TaskListUser;




public interface TmsServiceInterface
{
	
	CResultListItems createTaskList(TaskListItems c);
	
	
	List<TaskListItems> getAllDetails();

	CResultListItems getOneTask(int userid);

}
