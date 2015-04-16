package com.test.hibernate.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FAV_TBL")
public class Favtbl {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "FAV_ID", nullable = false)
	private Integer favId;
	@Column(name = "USER_ID", nullable = false)
	private Integer userId;
	@Column(name = "place_id", nullable = false)
	private Integer placeId;
	@Column(name = "count", nullable = false)
	private Integer count;
	@Column(name = "is_deleted", nullable = false)
	private String isDeleted;
	@Column(name = "created_dt", nullable = false)
	private Date created_dt;
	@Column(name = "updated_dt", nullable = false)
	private Date updated_dt;

	

	public Integer getFavId() {
		return favId;
	}

	public void setFavId(Integer favId) {
		this.favId = favId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getPlaceId() {
		return placeId;
	}

	public void setPlaceId(Integer placeId) {
		this.placeId = placeId;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Date getCreated_dt() {
		return created_dt;
	}

	public void setCreated_dt(Date created_dt) {
		this.created_dt = created_dt;
	}

	public Date getUpdated_dt() {
		return updated_dt;
	}

	public void setUpdated_dt(Date updated_dt) {
		this.updated_dt = updated_dt;
	}
}
