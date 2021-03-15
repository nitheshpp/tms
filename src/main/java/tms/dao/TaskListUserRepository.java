package tms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import tms.model.CResultTaskListUser;
import tms.model.TaskListUser;


@Repository
public interface TaskListUserRepository extends JpaRepository<TaskListUser, Long>
{

	//CResultTaskListUser updateUser(TaskListUser c);

	

	

}
