/**
 * 
 */
package com.wyat.dao.domain;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * @author mkethamr
 *
 */
@Entity
@Table(name = "CUSTOMER")
@EntityListeners(AuditingEntityListener.class)
public class CustomerEntity {
	@Id
	@SequenceGenerator(name = "mySeqGen", sequenceName = "mySeqGen", initialValue = 5, allocationSize = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mySeqGen")
	private Long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Enumerated(EnumType.STRING)
	@Column(name = "gender")
	private Gender gender;

	@Column(name = "ssn")
	private String ssn;

	@Column(name = "email_address")
	private String emailAddress;

	@Column(name = "username")
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "phone_nuber")
	private Integer phoneNuber;

	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name = "created_date")
	private java.sql.Timestamp createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	@Column(name = "modified_date")
	private java.sql.Timestamp modifiedDate;
	
	
	@OneToOne(cascade = CascadeType.ALL, targetEntity = AddressEntity.class, mappedBy = "customer_id", fetch = FetchType.LAZY)
	@JoinColumn(name = "id_customer", nullable = false)
	private AddressEntity address;
	
	 /** @see #getModificationCounter() */
	  @Version
	  private int modificationCounter;

	  /** @see #getRevision() */
	  @Transient
	  private Number revision;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	/**
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the phoneNuber
	 */
	public Integer getPhoneNuber() {
		return phoneNuber;
	}

	/**
	 * @param phoneNuber the phoneNuber to set
	 */
	public void setPhoneNuber(Integer phoneNuber) {
		this.phoneNuber = phoneNuber;
	}

	/**
	 * @return the createdDate
	 */
	public java.sql.Timestamp getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(java.sql.Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the modifiedDate
	 */
	public java.sql.Timestamp getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(java.sql.Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/**
	 * @return the address
	 */
	public AddressEntity getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(AddressEntity address) {
		this.address = address;
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
