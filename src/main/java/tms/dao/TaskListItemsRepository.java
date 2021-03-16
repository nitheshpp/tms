package tms.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tms.model.TaskListItems;

@Repository
public interface TaskListItemsRepository extends JpaRepository<TaskListItems, Long>{
	@Query("from TaskListItems i where i.tlStatusID.StatusDescription='open' and i.tlCategoryID.description='Project1'")
	List<TaskListItems> findByCategoryStatus();

	List<TaskListItems> findByownerUserId(long ownerUserId);
}
