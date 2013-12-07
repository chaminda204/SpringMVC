/**
 * 
 */
package com.chaminda.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author chaminda
 *         <p/>
 *         date 05/12/2013
 */
public class Student implements Identifiable<Long> {

	private static final long serialVersionUID = 3590305947568522290L;

	private Long id;
	
	@NotEmpty
	private String firstName;

	@NotEmpty
	private String lastName;

	@NotEmpty
	@Email
	private String email;

	@Range(min = 1, max = 125)
	private Integer age;
	
	@DateTimeFormat(pattern="MM/dd/yyyy")
    @NotNull
	@Past 
	private Date dateOfBirth;


	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long studentId) {
		this.id = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
