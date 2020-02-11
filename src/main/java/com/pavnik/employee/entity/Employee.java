/**
 * 
 */
package com.pavnik.employee.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author pavni
 *
 */
@Entity
@Table( name ="employee")
@Getter @Setter @EqualsAndHashCode @ToString
public class Employee implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name="id")
	@JsonInclude
	private Long id;
	
	@JsonInclude
	@Column( name = "firstname", length = 50, nullable = false)
	private String firstName;
	
	@JsonInclude
	@Column( name = "lastname", length = 50, nullable = false)
	private String lastName;
	
	@JsonInclude
	@Column( name = "email", length = 50, nullable = false)
	private String email;
	
}
