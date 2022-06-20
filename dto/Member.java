package org.java.dto;

public class Member {
	private String name;
	private String userId;
	private String userPw;
	private int age;
	private String gender;
	public Member(String name, String userId, String userPw, int age, String gender) {
		super();
		this.name = name;
		this.userId = userId;
		this.userPw = userPw;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
