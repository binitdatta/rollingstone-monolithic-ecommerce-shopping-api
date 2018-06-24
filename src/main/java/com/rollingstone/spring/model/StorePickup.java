package com.rollingstone.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Date;

@Entity(name = "store_pickup")
public class StorePickup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "OFFERID", nullable = false)
	private Long offerId;
	
	@Column(name = "PRODUCT_ID", nullable = false)
	private Long productId;
	
	@Column(name = "HIGHESTSTOREINDEX", nullable = false)
	private int highestStoreIndex;
	
	@Column(name = "RADIUS", nullable = false)
	private String radius;
	
	@Column(name = "STORENAME", nullable = false)
	private String storeName;
	
	@Column(name = "DAYS", nullable = false)
	private int days;
	

	@Column(name = "PROMISEDATE", nullable = false)
	private Date promoseDate;
	
	@Column(name = "INSTOCKSTATUS", nullable = false)
	private boolean inStockStatus;
	
	@Column(name = "QUANTITY", nullable = false)
	private int quantity;
	
	@Column(name = "AVAILABLEQUANTITY", nullable = false)
	private int availableQuantity;
	
	@Column(name = "ISAUTOSTORE", nullable = false)
	private boolean isAutostore;
	
	@Column(name = "NEAREST", nullable = false)
	private boolean isNearest;
	
	@Column(name = "STORENUMBER", nullable = false)
	private String storeNumber;
	
	@Column(name = "STREETADDRESS", nullable = false)
	private String streetAddress;
	
	@Column(name = "CITY", nullable = false)
	private String city;
	
	@Column(name = "STATE", nullable = false)
	private String state;
	
	@Column(name = "ZIPCODE", nullable = false)
	private String zipCode;
	
	@Column(name = "PHONE", nullable = false)
	private String phone;
	
	@Column(name = "SUNWH", nullable = false)
	private String sundayWorkingHours;
	
	@Column(name = "MONWH", nullable = false)
	private String mondayWorkingHours;
	
	@Column(name = "TUEWH", nullable = false)
	private String tuesdayWorkingHours;
	
	@Column(name = "WEDWH", nullable = false)
	private String wednesdayWorkingHours;
	
	@Column(name = "THURWH", nullable = false)
	private String thursdayWorkingHours;
	
	
	
	@Column(name = "FRIWH", nullable = false)
	private String fridayWorkingHours;
	
	@Column(name = "SATWH", nullable = false)
	private String saturdayWorkingHours;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOfferId() {
		return offerId;
	}

	public void setOfferId(Long offerId) {
		this.offerId = offerId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public int getHighestStoreIndex() {
		return highestStoreIndex;
	}

	public void setHighestStoreIndex(int highestStoreIndex) {
		this.highestStoreIndex = highestStoreIndex;
	}

	public String getRadius() {
		return radius;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public Date getPromoseDate() {
		return promoseDate;
	}

	public void setPromoseDate(Date promoseDate) {
		this.promoseDate = promoseDate;
	}

	public boolean getInStockStatus() {
		return inStockStatus;
	}

	public void setInStockStatus(boolean inStockStatus) {
		this.inStockStatus = inStockStatus;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public boolean isAutostore() {
		return isAutostore;
	}

	public void setAutostore(boolean isAutostore) {
		this.isAutostore = isAutostore;
	}

	public boolean isNearest() {
		return isNearest;
	}

	public void setNearest(boolean isNearest) {
		this.isNearest = isNearest;
	}

	public String getStoreNumber() {
		return storeNumber;
	}

	public void setStoreNumber(String storeNumber) {
		this.storeNumber = storeNumber;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSundayWorkingHours() {
		return sundayWorkingHours;
	}

	public void setSundayWorkingHours(String sundayWorkingHours) {
		this.sundayWorkingHours = sundayWorkingHours;
	}

	public String getMondayWorkingHours() {
		return mondayWorkingHours;
	}

	public void setMondayWorkingHours(String mondayWorkingHours) {
		this.mondayWorkingHours = mondayWorkingHours;
	}

	public String getTuesdayWorkingHours() {
		return tuesdayWorkingHours;
	}

	public void setTuesdayWorkingHours(String tuesdayWorkingHours) {
		this.tuesdayWorkingHours = tuesdayWorkingHours;
	}

	public String getWednesdayWorkingHours() {
		return wednesdayWorkingHours;
	}

	public void setWednesdayWorkingHours(String wednesdayWorkingHours) {
		this.wednesdayWorkingHours = wednesdayWorkingHours;
	}

	public String getThursdayWorkingHours() {
		return thursdayWorkingHours;
	}

	public void setThursdayWorkingHours(String thursdayWorkingHours) {
		this.thursdayWorkingHours = thursdayWorkingHours;
	}

	public String getFridayWorkingHours() {
		return fridayWorkingHours;
	}

	public void setFridayWorkingHours(String fridayWorkingHours) {
		this.fridayWorkingHours = fridayWorkingHours;
	}

	public String getSaturdayWorkingHours() {
		return saturdayWorkingHours;
	}

	public void setSaturdayWorkingHours(String saturdayWorkingHours) {
		this.saturdayWorkingHours = saturdayWorkingHours;
	}

	@Override
	public String toString() {
		return "StorePickup [id=" + id + ", offerId=" + offerId + ", productId=" + productId + ", highestStoreIndex="
				+ highestStoreIndex + ", radius=" + radius + ", storeName=" + storeName + ", days=" + days
				+ ", promoseDate=" + promoseDate + ", inStockStatus=" + inStockStatus + ", quantity=" + quantity
				+ ", availableQuantity=" + availableQuantity + ", isAutostore=" + isAutostore + ", isNearest="
				+ isNearest + ", storeNumber=" + storeNumber + ", streetAddress=" + streetAddress + ", city=" + city
				+ ", state=" + state + ", zipCode=" + zipCode + ", phone=" + phone + ", sundayWorkingHours="
				+ sundayWorkingHours + ", mondayWorkingHours=" + mondayWorkingHours + ", tuesdayWorkingHours="
				+ tuesdayWorkingHours + ", wednesdayWorkingHours=" + wednesdayWorkingHours + ", thursdayWorkingHours="
				+ thursdayWorkingHours + ", fridayWorkingHours=" + fridayWorkingHours + ", saturdayWorkingHours="
				+ saturdayWorkingHours + "]";
	}

	

	
	
	public StorePickup(Long id, Long offerId, Long productId, int highestStoreIndex, String radius, String storeName,
			int days, Date promoseDate, boolean inStockStatus, int quantity, int availableQuantity, boolean isAutostore,
			boolean isNearest, String storeNumber, String streetAddress, String city, String state, String zipCode,
			String phone, String sundayWorkingHours, String mondayWorkingHours, String tuesdayWorkingHours,
			String wednesdayWorkingHours, String thursdayWorkingHours, String fridayWorkingHours,
			String saturdayWorkingHours) {
		super();
		this.id = id;
		this.offerId = offerId;
		this.productId = productId;
		this.highestStoreIndex = highestStoreIndex;
		this.radius = radius;
		this.storeName = storeName;
		this.days = days;
		this.promoseDate = promoseDate;
		this.inStockStatus = inStockStatus;
		this.quantity = quantity;
		this.availableQuantity = availableQuantity;
		this.isAutostore = isAutostore;
		this.isNearest = isNearest;
		this.storeNumber = storeNumber;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phone = phone;
		this.sundayWorkingHours = sundayWorkingHours;
		this.mondayWorkingHours = mondayWorkingHours;
		this.tuesdayWorkingHours = tuesdayWorkingHours;
		this.wednesdayWorkingHours = wednesdayWorkingHours;
		this.thursdayWorkingHours = thursdayWorkingHours;
		this.fridayWorkingHours = fridayWorkingHours;
		this.saturdayWorkingHours = saturdayWorkingHours;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + availableQuantity;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + days;
		result = prime * result + ((fridayWorkingHours == null) ? 0 : fridayWorkingHours.hashCode());
		result = prime * result + highestStoreIndex;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (inStockStatus ? 1231 : 1237);
		result = prime * result + (isAutostore ? 1231 : 1237);
		result = prime * result + (isNearest ? 1231 : 1237);
		result = prime * result + ((mondayWorkingHours == null) ? 0 : mondayWorkingHours.hashCode());
		result = prime * result + ((offerId == null) ? 0 : offerId.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + ((promoseDate == null) ? 0 : promoseDate.hashCode());
		result = prime * result + quantity;
		result = prime * result + ((radius == null) ? 0 : radius.hashCode());
		result = prime * result + ((saturdayWorkingHours == null) ? 0 : saturdayWorkingHours.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((storeName == null) ? 0 : storeName.hashCode());
		result = prime * result + ((storeNumber == null) ? 0 : storeNumber.hashCode());
		result = prime * result + ((streetAddress == null) ? 0 : streetAddress.hashCode());
		result = prime * result + ((sundayWorkingHours == null) ? 0 : sundayWorkingHours.hashCode());
		result = prime * result + ((thursdayWorkingHours == null) ? 0 : thursdayWorkingHours.hashCode());
		result = prime * result + ((tuesdayWorkingHours == null) ? 0 : tuesdayWorkingHours.hashCode());
		result = prime * result + ((wednesdayWorkingHours == null) ? 0 : wednesdayWorkingHours.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StorePickup other = (StorePickup) obj;
		if (availableQuantity != other.availableQuantity)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (days != other.days)
			return false;
		if (fridayWorkingHours == null) {
			if (other.fridayWorkingHours != null)
				return false;
		} else if (!fridayWorkingHours.equals(other.fridayWorkingHours))
			return false;
		if (highestStoreIndex != other.highestStoreIndex)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (inStockStatus != other.inStockStatus)
			return false;
		if (isAutostore != other.isAutostore)
			return false;
		if (isNearest != other.isNearest)
			return false;
		if (mondayWorkingHours == null) {
			if (other.mondayWorkingHours != null)
				return false;
		} else if (!mondayWorkingHours.equals(other.mondayWorkingHours))
			return false;
		if (offerId == null) {
			if (other.offerId != null)
				return false;
		} else if (!offerId.equals(other.offerId))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (promoseDate == null) {
			if (other.promoseDate != null)
				return false;
		} else if (!promoseDate.equals(other.promoseDate))
			return false;
		if (quantity != other.quantity)
			return false;
		if (radius == null) {
			if (other.radius != null)
				return false;
		} else if (!radius.equals(other.radius))
			return false;
		if (saturdayWorkingHours == null) {
			if (other.saturdayWorkingHours != null)
				return false;
		} else if (!saturdayWorkingHours.equals(other.saturdayWorkingHours))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (storeName == null) {
			if (other.storeName != null)
				return false;
		} else if (!storeName.equals(other.storeName))
			return false;
		if (storeNumber == null) {
			if (other.storeNumber != null)
				return false;
		} else if (!storeNumber.equals(other.storeNumber))
			return false;
		if (streetAddress == null) {
			if (other.streetAddress != null)
				return false;
		} else if (!streetAddress.equals(other.streetAddress))
			return false;
		if (sundayWorkingHours == null) {
			if (other.sundayWorkingHours != null)
				return false;
		} else if (!sundayWorkingHours.equals(other.sundayWorkingHours))
			return false;
		if (thursdayWorkingHours == null) {
			if (other.thursdayWorkingHours != null)
				return false;
		} else if (!thursdayWorkingHours.equals(other.thursdayWorkingHours))
			return false;
		if (tuesdayWorkingHours == null) {
			if (other.tuesdayWorkingHours != null)
				return false;
		} else if (!tuesdayWorkingHours.equals(other.tuesdayWorkingHours))
			return false;
		if (wednesdayWorkingHours == null) {
			if (other.wednesdayWorkingHours != null)
				return false;
		} else if (!wednesdayWorkingHours.equals(other.wednesdayWorkingHours))
			return false;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		return true;
	}

	public StorePickup() {
		super();
	}
	
}
