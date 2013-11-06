package com.jshop.entity;

// Generated 2013-11-6 21:30:30 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NoticeT generated by hbm2java
 */
@Entity
@Table(name = "notice_t", catalog = "jshoper3")
public class NoticeT implements java.io.Serializable {

	private String noticeid;
	private String title;
	private String content;
	private Date createtime;
	private String creatorid;
	private String noticenlname;
	private String noticenlid;

	public NoticeT() {
	}

	public NoticeT(String noticeid, String title, String content,
			Date createtime, String creatorid, String noticenlname,
			String noticenlid) {
		this.noticeid = noticeid;
		this.title = title;
		this.content = content;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.noticenlname = noticenlname;
		this.noticenlid = noticenlid;
	}

	@Id
	@Column(name = "NOTICEID", unique = true, nullable = false, length = 20)
	public String getNoticeid() {
		return this.noticeid;
	}

	public void setNoticeid(String noticeid) {
		this.noticeid = noticeid;
	}

	@Column(name = "TITLE", nullable = false, length = 50)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "CONTENT", nullable = false, length = 65535)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Column(name = "NOTICENLNAME", nullable = false, length = 50)
	public String getNoticenlname() {
		return this.noticenlname;
	}

	public void setNoticenlname(String noticenlname) {
		this.noticenlname = noticenlname;
	}

	@Column(name = "NOTICENLID", nullable = false, length = 20)
	public String getNoticenlid() {
		return this.noticenlid;
	}

	public void setNoticenlid(String noticenlid) {
		this.noticenlid = noticenlid;
	}

}
