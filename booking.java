package com.test.hibernate.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOKING")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "BOOKING_ID", nullable = false)
	private Integer bookingId;
	@Column(name = "USER_ID", nullable = false)
	private Integer userId;
	@Column(name = "PLACE_ID", nullable = false)
	private Integer placeId;
	@Column(name = "BOOK_TIME", nullable = false)
	private Time bookTime;
	@Column(name = "BOOK_DATE", nullable = false)
	private Date bookDate;
	@Column(name = "AGENT_ID", nullable = false)
	private Integer agentId;
	@Column(name = "is_deleted", nullable = false)
	private String isDeleted;
	@Column(name = "created_dt", nullable = false)
	private Date created_dt;
	@Column(name = "updated_dt", nullable = false)
	private Date updated_dt;
	@Column(name = "amount", nullable = false)
	private String amount;
	@Column(name = "MONTH")
	private String month;
	@Column(name = "status", nullable = false)
	private String status;
	@Column(name = "is_bussiness", nullable = false)
	private String isBussiness;
	@Column(name = "vechical_number", nullable = false)
	private String vechicalNumber;

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
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

	public Time getBookTime() {
		return bookTime;
	}

	public void setBookTime(Time bookTime) {
		this.bookTime = bookTime;
	}

	public Date getBookDate() {
		return bookDate;
	}

	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}

	public Integer getAgentId() {
		return agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
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

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIsBussiness() {
		return isBussiness;
	}

	public void setIsBussiness(String isBussiness) {
		this.isBussiness = isBussiness;
	}

	public String getVechicalNumber() {
		return vechicalNumber;
	}

	public void setVechicalNumber(String vechicalNumber) {
		this.vechicalNumber = vechicalNumber;
	}

}
