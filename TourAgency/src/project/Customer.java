package project;

public class Customer {
	
	private int id;
    private	String name;
	private String SureName;
	private boolean isLicensed;
	private String gender;
	
	
	public Customer(int id, String name, String sureName, boolean isLicensed, String gender) {
		super();
		this.id = id;
		this.name = name;
		SureName = sureName;
		this.isLicensed = isLicensed;
		this.gender = gender;
	}


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


	public String getSureName() {
		return SureName;
	}


	public void setSureName(String sureName) {
		SureName = sureName;
	}


	public boolean isLicensed() {
		return isLicensed;
	}


	public void setLicensed(boolean isLicensed) {
		this.isLicensed = isLicensed;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	

}
