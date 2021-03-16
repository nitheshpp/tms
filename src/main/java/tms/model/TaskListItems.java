package tms.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class TaskListItems implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	
	@OneToMany(mappedBy = "AssignTaskListId",targetEntity = TaskListAssignment.class)
	private List<TaskListAssignment> tlAssign;
	
	@ManyToOne
	@JoinColumn(name="TaskListId")
//	TaskListName tlTaskListID;
	
	
	long ownerUserId;
	Date createdDate;
	Date ModefiedDate;
	String Subject;
	String Body;
	
	@ManyToOne
	@JoinColumn(name="statusId")
	TaskListStatus tlStatusID;
	
	@ManyToOne
	@JoinColumn(name="CategoryId")
	TaskListCategories tlCategoryID;

	public TaskListItems() {
		
		// TODO Auto-generated constructor stub
	}

	

	public TaskListItems(  long ownerUserId,
			Date createdDate, Date modefiedDate, String subject, String body, TaskListStatus tlStatusID,
			TaskListCategories tlCategoryID) {
		

//		this.tlAssign = tlAssign;
//		this.tlTaskListID = tlTaskListID;
		this.ownerUserId = ownerUserId;
		this.createdDate = createdDate;
		ModefiedDate = modefiedDate;
		Subject = subject;
		Body = body;
		this.tlStatusID = tlStatusID;
		this.tlCategoryID = tlCategoryID;
	}



//	public List<TaskListAssignment> getTlAssign() {
//		return tlAssign;
//	}
//
//	public void setTlAssign(List<TaskListAssignment> tlAssign) {
//		this.tlAssign = tlAssign;
//	}

	



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

//	public TaskListName getTlTaskListID() {
//		return tlTaskListID;
//	}
//
//	public void setTlTaskListID(TaskListName tlTaskListID) {
//		this.tlTaskListID = tlTaskListID;
//	}

	public long getOwnerUserId() {
		return ownerUserId;
	}

	public void setOwnerUserId(long ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModefiedDate() {
		return ModefiedDate;
	}

	public void setModefiedDate(Date modefiedDate) {
		ModefiedDate = modefiedDate;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getBody() {
		return Body;
	}

	public void setBody(String body) {
		Body = body;
	}

	public TaskListStatus getTlStatusID() {
		return tlStatusID;
	}

	public void setTlStatusID(TaskListStatus tlStatusID) {
		this.tlStatusID = tlStatusID;
	}

	public TaskListCategories getTlCategoryID() {
		return tlCategoryID;
	}

	public void setTlCategoryID(TaskListCategories tlCategoryID) {
		this.tlCategoryID = tlCategoryID;
	}
	
	
}
