package vn.edu.iuh.fit.se.thubonggiareapis.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class CartDetailPK implements Serializable{
	private Cart cart;
	private Product product;
	public CartDetailPK() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(cart, product);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartDetailPK other = (CartDetailPK) obj;
		return Objects.equals(cart, other.cart) && Objects.equals(product, other.product);
	}
	
	
}
