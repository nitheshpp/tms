package tms.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class TaskListStatus implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	
	
	
	@OneToMany(mappedBy = "tlStatusID",targetEntity = TaskListItems.class)
	private List<TaskListItems> tlItemStatusId;
	
	@Column(unique=true)
	String StatusDescription;

	public TaskListStatus() {
		
		// TODO Auto-generated constructor stub
	}

	public TaskListStatus(String statusDescription) {
		
		

		this.tlItemStatusId = tlItemStatusId;
		StatusDescription = statusDescription;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}



	public List<TaskListItems> getTlItemStatusId() {
		return tlItemStatusId;
	}

	public void setTlItemStatusId(List<TaskListItems> tlItemStatusId) {
		this.tlItemStatusId = tlItemStatusId;
	}

	public String getStatusDescription() {
		return StatusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		StatusDescription = statusDescription;
	}

	
}
