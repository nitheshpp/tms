package tms.model;

import java.util.List;

public class CResultTaskListAssignment {
	private int status;
	 
	private String reason;

	public CResultTaskListAssignment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CResultTaskListAssignment(int status, String reason) {
		super();
		this.status = status;
		this.reason = reason;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
}
