package com.bigdata.ant;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @ClassName:Organization
 * @Description:TODO（组织类）
 * @Author 成琼
 * @Date:2018年11月22日
 *
 */
@Entity
@Table(name = "organization_user")
public class Organization {
	private int id;
	private String email;
	private String password;
	private String name;
	private Set<Activity> activities = new HashSet<Activity>();

	public Organization() {
		// TODO Auto-generated constructor stub
	}

	@Column(name = "organization_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	@OneToMany(mappedBy = "organization", targetEntity = Activity.class, cascade = CascadeType.ALL)
	public Set<Activity> getActivities() {
		return activities;
	}

	public void setActivities(Set<Activity> activities) {
		this.activities = activities;
	}

}
