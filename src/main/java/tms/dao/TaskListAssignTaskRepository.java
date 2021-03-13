package tms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tms.model.TaskListAssignment;

@Repository
public interface TaskListAssignTaskRepository extends JpaRepository<TaskListAssignment, Long>{

	
}
