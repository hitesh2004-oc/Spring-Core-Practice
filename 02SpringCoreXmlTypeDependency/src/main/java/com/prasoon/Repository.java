package com.prasoon;

public class Repository {
	private String entity;
 // Using Getter & Setter
	public Repository() {
		super();
	}

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	@Override
	public String toString() {
		return "Repository [entity=" + entity + "]";
	}
}
