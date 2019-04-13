package com.xxzos.boot.vo;

import java.io.Serializable;

public class TemplateVO implements Serializable {

	private static final long serialVersionUID = 7452681619959768111L;
	private String userName;
	private Long userId;
	private String age;
	private String desc;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	

}
