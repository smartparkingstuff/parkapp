package com.test.hibernate.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AGENT")
public class Agent {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "AGENT_ID", nullable = false)
	private Integer agentId;
	@Column(name = "OWNER_ID", nullable = false)
	private Integer ownerId;
	@Column(name = "USER_ID", nullable = false)
	private Integer userId;
	@Column(name = "AGENT_ID", nullable = false)
	private Integer placeId;
	@Column(name = "is_deleted", nullable = false)
	private String isDeleted;
	@Column(name = "is_bussiness", nullable = false)
	private String isBussiness;
	@Column(name = "status", nullable = false)
	private String status;
	@Column(name = "created_dt", nullable = false)
	private Date created_dt;
	@Column(name = "updated_dt", nullable = false)
	private Date updated_dt;

	public Integer getAgentId() {
		return agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
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

	public String getIsBussiness() {
		return isBussiness;
	}

	public void setIsBussiness(String isBussiness) {
		this.isBussiness = isBussiness;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
