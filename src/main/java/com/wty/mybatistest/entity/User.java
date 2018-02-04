package com.wty.mybatistest.entity;

public class User extends BaseEntity {

	private static final long serialVersionUID = 7388438695959089782L;

	private String userName;

	private int age;

	public String getUserName() {

		return userName;
	}

	public void setUserName(String userName) {

		this.userName = userName;
	}

	public int getAge() {

		return age;
	}

	public void setAge(int age) {

		this.age = age;
	}


}
