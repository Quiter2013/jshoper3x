package com.jshop.entity;

// Generated 2014-5-22 20:36:00 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * KeywordT generated by hbm2java
 */
@Entity
@Table(name = "keyword_t", catalog = "jshoper3")
public class KeywordT implements java.io.Serializable {

	private String keywordid;
	private String keywordname;
	private Integer searchCount;
	private Integer sort;
	private String type;
	private String state;
	private Date createtime;
	private String creatorid;

	public KeywordT() {
	}

	public KeywordT(String keywordid, String keywordname, String type,
			String state, Date createtime, String creatorid) {
		this.keywordid = keywordid;
		this.keywordname = keywordname;
		this.type = type;
		this.state = state;
		this.createtime = createtime;
		this.creatorid = creatorid;
	}

	public KeywordT(String keywordid, String keywordname, Integer searchCount,
			Integer sort, String type, String state, Date createtime,
			String creatorid) {
		this.keywordid = keywordid;
		this.keywordname = keywordname;
		this.searchCount = searchCount;
		this.sort = sort;
		this.type = type;
		this.state = state;
		this.createtime = createtime;
		this.creatorid = creatorid;
	}

	@Id
	@Column(name = "KEYWORDID", unique = true, nullable = false, length = 20)
	public String getKeywordid() {
		return this.keywordid;
	}

	public void setKeywordid(String keywordid) {
		this.keywordid = keywordid;
	}

	@Column(name = "KEYWORDNAME", nullable = false, length = 45)
	public String getKeywordname() {
		return this.keywordname;
	}

	public void setKeywordname(String keywordname) {
		this.keywordname = keywordname;
	}

	@Column(name = "SEARCH_COUNT")
	public Integer getSearchCount() {
		return this.searchCount;
	}

	public void setSearchCount(Integer searchCount) {
		this.searchCount = searchCount;
	}

	@Column(name = "SORT")
	public Integer getSort() {
		return this.sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	@Column(name = "TYPE", nullable = false, length = 1)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
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

}
