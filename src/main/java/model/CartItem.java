package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import onlineShop.model.Cart;
import onlineShop.model.Product;

@Entity
@Table(name="cartitem")
public class CartItem implements Serializable {
private static final long serialVersionUID = -2455760938054036364L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private int quantity;

	private double price;

	@OneToOne
	private onlineShop.model.Product product;

	@ManyToOne
	@JsonIgnore
	private onlineShop.model.Cart cart;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public onlineShop.model.Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public onlineShop.model.Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
