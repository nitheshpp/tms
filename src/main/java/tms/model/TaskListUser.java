package tms.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TaskListUser implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@OneToMany(mappedBy = "AssignUserId",targetEntity = TaskListAssignment.class)
	private List<TaskListAssignment> tlAssign;
	
	
	String userName;
	String passwordHash;
	Long mobileNo;
	boolean isManager;
	boolean isAdministrator;
	
	public TaskListUser() {
		
		// TODO Auto-generated constructor stub
	}
	
	public TaskListUser(String userName, String passwordHash, long mobileNo,boolean isManager, boolean isAdministrator) {
		
		this.tlAssign = tlAssign;

		this.userName = userName;
		this.passwordHash = passwordHash;
		this.mobileNo = mobileNo;
		this.isManager = isManager;
		this.isAdministrator = isAdministrator;
	}
	
	
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<TaskListAssignment> getTlAssign() {
		return tlAssign;
	}
	public void setTlAssign(List<TaskListAssignment> tlAssign) {
		this.tlAssign = tlAssign;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	public boolean isManager() {
		return isManager;
	}
	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}
	public boolean isAdministrator() {
		return isAdministrator;
	}
	public void setAdministrator(boolean isAdministrator) {
		this.isAdministrator = isAdministrator;
	}
	
	
	
}
