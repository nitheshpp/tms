package tms.model;

import java.util.List;

public class CResultListItems {
	
	private int status;
	private List<TaskListItems> content; 
	private String reason;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public List<TaskListItems> getContent() {
		return content;
	}
	public void setContent(List<TaskListItems> content) {
		this.content = content;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public CResultListItems() {
		// TODO Auto-generated constructor stub
	}
	public CResultListItems(int status, List<TaskListItems> content, String reason) {

		this.status = status;
		this.content = content;
		this.reason = reason;
	}
	
	
	
	
	

}
