package com.bigdata.ant.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 
 * @ClassName:Student
 * @Description:TODO（学生类）
 * @Author 成琼
 * @Date:2018年11月22日
 *
 */
@Entity
@Table(name = "student_user")
public class Student {
	private String id;
	private String password;
	private String name;
	private String gender;
	private String email;
	private ClassInfo classInfo;
	private List<Activity> scanedActivities = new ArrayList<Activity>();
	private List<ActivityJoin> joinedActivities = new ArrayList<ActivityJoin>();

	public Student() {
	}

	@Id
	@GenericGenerator(name = "assigned-generator", strategy = "assigned")
	@GeneratedValue(generator = "assigned-generator")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@ManyToOne
	@JoinColumn(name = "class_id")
	public ClassInfo getClassInfo() {
		return classInfo;
	}

	public void setClassInfo(ClassInfo classInfo) {
		this.classInfo = classInfo;
	}

	@ManyToMany
	@JoinTable(name = "student_scan", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "activity_id"))
	public List<Activity> getScanedActivities() {
		return scanedActivities;
	}

	public void setScanedActivities(List<Activity> scanedActivities) {
		this.scanedActivities = scanedActivities;
	}

	@OneToMany(mappedBy = "student", targetEntity = ActivityJoin.class, cascade = CascadeType.ALL)
	public List<ActivityJoin> getJoinedActivities() {
		return joinedActivities;
	}

	public void setJoinedActivities(List<ActivityJoin> joinedActivities) {
		this.joinedActivities = joinedActivities;
	}

}
