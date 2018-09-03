package com.xiong.domain.entity;

/**
 * 用户
 * 
 * @author 广东技术师范学院 熊熊网学习平台
 * @date 2018年1月6日 上午10:46:49
 */
public class User {
	/**
	 * 用户id
	 */
	private Integer userId;

	/**
	 * 用户帐号
	 */
	private String usernum;

	/**
	 * 用户昵称
	 */
	private String username;

	/**
	 * 用户密码
	 */
	private String password;

	/**
	 * 用户email
	 */
	private String email;

	/**
	 * 用户性别
	 */
	private String sex;

	/**
	 * 用户年龄
	 */
	private Integer age;

	/**
	 * 用户手机号
	 */
	private String phone;

	/**
	 * 用户头像url
	 */
	private String icon;

	/**
	 * 用户管理员标识，1代表管理，0则否
	 */
	private Integer admin;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsernum() {
		return usernum;
	}

	public void setUsernum(String usernum) {
		this.usernum = usernum == null ? null : usernum.trim();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon == null ? null : icon.trim();
	}

	public Integer getAdmin() {
		return admin;
	}

	public void setAdmin(Integer admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", usernum=" + usernum + ", username=" + username + ", password=" + password
				+ ", email=" + email + ", sex=" + sex + ", age=" + age + ", phone=" + phone + ", icon=" + icon
				+ ", admin=" + admin + "]";
	}

}