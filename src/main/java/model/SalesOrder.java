package model;

import onlineShop.model.BillingAddress;
import onlineShop.model.Cart;
import onlineShop.model.Customer;
import onlineShop.model.ShippingAddress;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="salesOrder")
public class SalesOrder implements Serializable {
private static final long serialVersionUID = -6571020025726257848L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@ManyToOne
	private onlineShop.model.Cart cart;

	@ManyToOne
	private onlineShop.model.Customer customer;

	@OneToOne
	private ShippingAddress shippingAddress;

	@OneToOne
	private BillingAddress billingAddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public onlineShop.model.Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public onlineShop.model.Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

}
