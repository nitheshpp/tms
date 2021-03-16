package tms.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//@Entity
@Embeddable
public class TaskListAssignmentId implements Serializable {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	long id;
	
	@ManyToOne
	@JoinColumn(name="userId")
	TaskListUser AssignUserId;

	@ManyToOne
	@JoinColumn(name="TaskListId")
	TaskListItems AssignTaskListId;
	
	public TaskListAssignmentId() {
		
		// TODO Auto-generated constructor stub
	}

	

	public TaskListAssignmentId( TaskListUser assignUserId, TaskListItems assignTaskListId) {
		
		AssignUserId = assignUserId;
		AssignTaskListId = assignTaskListId;
	}



	public void setAssignUserId(TaskListUser assignUserId) {
		AssignUserId = assignUserId;
	}



	public void setAssignTaskListId(TaskListItems assignTaskListId) {
		AssignTaskListId = assignTaskListId;
	}



	public TaskListUser getAssignUserId() {
		return AssignUserId;
	}



	public TaskListItems getAssignTaskListId() {
		return AssignTaskListId;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AssignTaskListId == null) ? 0 : AssignTaskListId.hashCode());
		result = prime * result + ((AssignUserId == null) ? 0 : AssignUserId.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof TaskListAssignmentId)) {
			return false;
		}
		TaskListAssignmentId other = (TaskListAssignmentId) obj;
		if (AssignTaskListId == null) {
			if (other.AssignTaskListId != null) {
				return false;
			}
		} else if (!AssignTaskListId.equals(other.AssignTaskListId)) {
			return false;
		}
		if (AssignUserId == null) {
			if (other.AssignUserId != null) {
				return false;
			}
		} else if (!AssignUserId.equals(other.AssignUserId)) {
			return false;
		}
		return true;
	}

	
//	public TaskListItems getAssignTaskListId() {
//		return AssignTaskListId;
//	}
//
//	public void setAssignTaskListId(TaskListItems assignTaskListId) {
//		AssignTaskListId = assignTaskListId;
//	}
//
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public TaskListUser getAssignUserId() {
//		return AssignUserId;
//	}
//
//	public void setAssignUserId(TaskListUser assignUserId) {
//		AssignUserId = assignUserId;
//	}
	
	
}
