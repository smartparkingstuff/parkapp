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
@Table(name = "PLACE_LIST")
public class Place {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "PLACE_ID", nullable = false)
	private Integer placeId;
	@Column(name = "PLACE_NAME", nullable = false)
	private String placeName;
	@Column(name = "DETAILS_ADDRESS", nullable = false)
	private String detailAddress;
	@Column(name = "TOTAL_SPACE", nullable = false)
	private Integer totalSpace;
	@Column(name = "is_deleted", nullable = false)
	private String isDeleted;
	@Column(name = "created_dt", nullable = false)
	private Date created_dt;
	@Column(name = "updated_dt", nullable = false)
	private Date updated_dt;
	@Column(name = "OPEN_TIMEING", nullable = false)
	private Time openTimeing;
	@Column(name = "CLOSE_TIMEING", nullable = false)
	private Time closeTimeing;
	@Column(name = "status", nullable = false)
	private String status;
	@Column(name = "PRICE", nullable = false)
	private Integer price;
	@Column(name = "CITY_ID", nullable = false)
	private Integer cityId;
	@Column(name = "type", nullable = false)
	private String type;
	@Column(name = "OWNER_ID", nullable = false)
	private Integer ownerId;
	@Column(name = "IS_BUSSINESS", nullable = false)
	private String isBussiness;
	@Column(name = "LATITUDE", nullable = false)
	private String latitude;
	@Column(name = "LONGITUDE", nullable = false)
	private Integer LONGITUDE;

	public Integer getPlaceId() {
		return placeId;
	}

	public void setPlaceId(Integer placeId) {
		this.placeId = placeId;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getDetailAddress() {
		return detailAddress;
	}

	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public Integer getTotalSpace() {
		return totalSpace;
	}

	public void setTotalSpace(Integer totalSpace) {
		this.totalSpace = totalSpace;
	}

	public Time getOpenTimeing() {
		return openTimeing;
	}

	public void setOpenTimeing(Time openTimeing) {
		this.openTimeing = openTimeing;
	}

	public Time getCloseTimeing() {
		return closeTimeing;
	}

	public void setCloseTimeing(Time closeTimeing) {
		this.closeTimeing = closeTimeing;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	public String getIsBussiness() {
		return isBussiness;
	}

	public void setIsBussiness(String isBussiness) {
		this.isBussiness = isBussiness;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public Integer getLONGITUDE() {
		return LONGITUDE;
	}

	public void setLONGITUDE(Integer lONGITUDE) {
		LONGITUDE = lONGITUDE;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
