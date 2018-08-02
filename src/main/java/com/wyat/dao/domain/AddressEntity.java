package com.wyat.dao.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "ADDRESS")
@EntityListeners(AuditingEntityListener.class)
public class AddressEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long address_id;

	@Column(name = "address_line1")
	private String address_line1;

	@Column(name = "address_line2")
	private String address_line2;

	@Column(name = "street")
	private String street;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "pincode")
	private Integer pincode;

	@Column(name = "country")
	private String country;

	// Customer reference(Foreign Key) of the Address.
	@OneToOne
	@JoinColumn(name = "id_customer")
	private CustomerEntity customer_id;
	
	/** @see #getModificationCounter() */
	  @Version
	  private int modificationCounter;

	  /** @see #getRevision() */
	  @Transient
	  private Number revision;

	/**
	 * @return the address_id
	 */
	public Long getAddress_id() {
		return address_id;
	}

	/**
	 * @param address_id the address_id to set
	 */
	public void setAddress_id(Long address_id) {
		this.address_id = address_id;
	}

	/**
	 * @return the address_line1
	 */
	public String getAddress_line1() {
		return address_line1;
	}

	/**
	 * @param address_line1 the address_line1 to set
	 */
	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	/**
	 * @return the address_line2
	 */
	public String getAddress_line2() {
		return address_line2;
	}

	/**
	 * @param address_line2 the address_line2 to set
	 */
	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the pincode
	 */
	public Integer getPincode() {
		return pincode;
	}

	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the customer_id
	 */
	public CustomerEntity getCustomer_id() {
		return customer_id;
	}

	/**
	 * @param customer_id the customer_id to set
	 */
	public void setCustomer_id(CustomerEntity customer_id) {
		this.customer_id = customer_id;
	}

	/**
	 * @return the modificationCounter
	 */
	public int getModificationCounter() {
		return modificationCounter;
	}

	/**
	 * @param modificationCounter the modificationCounter to set
	 */
	public void setModificationCounter(int modificationCounter) {
		this.modificationCounter = modificationCounter;
	}

	/**
	 * @return the revision
	 */
	public Number getRevision() {
		return revision;
	}

	/**
	 * @param revision the revision to set
	 */
	public void setRevision(Number revision) {
		this.revision = revision;
	}
	

}
