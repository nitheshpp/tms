package tms.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class TaskListCategories implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@OneToMany(mappedBy = "tlCategoryID",targetEntity = TaskListItems.class)
	private List<TaskListItems> tlItemCategory;
	
	@Column(unique=true)
	String description;

	public TaskListCategories() {
		
		// TODO Auto-generated constructor stub
	}

	public TaskListCategories( String description) {
		
//		this.tlItemCategory = tlItemCategory;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

//	public List<TaskListItems> getTlItemCategory() {
//		return tlItemCategory;
//	}
//
//	public void setTlItemCategory(List<TaskListItems> tlItemCategory) {
//		this.tlItemCategory = tlItemCategory;
//	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
