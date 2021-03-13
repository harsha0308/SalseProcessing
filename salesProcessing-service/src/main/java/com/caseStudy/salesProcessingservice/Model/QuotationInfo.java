package com.caseStudy.salesProcessingservice.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Quote")
public class QuotationInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty(message = "name must not be empty")
	@Size(min=3,max=20)
	private String name;
	@NotEmpty(message = "address must not be empty")
	private String address;
	@NotEmpty(message = "Phone number must not be empty")
	@Pattern(regexp="(7|8|9)\\d{9}$", message="Phone number must start with 7,8 or 9 AND must be of 10 digits")
	private String contactNumber;
	@NotEmpty(message = "Email Id must not be empty")
	@Email(message = "Email should be valid")
	private String emailId;
	@NotEmpty(message = "Insurance Type must not be empty")
	private String insuranceType;
	@NotNull(message = "Cost must not be empty")
	private int cost;

	
}
