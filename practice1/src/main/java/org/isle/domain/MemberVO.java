package org.isle.domain;

import java.sql.Date;

public class MemberVO {
	//수정 6:23
	// 커밋을 먼저 하고~! 풀 합니다.
	private String userid;
	private String upw;
	private String uname;
	private String email;
	private String phone;
	private Date birth;
	private String gender;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "MemberVO [userid=" + userid + ", upw=" + upw + ", uname=" + uname + ", email=" + email + ", phone="
				+ phone + ", birth=" + birth + ", gender=" + gender + "]";
	}
	

}
