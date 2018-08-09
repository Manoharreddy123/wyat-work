/**
 * 
 */
package com.wyat.dao.domain;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.jboss.aerogear.security.otp.api.Base32;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * @author mkethamr
 *
 */
@Entity
@Table(name = "USER_ACCOUNT")
@EntityListeners(AuditingEntityListener.class)
public class User {
	@Id
	@SequenceGenerator(name = "mySeqGen", sequenceName = "mySeqGen", initialValue = 5, allocationSize = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mySeqGen")
	private Long id;

	@Column(name = "name")
	private String name;

	@Enumerated(EnumType.STRING)
	@Column(name = "gender")
	private Gender gender;

	@Column(name = "email_address")
	private String emailAddress;

	@Column(length = 60)
	private String password;

	@Column(name = "phone_nuber")
	private Integer phoneNuber;

	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name = "created_date")
	private Date createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	@Column(name = "modified_date")
	private Date modifiedDate;

	@OneToOne(cascade = CascadeType.ALL, targetEntity = AddressEntity.class, mappedBy = "customer_id", fetch = FetchType.LAZY)
	@JoinColumn(name = "id_customer", nullable = false, referencedColumnName = "id")
	private AddressEntity address;

	/** @see #getModificationCounter() */
	@Version
	private int modificationCounter;

	/** @see #getRevision() */
	@Transient
	private Number revision;

	@Column(name = "enabled")
	private boolean enabled;

	private boolean isUsing2FA;

	private String secret;

	public User() {
		super();
		this.secret = Base32.random();
		this.enabled = false;
	}

	
	public boolean isUsing2FA() {
		return isUsing2FA;
	}


	public void setUsing2FA(boolean isUsing2FA) {
		this.isUsing2FA = isUsing2FA;
	}


	public String getSecret() {
		return secret;
	}


	public void setSecret(String secret) {
		this.secret = secret;
	}


	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress
	 *            the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
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
	 * @param phoneNuber
	 *            the phoneNuber to set
	 */
	public void setPhoneNuber(Integer phoneNuber) {
		this.phoneNuber = phoneNuber;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/**
	 * @return the address
	 */
	public AddressEntity getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
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
	 * @param modificationCounter
	 *            the modificationCounter to set
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
	 * @param revision
	 *            the revision to set
	 */
	public void setRevision(Number revision) {
		this.revision = revision;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result + (enabled ? 1231 : 1237);
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (isUsing2FA ? 1231 : 1237);
		result = prime * result + modificationCounter;
		result = prime * result + ((modifiedDate == null) ? 0 : modifiedDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phoneNuber == null) ? 0 : phoneNuber.hashCode());
		result = prime * result + ((secret == null) ? 0 : secret.hashCode());
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
		User other = (User) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (enabled != other.enabled)
			return false;
		if (gender != other.gender)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isUsing2FA != other.isUsing2FA)
			return false;
		if (modificationCounter != other.modificationCounter)
			return false;
		if (modifiedDate == null) {
			if (other.modifiedDate != null)
				return false;
		} else if (!modifiedDate.equals(other.modifiedDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phoneNuber == null) {
			if (other.phoneNuber != null)
				return false;
		} else if (!phoneNuber.equals(other.phoneNuber))
			return false;
		if (secret == null) {
			if (other.secret != null)
				return false;
		} else if (!secret.equals(other.secret))
			return false;
		return true;
	}

	
}
