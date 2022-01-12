package com.nagarro.exitTest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The Class Items.
 */
@Entity
@Table(name = "items")
public class Items {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	/** The name. */
	@Column(name = "Name")
	private String name;

	/** The s discription. */
	@Column(name = "Short_Discription")
	private String sDiscription;

	/** The L discription. */
	@Column(name = "Long_Discription")
	private String LDiscription;

	/** The price. */
	@Column(name = "Price")
	private int price;

	/** The colour. */
	@Column(name = "Colour")
	private String colour;

	/** The size. */
	@Column(name = "Size")
	private String size;

	/** The image. */
	@Column(name = "Image")
	private String image;

	/**
	 * Gets the image.
	 *
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * Sets the image.
	 *
	 * @param image the new image
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the s discription.
	 *
	 * @return the s discription
	 */
	public String getsDiscription() {
		return sDiscription;
	}

	/**
	 * Sets the s discription.
	 *
	 * @param sDiscription the new s discription
	 */
	public void setsDiscription(String sDiscription) {
		this.sDiscription = sDiscription;
	}

	/**
	 * Gets the l discription.
	 *
	 * @return the l discription
	 */
	public String getLDiscription() {
		return LDiscription;
	}

	/**
	 * Sets the l discription.
	 *
	 * @param lDiscription the new l discription
	 */
	public void setLDiscription(String lDiscription) {
		LDiscription = lDiscription;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * Gets the colour.
	 *
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * Sets the colour.
	 *
	 * @param colour the new colour
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}

	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * Sets the size.
	 *
	 * @param size the new size
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * Instantiates a new items.
	 */
	public Items() {

	}

	/**
	 * Instantiates a new items.
	 *
	 * @param name         the name
	 * @param sDiscription the s discription
	 * @param lDiscription the l discription
	 * @param price        the price
	 * @param colour       the colour
	 * @param size         the size
	 * @param image        the image
	 */
	public Items(String name, String sDiscription, String lDiscription, int price, String colour, String size,
			String image) {
		super();
		this.name = name;
		this.sDiscription = sDiscription;
		LDiscription = lDiscription;
		this.price = price;
		this.colour = colour;
		this.size = size;
		this.image = image;
	}

}
