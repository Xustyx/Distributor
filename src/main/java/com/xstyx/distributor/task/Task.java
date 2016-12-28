package com.xstyx.distributor.task;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.xstyx.distributor.resource.Resource;
import com.xstyx.distributor.work.Work;

public class Task {
	
	private int id;
	private Work work;
	private Resource resource;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name = "work_task_id")
	public Work getWork() {
		return work;
	}
	
	public void setWork(Work work) {
		this.work = work;
	}
	
	@ManyToOne
	@JoinColumn(name = "resource_task_id")
	public Resource getResource() {
		return resource;
	}
	
	public void setResource(Resource resource) {
		this.resource = resource;
	}
}
