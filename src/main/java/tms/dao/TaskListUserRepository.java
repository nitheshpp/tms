package tms.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import tms.model.TaskListUser;

public interface TaskListUserRepository extends JpaRepository<TaskListUser, Long> {

	Optional<TaskListUser> findByuserName(@Param(value = "userName") String userName);

//	Optional<TaskListUser> findByuserName(String userName);

}
