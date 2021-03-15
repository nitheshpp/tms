package tms.service;

import java.util.List;




import tms.model.CResultTaskListUser;
import tms.model.TaskListUser;


public interface UserServiceInterface

{
	
CResultTaskListUser addUser(TaskListUser c);
	
List<TaskListUser> getUserDetails();

CResultTaskListUser getOneUser(int userid);


CResultTaskListUser updateUser(TaskListUser c);




}
