package com.zaloni.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ToDo {
	
	@Id
	private int id;
	private String name;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ToDo [id=" + id + ", name=" + name + ", status=" + status + "]";
	}
	
	

}
