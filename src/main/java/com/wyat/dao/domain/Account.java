package com.wyat.dao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

	/*
	 * @Id
	 * 
	 * @GeneratedValue(generator = "UUID")
	 * 
	 * @GenericGenerator( name = "UUID", strategy =
	 * "org.hibernate.id.UUIDGenerator")
	 * 
	 * @Column(name = "user_guid", updatable = false, nullable = false) private UUID
	 * user_guid;
	 */

	@Id
	private Long mobileNum;
	private String firstName;
	private String lastName;
	private String mailId;
	private String password;
	private LocalDate accCreatedDate;
	private LocalTime accCreatedTime;
	private boolean activated;

}
