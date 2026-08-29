package br.com.bigois.jpa.derivedquery.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "employees")
public class Employee {
	@Id
	private Long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "job_title")
	private String jobTitle;

	@Column(name = "login_id")
	private String loginId;

	@Column(name = "birth_date")
	private LocalDate birthDate;

	@Column(name = "marital_status")
	private String maritalStatus;

	@Enumerated(EnumType.STRING)
	@Column(name = "gender")
	private Gender gender;

	@Column(name = "hire_date")
	private LocalDate hireDate;

	@Column(name = "vacation_hours")
	private Integer vacationHours;

	@Column(name = "sick_leave_hours")
	private Integer sickLeaveHours;
}
