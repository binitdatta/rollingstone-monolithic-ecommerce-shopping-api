package com.rollingstone.spring.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "SHIPPING")
public class Shipping {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	@Column(name = "OFFERID", nullable = false)
	private Long offerId;
	
	@Column(name = "PRODUCT_ID", nullable = false)
	private Long productId;
	
	@Column(name = "ISAVAILABLE", nullable = false)
	private boolean isAvailable;
	
	@Column(name = "ARRIVALDATE", nullable = false)
	private Date availableDate;
	
	@Column(name = "ISFREE", nullable = false)
	private boolean isFree;
	
	@Column(name = "DAYSINTRANSIT", nullable = false)
	private int daysInTransit;
	
	@Column(name = "SHIPPINGCHARGE", nullable = false)
	private Double shippingCharge;
	
	@Column(name = "ISFREESHIPPINGFORMEMBERS", nullable = false)
	private boolean isFreeShippingForMembers;
	
	@Column(name = "SHIPPINGMODE", nullable = false)
	private String shippingMode;
	
	@Column(name = "SHIPCARRIER", nullable = false)
	private String shipCarrier;

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

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Date getAvailableDate() {
		return availableDate;
	}

	public void setAvailableDate(Date availableDate) {
		this.availableDate = availableDate;
	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

	public int getDaysInTransit() {
		return daysInTransit;
	}

	public void setDaysInTransit(int daysInTransit) {
		this.daysInTransit = daysInTransit;
	}

	public Double getShippingCharge() {
		return shippingCharge;
	}

	public void setShippingCharge(Double shippingCharge) {
		this.shippingCharge = shippingCharge;
	}

	public boolean isFreeShippingForMembers() {
		return isFreeShippingForMembers;
	}

	public void setFreeShippingForMembers(boolean isFreeShippingForMembers) {
		this.isFreeShippingForMembers = isFreeShippingForMembers;
	}

	public String getShippingMode() {
		return shippingMode;
	}

	public void setShippingMode(String shippingMode) {
		this.shippingMode = shippingMode;
	}

	public String getShipCarrier() {
		return shipCarrier;
	}

	public void setShipCarrier(String shipCarrier) {
		this.shipCarrier = shipCarrier;
	}

	@Override
	public String toString() {
		return "Shipping [id=" + id + ", offerId=" + offerId + ", productId=" + productId + ", isAvailable=" + isAvailable
				+ ", availableDate=" + availableDate + ", isFree=" + isFree + ", daysInTransit=" + daysInTransit
				+ ", shippingCharge=" + shippingCharge + ", isFreeShippingForMembers=" + isFreeShippingForMembers
				+ ", shippingMode=" + shippingMode + ", shipCarrier=" + shipCarrier + "]";
	}

	public Shipping(Long id, Long offerId, Long productId,
			boolean isAvailable, Date availableDate, boolean isFree, int daysInTransit, Double shippingCharge,
			boolean isFreeShippingForMembers, String shippingMode, String shipCarrier) {
		super();
		this.id = id;
		this.offerId = offerId;
		this.productId = productId;
		this.isAvailable = isAvailable;
		this.availableDate = availableDate;
		this.isFree = isFree;
		this.daysInTransit = daysInTransit;
		this.shippingCharge = shippingCharge;
		this.isFreeShippingForMembers = isFreeShippingForMembers;
		this.shippingMode = shippingMode;
		this.shipCarrier = shipCarrier;
	}

	public Shipping() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((availableDate == null) ? 0 : availableDate.hashCode());
		result = prime * result + daysInTransit;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (isAvailable ? 1231 : 1237);
		result = prime * result + (isFree ? 1231 : 1237);
		result = prime * result + (isFreeShippingForMembers ? 1231 : 1237);
		result = prime * result + ((offerId == null) ? 0 : offerId.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + ((shipCarrier == null) ? 0 : shipCarrier.hashCode());
		result = prime * result + ((shippingCharge == null) ? 0 : shippingCharge.hashCode());
		result = prime * result + ((shippingMode == null) ? 0 : shippingMode.hashCode());
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
		Shipping other = (Shipping) obj;
		if (availableDate == null) {
			if (other.availableDate != null)
				return false;
		} else if (!availableDate.equals(other.availableDate))
			return false;
		if (daysInTransit != other.daysInTransit)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isAvailable != other.isAvailable)
			return false;
		if (isFree != other.isFree)
			return false;
		if (isFreeShippingForMembers != other.isFreeShippingForMembers)
			return false;
		if (offerId == null) {
			if (other.offerId != null)
				return false;
		} else if (!offerId.equals(other.offerId))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (shipCarrier == null) {
			if (other.shipCarrier != null)
				return false;
		} else if (!shipCarrier.equals(other.shipCarrier))
			return false;
		if (shippingCharge == null) {
			if (other.shippingCharge != null)
				return false;
		} else if (!shippingCharge.equals(other.shippingCharge))
			return false;
		if (shippingMode == null) {
			if (other.shippingMode != null)
				return false;
		} else if (!shippingMode.equals(other.shippingMode))
			return false;
		return true;
	}

}
