package com.jshop.entity;

// Generated 2014-5-22 20:36:00 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * ActIdUser generated by hbm2java
 */
@Entity
@Table(name = "act_id_user", catalog = "jshoper3")
public class ActIdUser implements java.io.Serializable {

	private String id;
	private Integer rev;
	private String first;
	private String last;
	private String email;
	private String pwd;
	private String pictureId;
	private Set<ActIdGroup> actIdGroups = new HashSet<ActIdGroup>(0);

	public ActIdUser() {
	}

	public ActIdUser(String id) {
		this.id = id;
	}

	public ActIdUser(String id, Integer rev, String first, String last,
			String email, String pwd, String pictureId,
			Set<ActIdGroup> actIdGroups) {
		this.id = id;
		this.rev = rev;
		this.first = first;
		this.last = last;
		this.email = email;
		this.pwd = pwd;
		this.pictureId = pictureId;
		this.actIdGroups = actIdGroups;
	}

	@Id
	@Column(name = "ID_", unique = true, nullable = false, length = 64)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "REV_")
	public Integer getRev() {
		return this.rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

	@Column(name = "FIRST_")
	public String getFirst() {
		return this.first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	@Column(name = "LAST_")
	public String getLast() {
		return this.last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	@Column(name = "EMAIL_")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "PWD_")
	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Column(name = "PICTURE_ID_", length = 64)
	public String getPictureId() {
		return this.pictureId;
	}

	public void setPictureId(String pictureId) {
		this.pictureId = pictureId;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "act_id_membership", catalog = "jshoper3", joinColumns = { @JoinColumn(name = "USER_ID_", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "GROUP_ID_", nullable = false, updatable = false) })
	public Set<ActIdGroup> getActIdGroups() {
		return this.actIdGroups;
	}

	public void setActIdGroups(Set<ActIdGroup> actIdGroups) {
		this.actIdGroups = actIdGroups;
	}

}
