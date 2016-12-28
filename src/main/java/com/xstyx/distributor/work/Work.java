package com.xstyx.distributor.work;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.xstyx.distributor.argument.Argument;
import com.xstyx.distributor.task.Task;

@Entity
public class Work {
	private int id;
	private Set<Task> tasks;
	private Set<Argument> arguments;
	private WorkType type;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@OneToMany(mappedBy = "work", cascade = CascadeType.ALL)
	public Set<Task> getTasks() {
		return tasks;
	}
	
	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}
	
	@OneToMany(mappedBy = "work", cascade = CascadeType.ALL)
	public Set<Argument> getArguments() {
		return arguments;
	}
	
	public void setArguments(Set<Argument> arguments) {
		this.arguments = arguments;
	}
	
	@Enumerated(EnumType.STRING)
	public WorkType getType() {
		return type;
	}
	
	public void setType(WorkType type) {
		this.type = type;
	}
}
