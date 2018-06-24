package com.rollingstone.spring.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "CART")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "CART_TOTAL", nullable = false)
	private Double cartTotal;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "CART_DATE", unique = true, nullable = false, length = 10)
	private Date cartDate;
	
	@OneToOne
	@JoinColumn(name="USER_PROFILE_ID")
	private User user;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getCartTotal() {
		return cartTotal;
	}

	public void setCartTotal(Double cartTotal) {
		this.cartTotal = cartTotal;
	}

	public Date getCartDate() {
		return cartDate;
	}

	public void setCartDate(Date cartDate) {
		this.cartDate = cartDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cartDate == null) ? 0 : cartDate.hashCode());
		result = prime * result + ((cartTotal == null) ? 0 : cartTotal.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Cart other = (Cart) obj;
		if (cartDate == null) {
			if (other.cartDate != null)
				return false;
		} else if (!cartDate.equals(other.cartDate))
			return false;
		if (cartTotal == null) {
			if (other.cartTotal != null)
				return false;
		} else if (!cartTotal.equals(other.cartTotal))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	public Cart(Long id, Double cartTotal, Date cartDate, User user) {
		super();
		this.id = id;
		this.cartTotal = cartTotal;
		this.cartDate = cartDate;
		this.user = user;
	}

	public Cart() {
		super();
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", cartTotal=" + cartTotal + ", cartDate=" + cartDate + ", user=" + user + "]";
	}

	

}
