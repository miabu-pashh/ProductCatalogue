package com.nagarro.exitTest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Delivery.
 */
@Entity
@Table(name = "delivery")
public class Delivery {

	/** The pincode. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pincode;

	/** The city. */
	private String city;

	/** The Country. */
	private String Country;

	/** The delivery time. */
	private String deliveryTime;

	/**
	 * Instantiates a new delivery.
	 */
	public Delivery() {

	}

	/**
	 * Instantiates a new delivery.
	 *
	 * @param city         the city
	 * @param country      the country
	 * @param deliveryTime the delivery time
	 */
	public Delivery(String city, String country, String deliveryTime) {
		super();
		this.city = city;
		Country = country;
		this.deliveryTime = deliveryTime;
	}

	/**
	 * Gets the pincode.
	 *
	 * @return the pincode
	 */
	public Long getPincode() {
		return pincode;
	}

	/**
	 * Sets the pincode.
	 *
	 * @param pincode the new pincode
	 */
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public String getCountry() {
		return Country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country the new country
	 */
	public void setCountry(String country) {
		Country = country;
	}

	/**
	 * Gets the delivery time.
	 *
	 * @return the delivery time
	 */
	public String getDeliveryTime() {
		return deliveryTime;
	}

	/**
	 * Sets the delivery time.
	 *
	 * @param deliveryTime the new delivery time
	 */
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

}
