package tms.model;

import java.util.List;

public class CResultTaskListUser {
	private int status;
	private TaskListUser content; 
	private String reason;
	
	
	public CResultTaskListUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CResultTaskListUser(int status, TaskListUser content, String reason) {
		super();
		this.status = status;
		this.content = content;
		this.reason = reason;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public TaskListUser getContent() {
		return content;
	}
	public void setContent(TaskListUser x) {
		this.content = x;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
	
}
