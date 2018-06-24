package com.rollingstone.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "CART_ITEMS")
public class CartItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name = "CART_ID", nullable = false)
	private Long cartId;
	
	@Column(name = "OFFERID", nullable = false)
	private Long offerId;
	
	@Column(name = "PRODUCT_ID", nullable = false)
	private Long productId;
	
	@Column(name = "QUANTITY", nullable = false)
	private int quantity;
	
	@Column(name = "UNIT", nullable = false)
	private String unit;
	
	@Column(name = "PRICE", nullable = false)
	private Double price;
	
	@Column(name = "ITEM_TOTAL", nullable = false)
	private Double itemTotal;
	
	@Column(name = "FFM_TYPE", nullable = false)
	private String fulfillmentType;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOfferId() {
		return offerId;
	}

	
	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getItemTotal() {
		return itemTotal;
	}

	public void setItemTotal(Double itemTotal) {
		this.itemTotal = itemTotal;
	}

	public String getFulfillmentType() {
		return fulfillmentType;
	}

	public void setFulfillmentType(String fulfillmentType) {
		this.fulfillmentType = fulfillmentType;
	}

	@Override
	public String toString() {
		return "CartItem [id=" + id + ", cartId=" + cartId + ", offerId=" + offerId + ", productId=" + productId
				+ ", quantity=" + quantity + ", unit=" + unit + ", price=" + price + ", itemTotal=" + itemTotal
				+ ", fulfillmentType=" + fulfillmentType + "]";
	}

	public CartItem(Long id, Long cartId, Long offerId, Long productId, int quantity, String unit, Double price,
			Double itemTotal, String fulfillmentType) {
		super();
		this.id = id;
		this.cartId = cartId;
		this.offerId = offerId;
		this.productId = productId;
		this.quantity = quantity;
		this.unit = unit;
		this.price = price;
		this.itemTotal = itemTotal;
		this.fulfillmentType = fulfillmentType;
	}

	public CartItem() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cartId == null) ? 0 : cartId.hashCode());
		result = prime * result + ((fulfillmentType == null) ? 0 : fulfillmentType.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((itemTotal == null) ? 0 : itemTotal.hashCode());
		result = prime * result + ((offerId == null) ? 0 : offerId.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + quantity;
		result = prime * result + ((unit == null) ? 0 : unit.hashCode());
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
		CartItem other = (CartItem) obj;
		if (cartId == null) {
			if (other.cartId != null)
				return false;
		} else if (!cartId.equals(other.cartId))
			return false;
		if (fulfillmentType == null) {
			if (other.fulfillmentType != null)
				return false;
		} else if (!fulfillmentType.equals(other.fulfillmentType))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (itemTotal == null) {
			if (other.itemTotal != null)
				return false;
		} else if (!itemTotal.equals(other.itemTotal))
			return false;
		if (offerId == null) {
			if (other.offerId != null)
				return false;
		} else if (!offerId.equals(other.offerId))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (quantity != other.quantity)
			return false;
		if (unit == null) {
			if (other.unit != null)
				return false;
		} else if (!unit.equals(other.unit))
			return false;
		return true;
	}

	
	

	
	
}
