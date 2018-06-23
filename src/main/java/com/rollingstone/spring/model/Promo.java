package com.rollingstone.spring.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "PROMO")
public class Promo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "PCODE", nullable = false)
	private String productCode;
	
	@Column(name = "PROMOID", nullable = false)
	private String promoCode;
	
	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name = "TITLE", nullable = false)
	private String title;
	
	@Column(name = "PROMO_DETAILS", nullable = false)
	private String promoDetails;
	
	@Column(name = "DISCAMT", nullable = false)
	private Double discuountAmount;
	
	@Column(name = "DISCTYPE", nullable = false)
	private String discountType;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name = "ENDDATE", unique = true, nullable = false, length = 10)
	private Date endDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "STARTDATE", unique = true, nullable = false, length = 10)
	private Date startDate;
	
	@Column(name = "MINPURCHASEVAL", nullable = false)
	private String minimumPurchaseValue;
	
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

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPromoDetails() {
		return promoDetails;
	}

	public void setPromoDetails(String promoDetails) {
		this.promoDetails = promoDetails;
	}

	public Double getDiscuountAmount() {
		return discuountAmount;
	}

	public void setDiscuountAmount(Double discuountAmount) {
		this.discuountAmount = discuountAmount;
	}

	public String getDiscountType() {
		return discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getMinimumPurchaseValue() {
		return minimumPurchaseValue;
	}

	public void setMinimumPurchaseValue(String minimumPurchaseValue) {
		this.minimumPurchaseValue = minimumPurchaseValue;
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
		result = prime * result + ((discountType == null) ? 0 : discountType.hashCode());
		result = prime * result + ((discuountAmount == null) ? 0 : discuountAmount.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((minimumPurchaseValue == null) ? 0 : minimumPurchaseValue.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((productCode == null) ? 0 : productCode.hashCode());
		result = prime * result + ((promoCode == null) ? 0 : promoCode.hashCode());
		result = prime * result + ((promoDetails == null) ? 0 : promoDetails.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Promo other = (Promo) obj;
		if (discountType == null) {
			if (other.discountType != null)
				return false;
		} else if (!discountType.equals(other.discountType))
			return false;
		if (discuountAmount == null) {
			if (other.discuountAmount != null)
				return false;
		} else if (!discuountAmount.equals(other.discuountAmount))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (minimumPurchaseValue == null) {
			if (other.minimumPurchaseValue != null)
				return false;
		} else if (!minimumPurchaseValue.equals(other.minimumPurchaseValue))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (productCode == null) {
			if (other.productCode != null)
				return false;
		} else if (!productCode.equals(other.productCode))
			return false;
		if (promoCode == null) {
			if (other.promoCode != null)
				return false;
		} else if (!promoCode.equals(other.promoCode))
			return false;
		if (promoDetails == null) {
			if (other.promoDetails != null)
				return false;
		} else if (!promoDetails.equals(other.promoDetails))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	public Promo(Long id, String productCode, String promoCode, String name, String title, String promoDetails,
			Double discuountAmount, String discountType, Date endDate, Date startDate, String minimumPurchaseValue,
			String status) {
		super();
		this.id = id;
		this.productCode = productCode;
		this.promoCode = promoCode;
		this.name = name;
		this.title = title;
		this.promoDetails = promoDetails;
		this.discuountAmount = discuountAmount;
		this.discountType = discountType;
		this.endDate = endDate;
		this.startDate = startDate;
		this.minimumPurchaseValue = minimumPurchaseValue;
		this.status = status;
	}

	public Promo() {
		super();
	}

	@Override
	public String toString() {
		return "Promo [id=" + id + ", productCode=" + productCode + ", promoCode=" + promoCode + ", name=" + name
				+ ", title=" + title + ", promoDetails=" + promoDetails + ", discuountAmount=" + discuountAmount
				+ ", discountType=" + discountType + ", endDate=" + endDate + ", startDate=" + startDate
				+ ", minimumPurchaseValue=" + minimumPurchaseValue + ", status=" + status + "]";
	}
	
	
}
