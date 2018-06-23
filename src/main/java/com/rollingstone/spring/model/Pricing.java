package com.rollingstone.spring.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "pricing")
public class Pricing {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "PCODE", nullable = false)
	private String productCode;
	
	@Column(name = "PRICE_ID", nullable = false)
	private String pricingId;
	
	@Column(name = "MEMBERTYPE", nullable = false)
	private String memberType;
	
	@Column(name = "CURRENCYCODE", nullable = false)
	private String currencyCode;
	
	@Column(name = "PRICETYPE", nullable = false)
	private String priceType;
	
	@Column(name = "LABEL", nullable = false)
	private Double discuountAmount;
	
	@Column(name = "DISPLAY", nullable = false)
	private String display;
	
	@Column(name = "ORIG_PRICE", nullable = false)
	private Double originalPrice;
	
	@Column(name = "DISC_PRICE", nullable = false)
	private Double discountedPrice;
	

	@Column(name = "STATUS", nullable = false)
	private String status;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getProductCode() {
		return productCode;
	}


	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}


	public String getPricingId() {
		return pricingId;
	}


	public void setPricingId(String pricingId) {
		this.pricingId = pricingId;
	}


	public String getMemberType() {
		return memberType;
	}


	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}


	public String getCurrencyCode() {
		return currencyCode;
	}


	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}




	public String getPriceType() {
		return priceType;
	}


	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}


	public Double getDiscuountAmount() {
		return discuountAmount;
	}


	public void setDiscuountAmount(Double discuountAmount) {
		this.discuountAmount = discuountAmount;
	}


	public String getDisplay() {
		return display;
	}


	public void setDisplay(String display) {
		this.display = display;
	}


	public Double getOriginalPrice() {
		return originalPrice;
	}


	public void setOriginalPrice(Double originalPrice) {
		this.originalPrice = originalPrice;
	}


	public Double getDiscountedPrice() {
		return discountedPrice;
	}


	public void setDiscountedPrice(Double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currencyCode == null) ? 0 : currencyCode.hashCode());
		result = prime * result + ((discountedPrice == null) ? 0 : discountedPrice.hashCode());
		result = prime * result + ((discuountAmount == null) ? 0 : discuountAmount.hashCode());
		result = prime * result + ((display == null) ? 0 : display.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((memberType == null) ? 0 : memberType.hashCode());
		result = prime * result + ((originalPrice == null) ? 0 : originalPrice.hashCode());
		result = prime * result + ((pricingId == null) ? 0 : pricingId.hashCode());
		result = prime * result + ((productCode == null) ? 0 : productCode.hashCode());
		result = prime * result + ((priceType == null) ? 0 : priceType.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Pricing other = (Pricing) obj;
		if (currencyCode == null) {
			if (other.currencyCode != null)
				return false;
		} else if (!currencyCode.equals(other.currencyCode))
			return false;
		if (discountedPrice == null) {
			if (other.discountedPrice != null)
				return false;
		} else if (!discountedPrice.equals(other.discountedPrice))
			return false;
		if (discuountAmount == null) {
			if (other.discuountAmount != null)
				return false;
		} else if (!discuountAmount.equals(other.discuountAmount))
			return false;
		if (display == null) {
			if (other.display != null)
				return false;
		} else if (!display.equals(other.display))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (memberType == null) {
			if (other.memberType != null)
				return false;
		} else if (!memberType.equals(other.memberType))
			return false;
		if (originalPrice == null) {
			if (other.originalPrice != null)
				return false;
		} else if (!originalPrice.equals(other.originalPrice))
			return false;
		if (pricingId == null) {
			if (other.pricingId != null)
				return false;
		} else if (!pricingId.equals(other.pricingId))
			return false;
		if (productCode == null) {
			if (other.productCode != null)
				return false;
		} else if (!productCode.equals(other.productCode))
			return false;
		if (priceType == null) {
			if (other.priceType != null)
				return false;
		} else if (!priceType.equals(other.priceType))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Pricing [id=" + id + ", productCode=" + productCode + ", pricingId=" + pricingId + ", memberType="
				+ memberType + ", currencyCode=" + currencyCode + ", promoDetails=" + priceType
				+ ", discuountAmount=" + discuountAmount + ", display=" + display + ", originalPrice=" + originalPrice
				+ ", discountedPrice=" + discountedPrice + ", status=" + status + "]";
	}


	public Pricing(Long id, String productCode, String pricingId, String memberType, String currencyCode,
			String promoDetails, Double discuountAmount, String display, Double originalPrice, Double discountedPrice,
			String status) {
		super();
		this.id = id;
		this.productCode = productCode;
		this.pricingId = pricingId;
		this.memberType = memberType;
		this.currencyCode = currencyCode;
		this.priceType = promoDetails;
		this.discuountAmount = discuountAmount;
		this.display = display;
		this.originalPrice = originalPrice;
		this.discountedPrice = discountedPrice;
		this.status = status;
	}


	public Pricing() {
		super();
	}

	
		
}
