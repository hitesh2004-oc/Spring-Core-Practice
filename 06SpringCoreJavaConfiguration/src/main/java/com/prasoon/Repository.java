package com.prasoon;

public class Repository {
	private int pathToStore; //ptd
	private String r;

	public Repository() {
		super();
	}
	
	public int getPathToStore() {
		return pathToStore;
	}

	public void setPathToStore(int pathToStore) {
		this.pathToStore = pathToStore;
	}

	public String getR() {
		return r;
	}

	public void setR(String r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Repository [pathToStore=" + pathToStore + ", r=" + r + "]";
	}
	
	
	

}
