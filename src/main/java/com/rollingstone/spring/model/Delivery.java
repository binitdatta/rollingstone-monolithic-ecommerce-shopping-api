package com.rollingstone.spring.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "delivery")
public class Delivery {

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
	
	@Column(name = "DAYSINTRANSIT", nullable = false)
	private int daysInTransit;
	
	@Column(name = "DELIVERYCHARGE", nullable = false)
	private Double deleveryCharge;

	@Column(name = "ISFREEDELIVERYFORMEMBERS", nullable = false)
	private boolean isFreeDeliveryAvailable;
	
	@Column(name = "HAULAWAYMESSAGE", nullable = false)
	private String haulsAwayMessage;
	
	@Column(name = "HASSPECIALOFFERS", nullable = false)
	private boolean hasSpecialOffers;

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

	public int getDaysInTransit() {
		return daysInTransit;
	}

	public void setDaysInTransit(int daysInTransit) {
		this.daysInTransit = daysInTransit;
	}

	public Double getDeleveryCharge() {
		return deleveryCharge;
	}

	public void setDeleveryCharge(Double deleveryCharge) {
		this.deleveryCharge = deleveryCharge;
	}

	public boolean isFreeDeliveryAvailable() {
		return isFreeDeliveryAvailable;
	}

	public void setFreeDeliveryAvailable(boolean isFreeDeliveryAvailable) {
		this.isFreeDeliveryAvailable = isFreeDeliveryAvailable;
	}

	public String getHaulsAwayMessage() {
		return haulsAwayMessage;
	}

	public void setHaulsAwayMessage(String haulsAwayMessage) {
		this.haulsAwayMessage = haulsAwayMessage;
	}

	public boolean isHasSpecialOffers() {
		return hasSpecialOffers;
	}

	public void setHasSpecialOffers(boolean hasSpecialOffers) {
		this.hasSpecialOffers = hasSpecialOffers;
	}

	@Override
	public String toString() {
		return "Delivery [id=" + id + ", offerId=" + offerId + ", productId=" + productId + ", isAvailable="
				+ isAvailable + ", availableDate=" + availableDate + ", daysInTransit=" + daysInTransit
				+ ", deleveryCharge=" + deleveryCharge + ", isFreeDeliveryAvailable=" + isFreeDeliveryAvailable
				+ ", haulsAwayMessage=" + haulsAwayMessage + ", hasSpecialOffers=" + hasSpecialOffers + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((availableDate == null) ? 0 : availableDate.hashCode());
		result = prime * result + daysInTransit;
		result = prime * result + ((deleveryCharge == null) ? 0 : deleveryCharge.hashCode());
		result = prime * result + (hasSpecialOffers ? 1231 : 1237);
		result = prime * result + ((haulsAwayMessage == null) ? 0 : haulsAwayMessage.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (isAvailable ? 1231 : 1237);
		result = prime * result + (isFreeDeliveryAvailable ? 1231 : 1237);
		result = prime * result + ((offerId == null) ? 0 : offerId.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
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
		Delivery other = (Delivery) obj;
		if (availableDate == null) {
			if (other.availableDate != null)
				return false;
		} else if (!availableDate.equals(other.availableDate))
			return false;
		if (daysInTransit != other.daysInTransit)
			return false;
		if (deleveryCharge == null) {
			if (other.deleveryCharge != null)
				return false;
		} else if (!deleveryCharge.equals(other.deleveryCharge))
			return false;
		if (hasSpecialOffers != other.hasSpecialOffers)
			return false;
		if (haulsAwayMessage == null) {
			if (other.haulsAwayMessage != null)
				return false;
		} else if (!haulsAwayMessage.equals(other.haulsAwayMessage))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isAvailable != other.isAvailable)
			return false;
		if (isFreeDeliveryAvailable != other.isFreeDeliveryAvailable)
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
		return true;
	}

	public Delivery(Long id, Long offerId, Long productId, boolean isAvailable, Date availableDate, int daysInTransit,
			Double deleveryCharge, boolean isFreeDeliveryAvailable, String haulsAwayMessage, boolean hasSpecialOffers) {
		super();
		this.id = id;
		this.offerId = offerId;
		this.productId = productId;
		this.isAvailable = isAvailable;
		this.availableDate = availableDate;
		this.daysInTransit = daysInTransit;
		this.deleveryCharge = deleveryCharge;
		this.isFreeDeliveryAvailable = isFreeDeliveryAvailable;
		this.haulsAwayMessage = haulsAwayMessage;
		this.hasSpecialOffers = hasSpecialOffers;
	}

	public Delivery() {
		super();
	}
	
	
	
	   
	   
}
