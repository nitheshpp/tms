package tms.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class TaskListAssignment {
	@EmbeddedId
	private TaskListAssignmentId assignId;

	public TaskListAssignmentId getAssignId() {
		return assignId;
	}

	public void setAssignId(TaskListAssignmentId assignId) {
		this.assignId = assignId;
	}
	
}
