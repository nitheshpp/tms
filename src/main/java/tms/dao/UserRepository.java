package tms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tms.model.TaskListUser;

public interface UserRepository extends JpaRepository<TaskListUser, Long>{
	@Query("from TaskListUser i where i.tlStatusID.StatusDescription='open' and i.tlCategoryID.description='Project1'")
	List<TaskListUser> findByCategoryStatus();
}
